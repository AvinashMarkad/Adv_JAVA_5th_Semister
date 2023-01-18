import java.awt.*;
import java.applet.*;
import javax.swing.*;
/*<applet code =JComboBoxDemo height=400 width=300></applet> */
public class JComboBoxDemo extends JApplet
{
 public void JComboBox()
 {
  Container ct= getContentPane();
  ct.setLayout(null);
  JLabel j1=new JLabel("select Language");
  
  setLayout(new BorderLayout()); 
   JPanel jp = new Panel(); 
   jp .setLayout(new GridLayout(10, 10)); 
   int b = 0;
   
    for (int i = 0; i < 10; i++) 
   { 
     for (int j = 0; j < 10; j++) 
	  { 
       jp.add(new JButton("Button " + b)); 
       ++b; 
	   }
	   }
  
  JComboBox jc=new JComboBox();
  jc.addItem("English");
  jc.addItem("Hindi");
  jc.addItem("marathi");
  jc.addItem("Sanskrit");
  
  ct.add(j1);
  ct.add(jc);
  
  j1.setBounds(30,50,100,30);
  jc.setBounds(100,500,150,30);
  
   int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED; 
       int h = ScrollPaneConstants.HORIZONTAL_SCRDLLBAR_AS_NEEDED; 
       JScrollPane jsp = new JScrollPane(jp, v, h); 
       add(jsp, Borderlayout.CENTER); 
  }
}