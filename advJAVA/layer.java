import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.function.Function;
import javax.sound.sampled.*;

public class layer {
 //Player player;
 AudioInputStream audio;
 Clip clip;
 BufferedInputStream bis;
 FileInputStream fis;
 File file;
 JLabel label;
 layer(){
 JFrame main = new JFrame();
 main.setVisible(true);
 main.setSize(400,400);
 main.setLayout(new FlowLayout());
 main.setBackground(Color.MAGENTA);
 JButton choose = new JButton("Choose Your Song");
 choose.addActionListener
 (
 new ActionListener()
 {
 @Override
 public void actionPerformed(ActionEvent actionEvent)
 {
	open_dialog();
 }
 }
 );

 main.add(choose);
 JButton play = new JButton("Play");
 play.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent actionEvent) {
 try
 {
// player.play(100);
clip.start();
 }
 catch (Exception x){}
 }
 });
 main.add(play);
 JButton pause = new JButton("Pause");
 pause.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent actionEvent) {
 try
 {
 //player.wait();
 }
 catch (Exception x){}
 }
 });
	label.setBounds(100,100,200,50);
 main.add(pause);
 main.add(label);
 main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void open_dialog()
 {
 JFileChooser fc = new JFileChooser("C:/Users/marka/Music/songs/lofi songs");
 int result = fc.showOpenDialog(null);
 if (result == JFileChooser.APPROVE_OPTION)
 {
 try {
 file = new File(fc.getSelectedFile().getPath());
 fis = new FileInputStream(file);
 bis = new BufferedInputStream(fis);
 try {
	audio = AudioSystem.getAudioInputStream(fc.getSelectedFile().getAbsoluteFile());
	clip = AudioSystem.getClip();
	clip.open(audio);
	clip.loop(Clip.LOOP_CONTINUOUSLY);
	clip.start();
 //player = new Player(fis);
	label = new JLabel();
 label.setText("reut");

 }
 catch (Exception ec){}
 }
 catch(IOException e)
 {
 e.printStackTrace();
 }
 }
 }
 public static void main(String[] args)
 {
	new layer();
 }
}