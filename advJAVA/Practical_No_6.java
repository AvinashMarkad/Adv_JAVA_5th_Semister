import java.awt.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.tree.*;

/*<Applet code="Practical_No_6" width=900 height=800></Applet>*/

public class Practical_No_6 extends JApplet
{
 JTree tree;
  public void init()
  {
   Container ContentPane=getContentPane();
   ContentPane.setLayout(new BorderLayout());
   DefaultMutableTreeNode top=new DefaultMutableTreeNode("India");
   DefaultMutableTreeNode maha=new DefaultMutableTreeNode("Maharashtra");
   top.add(maha);
   DefaultMutableTreeNode mum=new DefaultMutableTreeNode("Mumbai");
   maha.add(mum);
   DefaultMutableTreeNode pune=new DefaultMutableTreeNode("Pune");
   mum.add(pune);
   DefaultMutableTreeNode nashi=new DefaultMutableTreeNode("Nashik");
   pune.add(mum);
   DefaultMutableTreeNode nag=new DefaultMutableTreeNode("Nagpur");
   mum.add(nag);
   DefaultMutableTreeNode guj=new DefaultMutableTreeNode("Gujrat");
   nag.add(guj);
   
   tree=new JTree(top);
   int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
   int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
   
   JScrollPane jsp=new JScrollPane(tree,v,h);
   ContentPane.add(jsp,BorderLayout.CENTER);
  }
}