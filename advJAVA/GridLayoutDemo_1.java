import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GridLayoutDemo_1 extends Applet implements ActionListener
{
 Checkbox ch1,ch2,ch3,ch4;
 Panel p1;
 CardLayout c1;
 Button b1,b2;
 
 public void init()
 {
  b1=new Button("Colours");
  b2=new Button("Flevours");
  add(b1);
  add(b2);
  
  c1=new CardLayout();
  p1=new Panel();
  p1.setLayout(c1);
  
  ch1=new Checkbox("Blue");
  ch2=new Checkbox("Red");
  ch3=new Checkbox("Vanila");
  ch4=new Checkbox("Strowberry");
  
  Panel p2=new Panel();
        p2.add(ch1);
		p2.add(ch2);
		
  Panel p3=new Panel();
        p3.add(ch3);
        p3.add(ch4);
  
  p1.add(p2,"Colours");
  p1.add(p3,"Flevours");
  add(p1);

  b1.addActionListener(this);  
  b2.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==b1)
  {
   c1.show(p1,"Colours");
   }else{
    c1.show(p1,"Flevours");   
   }
 }
}

/*<Applet code="GridLayoutDemo_1" width=500 height=600></Applet>*/