import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Main extends JFrame implements ActionListener {

    JLabel songName, songDuration;
    JButton chooseFile, playMusic, pauseMusic, restartMusic;
    JFileChooser fileChooser;
    AudioInputStream audio;
    AudioFormat audioFormat;
    Clip clip;
    long clipTime, length;
    int frameSize;
    float frameRate, duration;
    String songName1;

    public Main() {
        setTitle("Music Player");
        setSize(new Dimension(500,300));
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        chooseFile = new JButton("Choose a Song");
        songName = new JLabel("Song not selected Yet !");
        songDuration =new JLabel();
        playMusic = new JButton("Play");
        restartMusic = new JButton("Restart");
        pauseMusic = new JButton("Pause");
        fileChooser = new JFileChooser();


        chooseFile.addActionListener(this);
        pauseMusic.addActionListener(this);
        playMusic.addActionListener(this);
        restartMusic.addActionListener(this);


        songName.setBounds(50,20,400,20);
        songDuration.setBounds(50,60,400,20);
        chooseFile.setBounds(50,100,400,50);
        playMusic.setBounds(50, 200, 100, 30);
        pauseMusic.setBounds(200, 200, 100, 30);
        restartMusic.setBounds(350,200,100,30);

        add(chooseFile);
        add(songName);
        add(songDuration);
        add(playMusic);
        add(pauseMusic);
        add(restartMusic);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == chooseFile) {
            try {
                playMusic();
            } catch (UnsupportedAudioFileException | InterruptedException | LineUnavailableException | IOException ex) {
                ex.printStackTrace();
            }
        } else
            if(e.getSource() == pauseMusic) {
            pauseMusic();
        } else
            if(e.getSource() == playMusic) {
            playAfterPause();
        } else
            if(e.getSource() == restartMusic) {
            restartMusic();
        }
    }

    public File selectedFile() {
        fileChooser.showOpenDialog(fileChooser);
        songName1 = String.valueOf(fileChooser.getSelectedFile());
        if(clip!=null) {
            clip.close();
        }
        return fileChooser.getSelectedFile();
    }

    public void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        audio = AudioSystem.getAudioInputStream(selectedFile());
        clip = AudioSystem.getClip();
        clip.open(audio);
        clip.start();
        songName.setText(songName1);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void pauseMusic() {
        clipTime = clip.getFramePosition();
        clip.stop();
    }

    public void playAfterPause() {

        clip.setFramePosition((int) clipTime);
        clip.start();
    }

    public void restartMusic() {
        clip.setFramePosition(0);
        clip.start();
    }

    public String[] info(){
        length = fileChooser.getSelectedFile().length();
        audioFormat = audio.getFormat();
        frameSize = audioFormat.getFrameSize();
        frameRate =  audioFormat.getFrameRate();
        frameRate = audio.getFrameLength();
        duration = (float) ((frameRate + 0.0) / audioFormat.getFrameRate());
        return new String[]{
                String.valueOf(length),
                String.valueOf(audioFormat),
                String.valueOf(frameSize),
                String.valueOf(frameRate),
                String.valueOf(duration)
        };
    }

    public static void main(String[] args) {
        new Main();
    }
}