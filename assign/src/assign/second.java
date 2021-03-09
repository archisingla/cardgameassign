package assign;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
public class second extends JFrame{
	public JLabel l1,l2,l4;
	second(){
		
		l1=new JLabel("Swipe Out your Card");
		l1.setBounds(70,10,300,50);
		l1.setFont(new Font("Arial Black",Font.BOLD,20));
		
		l2 = new JLabel("Balance:is");
		l2.setBounds(40,70,150, 30);
		l2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		l4 = new JLabel();
		
		l4.setBounds(170,73, 100, 20);
		add(l1);
		add(l2);
		add(l4);
		setLayout(null);
		setTitle("second");
		setVisible(true);
		setBounds(0,0,500,300);
		
	}


public static void main(String[] args) {
	
}

}
