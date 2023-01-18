import java.awt.*;
import java.applet.*;

public class Prac_no_3 extends Applet
{
 int r=0;
 
 public void init()
  {
	setFont(new Font("SansSerif",Font.BOLD,24));
    setLayout(new GridLayout(5,5));
	for(int i=0;i<=9;i++)
	 {
	   add(new Button(" "+i)); 
	 }
	 Button b1=new Button("/");
	 Button b2=new Button("*");
	 Button b3=new Button("-");
	 Button b4=new Button("+");
	 Button b5=new Button("=");
	 Button b6=new Button("%");
	 
	 add(b1);
	 add(b2);
	 add(b3);
	 add(b4);
	 add(b5);
	 add(b6);
  }
}

/*<applet code="Prac_no_3" width=900 height=1000></applet>*/