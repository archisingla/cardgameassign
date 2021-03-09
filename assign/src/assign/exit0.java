package assign;
import java.awt.*;
import javax.swing.*;
public class exit0 extends JFrame{
	public JLabel l1,l2,l4;
	exit0(){
		
		l1=new JLabel("Thank You");
		l1.setBounds(70,10,300,50);
		l1.setFont(new Font("Arial Black",Font.BOLD,20));
		
		l2 = new JLabel("You can swipe out your card");
		l2.setBounds(40,70,300, 30);
		l2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		
		add(l1);
		add(l2);
		setLayout(null);
		setTitle("second");
		setVisible(true);
		setBounds(0,0,500,300);
		setLayout(null);
		setTitle("exit");
		setVisible(true);
		setBounds(0,0,300,200);
	}
	public static void main(String[] args) {
		new exit0();
	}

}
