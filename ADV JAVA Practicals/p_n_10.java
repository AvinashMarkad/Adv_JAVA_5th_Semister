import java.awt.*;
import java.awt.event.*;

public class pn_10 extends Frame implements KeyListener{
	public static void main(String args[]){
		int x=20,y=30;
		String msg="keyEvents";
		
		addKeyListener(this);
		requestFocus();
		setBackground(Color.green);
		setForeground(Color.blue);
		
		public void keyPressed(KeyEvent k){
			showStatus("KeyDown");
			int key=k.getKeyCode();
			
			switch(key){
				case KeyEvent.VK_UP:
				showStatus("Move to up");
				break;
				
				case KeyEvent.VK_Down:
				showStatus("Move to down");
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
		public void KeyReleased(KeyEvent k){
			showStatus("Key up");
		}
		public void KeyTyped(KeyEvent k){
			msg+=k.getKeyChar();
			repaint();
		}
		public void paint(Graphics g){
			g.drowSring(msg,x,y);
		}
	}
}