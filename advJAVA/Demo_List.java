import java.awt.*;
import java.applet.*;

public class Demo_List extends Applet
{
 List l1;
 
 public void init()
 {
  l1=new List();
  l1.add("Summer");
  l1.add("Winter");
  l1.add("Rainy");
  
  add(l1);
 }
}
/*<Applet code="Demo_List" width=1000 height=1200></Applet>*/