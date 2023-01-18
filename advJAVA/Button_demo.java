import java.awt.*;

public class Button_demo
{
 public static void main(String args[])
 {
  Frame f1=new Frame();
  Button b1=new Button("click me");
  b1.setBounds(50,100,80,30);
  
  f1.add(b1);
  f1.setTitle("Frame");
  f1.setBackground(Color.red);
  f1.setLayout(null);
  f1.setVisible(true);
  f1.setSize(1200,1200);
  
 }
}