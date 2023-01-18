import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<Applet code=Cardlayoutdemo width=600 height=900></Applet>*/

 public class Cardlayoutdemo extends Applet implements ActionListener
 {
  Checkbox ch1,ch2,ch3,ch4;
  Panel p1;
  CardLayout c1;
  Button b1,b2;

  public void init()
  {
  b1=new Button("colors");
  b2=new Button("flavours");
  add(b1);
  add(b2);
  
  c1=new CardLayout();
  p1=new Panel();
 
  p1.setLayout(c1);
  
  ch1=new Checkbox("Blue");
  ch2=new Checkbox("red");
  ch2=new Checkbox("Vanilla");
  ch2=new Checkbox("Strawberry");

   Panel p2=new Panel();
   p2.add(ch1);
   p2.add(ch2);

   Panel p3=new Panel();
   p3.add(ch3);
   p3.add(ch4);
  
   add(p1);

   b1.addActionListener(this);
   b2.addActionListener(this);
}
  public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==b1)
 {
  c1.show(p1,"colors");
 }
 else
{
 c1.show(p1,"flavours");
  }
 }
}