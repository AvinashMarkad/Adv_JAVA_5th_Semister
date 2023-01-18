import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
 /* <applet code="Pract11" width="300" height="300">
</applet>*/
public class Pract11 extends Applet implements MouseListener
{
 String s="see your event here";
 public void init()
  {
 this.addMouseListener(this);
    }
   public void paint(Graphics g)
  {
   g.drawString(s,100,100);
}
  public void mouseEntered(MouseEvent me)
  {
   s="Mouse Entered";
    repaint();
  }
  public void mouseExited(MouseEvent me)
  {
   s="Mouse Exited";
    repaint();
  }
 public void mouseClicked(MouseEvent me)
  {
   s="Mouse Clicked";
    repaint();
  }
  public void mousePressed(MouseEvent me)
  {
   s="Mouse Pressed";
    repaint();
  }
  public void mouseReleased(MouseEvent me)
  {
   s="Mouse Released";
    repaint();
  }
}
