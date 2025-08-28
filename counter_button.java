package IHM;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Label;
import java.awt.TextField;
import java.awt.color.*;
import java.awt.Checkbox;
import javax.swing.JList;
import javax.swing.*;
import javax.swing.DefaultListModel;

public class frame {
	
	static int counter = 0;
	public static void main(String[]  args) {
		
		
		JFrame F = new JFrame("Main Frame");
		F.setSize(400,200);
		
		JLabel L1 = new JLabel("Welcome To Swing");
		L1.setLabelFor(L1);
	     L1.setBounds(390,25,200,200);
	     F.add(L1);
	     L1.setFont(new Font("Arial",Font.BOLD,25));
	     
	     final JLabel L2 = new JLabel("0");
		 L2.setLabelFor(L2);
		 L2.setBounds(450,75,200,200);
	     F.add(L2);
		 
		JButton B1 = new JButton("-");
		JButton B2 = new JButton("+");
		F.setLayout(null);
		B1.setBounds(500,150,100,45);
		B2.setBounds(300,150,100,45);
		F.add(B1);
		F.add(B2);
	   
		
		
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setVisible(true);
		
		B2.addActionListener(new ActionListener() {
			
		  public void actionPerformed(ActionEvent e) { 
			  
		  
				L2.setText(""+(++counter));
		  }});
		
	
}
