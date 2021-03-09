package assign;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
public class first extends JFrame implements ActionListener{
	public JLabel l1,l2,l3,l4;
	public JButton b1,b2,b3;
	int a;
	String s;
	 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	 int day= calendar.get(Calendar.DAY_OF_WEEK);
	first(){
		l1=new JLabel("G1");
		l1.setBounds(200,10,300,50);
		l1.setFont(new Font("Arial Black",Font.BOLD,20));
		//Date ob=new Date();
		//SimpleDateFormat ob1=new SimpleDateFormat("E");
		//System.out.println(ob1.format(ob));
		a=90;
		s=Integer.toString(a);
		
		
		l2 = new JLabel("Current Balance:");
		l2.setBounds(40,70,150, 30);
		l2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		l4 = new JLabel(s);
		l4.setBackground(new Color(204, 204, 255));
		l4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		l4.setBounds(170,73, 100, 20);
		
		l3 = new JLabel("Want to play?");
		l3.setBounds(40,110,150,30);
		l3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		b1=new JButton("yes");
		b1.setBounds(150,180,100,20);
		
		b2=new JButton("no");
		b2.setBounds(30,180,100,20);
		b3=new JButton("Add Balance");
		b3.setBounds(275,180,150,20);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	
		setLayout(null);
		setTitle("first");
		setVisible(true);
		setBounds(0,0,500,300);
		
	}
	public static void main(String[] args) {
		new first();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			new second();
			this.setVisible(false);
		}
		if(e.getSource()==b1) {	
				this.setVisible(false);
				new first1();
		}	
		if(e.getSource()==b3) {
			new balance();
		}
		
	}
}
