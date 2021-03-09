package assign;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class balance extends JFrame implements ActionListener{
	public JButton b1,b2;
	public JTextField t1;
	public JLabel l1,l2,l3,l4;
	int a=30;
	balance(){
		
		l1=new JLabel("Want To Add Balance?");
		l1.setBounds(60,10,300,50);
		l1.setFont(new Font("Arial Black",Font.BOLD,20));
		
		l2 = new JLabel("Current Balance:");
		l2.setBounds(40,70,150, 30);
		l2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		l4 = new JLabel("30");
		l4.setBackground(new Color(204, 204, 255));
		l4.setBounds(170,73, 100, 20);
		
		l3 = new JLabel("Amount want to add :");
		l3.setBounds(40,110,150,30);
		l3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		t1= new JTextField();
		t1.setBackground(new Color(204, 204, 255));
		t1.setBounds(200, 114, 100, 20);
		
		b1=new JButton("Add");
		b1.setBounds(190,180,100,20);
		
		b2=new JButton("Back");
		b2.setBounds(30,180,100,20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(l1);
		add(l2);
		add(l4);
		add(l3);
		add(t1);
		add(b1);
		add(b2);
	setLayout(null);
	setTitle("Balance");
	setVisible(true);
	setBounds(0,0,400,300);

}
	public static void main(String[] args) {
		new balance();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			int b=a+Integer.parseInt(t1.getText());
			JOptionPane.showMessageDialog(null,"Balance added \n Now balance is: "+b);
			this.setVisible(false);
		}
		if(e.getSource()==b2) {
			new first();
		}
		
	}
}
