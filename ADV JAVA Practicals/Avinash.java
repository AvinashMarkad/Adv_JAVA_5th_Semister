import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="Avinash" width=900 height=900></applet> */

public class Avinash extends Applet
{
	public void init()
	{
		this.addMouseMotionListener(new inner());
	}

	class inner extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent me)
		{
			int x=me.getX();
			int y=me.getY();
			showStatus(x+","+y);
		}
	}
}