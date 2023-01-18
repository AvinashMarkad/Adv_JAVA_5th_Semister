import javax.swing.*; 
public class JFrameDemo extends JFrame 
{ 
public JFrameDemo() 
{ 
String country[]= {"India", "Aus", "U.S.A", "England", "Newzeland"}; 
JComboBox cb = new JComboBox(country); 
cb.setBounds(50, 50, 90, 20); 
add(cb); 
setLayout(null); 
setSize(400,500); 
setVisible(true); 
}
public static void main(String args[]) 
{ 
new JFrameDemo(); 
}
}