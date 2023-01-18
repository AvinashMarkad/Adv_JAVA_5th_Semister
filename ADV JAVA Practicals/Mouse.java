import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<Applet code="Mouse" width=600 height=600></Appplet>*/

public class Mouse extends Applet implements MouseListener
{
	String str="See your event here";
	
	public void init()
	{
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
	}
	
	public void mouseEntered(MouseEvent me)
	{
		str="Mouse Entered";
		repaint();
	}
	
	public void mouseExited(MouseEvent me)
	{
		str="Mouse Exited";
		repaint();
	}
	
	public void mouseClicked(MouseEvent me)
	{
		str="Mouse clicked";
		repaint();
	}
	
	public void mousePressed(MouseEvent me)
	{
		str="Mouse Pressed";
		repaint();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		str="Mouse Released";
		repaint();
	}
}