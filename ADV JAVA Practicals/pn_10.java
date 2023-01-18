import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public void Practical_10 extends Applet implements KeyListener{
	
	int x=20,y=30;
	String msg="Key Events";
	
	public void init(){
		
		addKeyListener(this);
		requestFocus();
		setForeground(Color.red);
		
	}
	
	public void keyPressed(KeyEvent k){
		
		showStatus("KeyDown");
		int key=k.getKeyCode();
		
		switch(key){
			
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
	
	public void keyRelesed(keyEvent k){
		
		showStatus("Key Up");
		
	}
	
	public void keyTyped(keyEvent k){
		
		msg+=k.getKeyChar();
		repaint();
		
	}
	
	public void paint(Graphics g){
		
		g.drowString(msg,x,y);
		
	}
	
}

/* <Applet code="Practical_10" width=900 height=900></Applet> */