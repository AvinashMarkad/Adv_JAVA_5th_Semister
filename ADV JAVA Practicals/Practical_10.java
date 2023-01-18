import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="Practical_10" width=900 height=900></applet> */

public class Practical_10 extends Applet implements KeyListener
{
	
	int x=20,y=30;
	String msg="KeyEvents";
	
	public void init()
	{
		
		addKeyListener(this);
		requestFocus();
		//setBackground(Color.green);
		//setForeground(Color.red);
		
	}
	
	public void keyPressed(KeyEvent k)
	{
		
		showStatus("KeyDown");
		int key=k.getKeyCode();
		
		switch(key)
		{
			
			case KeyEvent.VK_UP:
			showStatus("Move to up");
			break;
			
			case KeyEvent.VK_DOWN:
			showStatus("Move to Down");
			break;
			
			case KeyEvent.VK_LEFT:
			showStatus("Move to left");
			break;
			
			case KeyEvent.VK_RIGHT:
			showStatus("Move to Right");
			break;
		}
		
		repaint();
		
	}
	
	public void keyReleased(KeyEvent k)
	{
		
		showStatus("Key Up");
		
	}
	
	public void keyTyped(KeyEvent k)
	{
		
		msg+=k.getKeyChar();
		repaint();
		
	}
	
	public void paint(Graphics g)
	{
		
		g.drawString(msg,x,y);
		
	}
	
}