import java.awt.*;
import java.awt.event.*;

public class Practical13 {
	Frame frame;
	Practical13() {
		frame = new Frame();
		frame.setSize(400,400);
		frame.addWindowListener(new WindowAdapter	(){
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new Practical13();
	}
}