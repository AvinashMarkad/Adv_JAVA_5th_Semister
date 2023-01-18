import java.io.*;
import java.net.*;
import javax.swing.*;

public class Practical14 {
	JFrame frame;
	JLabel label1,label2;
	Practical14() {
		frame = new JFrame();
		label1 = new JLabel();
		label2 = new JLabel();
		
		try{
			InetAddress inetAdress =  InetAddress.getByName("localhost");
			label1.setText("Host Name: " + inetAdress.getHostName());
			label2.setText("Host Address: " + inetAdress.getHostAddress());
		}
		catch(Exception e){
			System.out.println(e);
		}
		frame.add(label1);
		frame.add(label2);
		label1.setBounds(20,20,300,50);
		label2.setBounds(20,100,300,50);
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new Practical14();
	}
}