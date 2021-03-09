package assign;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.*;
public class first3 extends JFrame implements ActionListener{
	public JLabel l2,l3,l4;
	public JButton b1,b2,b3;
	public String s1;
	public int a=70;
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	 int day= calendar.get(Calendar.DAY_OF_WEEK);
	

	first3(){
		if(a>10) {
		if(day>=1&& day<=5) {
			a=a-10;
		}
		else{
			a=a-20;
		}
		s1=Integer.toString(a);
		JLabel l1=new JLabel("G4");
		l1.setBounds(200,10,300,50);
		l1.setFont(new Font("Arial Black",Font.BOLD,20));
		add(l1);
	l2 = new JLabel("Current Balance:");
	l2.setBounds(40,70,150, 30);
	l2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
	
	l4 = new JLabel(s1);
	l4.setBackground(new Color(204, 204, 255));
	l4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
	l4.setBounds(170,73, 100, 20);
	
	l3 = new JLabel("Want to play more?");
	l3.setBounds(40,110,150,30);
	l3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
	
	b1=new JButton("yes");
	b1.setBounds(150,180,100,20);
	
	b2=new JButton("no");
	b2.setBounds(30,180,100,20);
	
	b3=new JButton("Add Balance");
	b3.setBounds(275,180,150,20);
	
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
	setTitle("first3");
	setVisible(true);
	setBounds(0,0,500,300);
		}
	else {
		JOptionPane.showMessageDialog(null,"Insufficient Balance");
		this.setVisible(false);
		new exit0();
		
		
	}
	

}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) {
			new second();
			this.setVisible(false);
		}
		if(a>10) {
			if(e.getSource()==b1) {	
					this.setVisible(false);
					new first4();
			}
			}
			else {			
					if(e.getSource()==b1) {
						JOptionPane.showMessageDialog(null,"Insufficient Balance");
						this.setVisible(false);
						new login();
					}
					
				}	
		if(e.getSource()==b3) {
			new balance();
		}
		
		
	}
}

