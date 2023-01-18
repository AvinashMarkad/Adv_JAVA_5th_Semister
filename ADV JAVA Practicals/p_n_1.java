import java.awt.*;

public class p_n_1{
	public static void main(String args[]){
		Frame frame=new Frame();

		Label l1;
		TextField tf1;
		TextArea ta1;
		Button btn1;
		Checkbox cb1,cb2,cb3,cb4;
		Checkbox r1,r2,r3;
		CheckboxGroup cbg=new CheckboxGroup();

		l1=new Label("Survy Form");
		l1.setBounds(100,100,200,100);

		tf1=new TextField(5);
		tf1.setBounds(100,200,200,100);

		ta1=new TextArea(5,20);
		ta1.setBounds(100,300,200,100);

		cb1=new Checkbox("JAVA");
		cb1.setBounds(100,390,200,100);

		cb2=new Checkbox("PHYTHON");
		cb2.setBounds(100,460,200,100);

		cb3=new Checkbox("C++ LANGUAGE");
		cb4=new Checkbox("C LANGUAGE");

		r1=new Checkbox("Male",cbg,true);
		r2=new Checkbox("Female",cbg,false);
		r3=new Checkbox("Other",cbg,false);

		btn1=new Button("Submit Feedback");
		btn1.setBounds(50,100,80,30);

		frame.add(l1);
		frame.add(tf1);
		frame.add(ta1);

		frame.add(cb1);
		frame.add(cb2);
		frame.add(cb3);
		frame.add(cb4);

		frame.add(r1);
		frame.add(r2);

		frame.add(btn1);

		frame.setSize(500,600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}