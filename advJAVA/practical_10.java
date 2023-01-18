import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=practical_10 width=300 height=400>
</applet>*/
public class practical_10 extends Applet implements KeyListener
 {
  int x=20,y=30;
  String msg="keyEvents";
  public void init()
 {
     addKeyListener(this);
     requestFocus();
     setBackground(Color.green);
     setForeground(Color.blue);
  }
    public void keyPressed(KeyEvent k)
    {
    showStatus("keyDown");
    int key = k.getKeyCode();
    switch(key)
     {
     case KeyEvent.VK_UP:
         showStatus("Move to Up");
    break;
    case KeyEvent.VK_DOWN:
       showStatus("Move to DOWN");
   break;
   case KeyEvent.VK_LEFT:
     showStatus("Move to LEFT");
  break;
    case KeyEvent.VK_RIGHT:
        showStatus("Move to RIGHT");
   break;
  }
  repaint();
 }
  public void keyReleased(KeyEvent k)
 {
  showStatus("key up");
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