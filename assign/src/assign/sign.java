package assign;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;
public class sign extends JFrame implements ActionListener{
	public JButton b1,b2;
	public JLabel l1,l2,l3;
	public JTextField t1,t2;
	public int a;
	sign(){
		Random random=new Random();
		a=random.nextInt(10000);
		
		l1=new JLabel("Want to Create Account?");
		l1.setBounds(60,10,300,50);
		l1.setFont(new Font("Arial Black",Font.BOLD,20));
		
		l2 = new JLabel("Name");
		l2.setBounds(40,70, 61, 30);
		l2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

	    t1 = new JTextField();
		t1.setBackground(new Color(204, 204, 255));
		t1.setBounds(170,73, 100, 20);
		
		l3 = new JLabel("Phone Number");
		l3.setBounds(40,110,150,30);
		l3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));

		t2= new JTextField();
		t2.setBackground(new Color(204, 204, 255));
		t2.setBounds(170, 113, 100, 20);
		
		b1=new JButton("Create");
		b1.setBounds(190,180,100,20);
		
		b2=new JButton("Back");
		b2.setBounds(30,180,100,20);
		
		add(t2);
		add(l2);
		add(l3);
		add(t1);
		add(l1);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(null);
		setTitle("Signin");
		setVisible(true);
		setBounds(0,0,400,300);
		
	}
	public static void main(String[] args) {
		new sign();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String name=t1.getText();
			String phone=t2.getText();
			if(name.trim().isEmpty()||phone==null) {
				JOptionPane.showMessageDialog(null,"Enter Valid Entries!!");				
			}
			else {
			JOptionPane.showMessageDialog(null,"Account Created!!");
			JOptionPane.showMessageDialog(null,"Your Card Number is: "+a);
			new login();
			this.setVisible(false);
		}		
			}
		else {
			new login();
			this.setVisible(false);
		}
		
	}
	

}
