import java.awt.*;
import java.applet.*;

public class Prac_no_1_2 extends Applet
{
 TextField tx;
 TextArea ta;
 Button b1;
 //Label l1;
 
 public void init()
 {
  tx=new TextField(20);
  ta=new TextArea(5,25);
  b1=new Button("Click me");
  //l1=new Label("TextArea,TextField,Button");
  
  //add(l1);
  add(tx);
  add(ta);
  add(b1);
 }
} 

/*<applet code="Prac_no_1_2" width=1000 height=1000></applet>*/