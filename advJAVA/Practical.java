import java.awt.*;
import java.applet.*;
import javax.swing.*;
/*<applet code = "JComboBoxDemo" height=400 width=300></applet> */
public class JComboBoxDemo extends JApplet
{
 public JComboBox()
 {
  Container ct= getContentPane();
  ct.setLayout(null);
  JLabel j1=new JLabel("select Language");
  
  JComboBox jc=new JComboBox();
  jc.addItem("English");
  jc.addItem("Hindi");
  jc.addItem("marathi");
  jc.addItem("Sanskrit");
  
  ct.add(j1);
  ct.add(jc);
  
  j1.setBounds(30,50,100,30);
  jc.setBounds(100,500,150,30);
  }
}