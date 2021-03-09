package assign;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
	public JButton b1,b;
	public JLabel l1,l2;
	public JTextField t1;
	public int m=90;
	public String s=Integer.toString(m);
	login(){
		
		l2=new JLabel("Want To Play Game?");
		l2.setBounds(75,10,300,50);
		l2.setFont(new Font("Arial Black",Font.BOLD,20));
		
		l1=new JLabel("Enter your card number");
		l1.setBounds(20,70,200,50);
		l1.setFont(new Font("Lucida Grande",Font.ITALIC,15));
		
		t1=new JTextField();
		t1.setBounds(200,90,100,20);
		
		b=new JButton("Login");
		b.setBounds(10,140,150,20);
		b1=new JButton("Create a Card");
		b1.setBounds(180,140,150,20);
		
		
		
		add(b);
		add(b1);
		add(l1);
		add(l2);
		add(t1);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		setLayout(null);
		setTitle("Gaming Card");
		setVisible(true);
		setBounds(0,0,400,300);
	}
	public static void main(String[] args) {
		new login();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			new first();
		}
		if(e.getSource()==b1) {
			new sign();
			
		}
		
	}

}
