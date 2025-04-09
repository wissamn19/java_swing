package IHM;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame2 {
	
	public static void main(String[]  args) {
		JFrame F = new JFrame("Main Frame");
		F.setSize(400,200);
		
		JLabel L1 = new JLabel("Welcome To Swing:");
		L1.setLabelFor(L1);
	     L1.setBounds(390,25,200,200);
	     F.add(L1);
	     L1.setFont(new Font("Arial",Font.BOLD,25));
	     
	     JButton B1 = new JButton("OPEN");
			
			F.setLayout(null);
			B1.setBounds(500,150,100,45);
			F.add(B1);
			
			
			
			
	     
	}
}
