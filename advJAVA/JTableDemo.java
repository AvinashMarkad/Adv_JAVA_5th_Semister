import javax.swing.*;
 
public class JTableDemo extends JFrame
{  
  public JTableDemo() 
  { 
   JFrame f =new JFrame(); 
   String rows[][]={ {"10", "Asmita", "56000"}, 
                     {"11", "Soniya","58900"}, 
                     {"11" ,"Saniya","70000"} 
                    }; 
    String columns []={"ID","NAME","SALARY"};
	
   JTable jt=new JTable(rows,columns); 
   jt.setBounds(30,40,200,300); 
   JScrollPane sp=new JScrollPane(jt); 
   f.add(sp); 
   f.setSize(300,400); 
   f.setVisible(true); 
 }
 public static void main(String args[]) 
 { 
  JTableDemo j=new JTableDemo(); 
 }
}