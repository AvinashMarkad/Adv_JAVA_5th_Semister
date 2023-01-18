import java.awt.*;
import java.applet.*;

public class Pra_No_1 extends Applet
{
 Checkbox c1,c2,c3,c4;
 Checkbox r1,r2;
 CheckboxGroup cgb=new CheckboxGroup();
 
 public void init()
 {	 
  c1=new Checkbox("JAVA");
  c2=new Checkbox("CPP");
  c3=new Checkbox("PYTHON");
  c4=new Checkbox("C");
  
  add(c1);
  add(c2);
  add(c3);
  add(c4);
  
  r1=new Checkbox("True",cgb,true);
  r2=new Checkbox("False",cgb,false);
  add(r1);
  add(r2);
 }
}

/*<applet code="Pra_No_1" width=1000 height=1000></applet>*/

