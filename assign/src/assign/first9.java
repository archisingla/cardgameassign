package assign;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.*;
public class first9 extends JFrame implements ActionListener{
	public JLabel l2;
	public JButton b1;
	public int a=10;
	public String s;
	Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	 int day= calendar.get(Calendar.DAY_OF_WEEK);

		first9(){
		if(a>10) {
			if(day>=1&& day<=5) {
				a=a-10;
			}
			else{
				a=a-20;
			}
			s=Integer.toString(a);
			JLabel l1=new JLabel("G10");
			l1.setBounds(200,10,300,50);
			l1.setFont(new Font("Arial Black",Font.BOLD,20));
			add(l1);
	
	l2 = new JLabel("Enjoy Game");
	l2.setBounds(40,70,150, 30);
	l2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));	
	b1=new JButton("Exit");
	b1.setBounds(30,180,100,20);	
	add(b1);	
	b1.addActionListener(this);
	setLayout(null);
	setTitle("first9");
	setVisible(true);
	setBounds(0,0,500,300);
		}
		else {
			JOptionPane.showMessageDialog(null,"Insufficient Balance");
			this.setVisible(false);
			new exit0();	
		}
}
	public static void main(String[] args) {
		new first9();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			this.setVisible(false);
			new exit0();
		}
		
	}
}

