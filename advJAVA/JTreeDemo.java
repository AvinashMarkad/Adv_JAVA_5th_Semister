import java.awt.*; 
import javax.swing.*; 
import javax.swing.tree.DefaultMutableTreeNode; 

public class JTreeDemo 
{ 
 JTree tree; 
 JFrame f; 
 JTreeDemo() 
  { 
    f =new JFrame(); 
    f.setLayout(new BorderLayout()); 
 
    DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options"); 
    DefaultMutableTreeNode a=new DefaultMutableTreeNode("Saniya"); 
    top.add(a); 
    DefaultMutableTreeNode b=new DefaultMutableTreeNode("Gadhave"); 
    top.add(b); 
 
    DefaultMutableTreeNode al=new DefaultMutableTreeNode("Red"); 
    a.add(al); 
    DefaultMutableTreeNode a2=new DefaultMutableTreeNode("Pink"); 
    a.add(a2); 
 
    DefaultMutableTreeNode bl=new DefaultMutableTreeNode("Apple_1"); 
    b.add(bl); 
    DefaultMutableTreeNode b2=new DefaultMutableTreeNode("Apple_2"); 
    b.add(b2); 
    DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Strowbery"); 
    b.add(b3); 
	
    tree = new JTree(top); 
    JScrollPane jsp = new JScrollPane(tree); 
    f.add(jsp, BorderLayout.CENTER); 
    f.setSize(500,500); 
    f.setVisible(true);
    } 
     public static void main(String args[]) 
     { 
      JTreeDemo jl=new JTreeDemo(); 
     }
}