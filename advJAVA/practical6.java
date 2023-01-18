import javax.swing.*;
import java.awt.*;

public class JComboBoxDemo extends JFrame
{
	public JComboBoxDemo()
	{
       Container ct=getContentPane();
           ct.setLayout(null);
	JLabel jl=new JLabel("Select Language");

    JComboBox jc=new JComboBox();
    jc.addItem("English");
	jc.addItem("Marathi");
	jc.addItem("Hindi");
	jc.addItem("Sanskrit");
	
	ct.add(jl);
	ct.add(jc);
	
	jl.setBounds(30,50,100,30);
	jc.setBounds(150,50,100,30);
	
	}
public static void main(String args[])
{
	JComboBoxDemo p=new JComboBoxDemo();
	p.setTitle("ComboBox");
	p.setSize(300,400);
	p.setVisible(true);
}
}