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
	/*
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
 */
	
	/*
	public static void main(String[]  args) {
		JFrame F = new JFrame("Main Frame");
		F.setSize(400,200);
		
		JLabel L1 = new JLabel("Welcome To Swing:");
		L1.setLabelFor(L1);
	     L1.setBounds(390,25,200,200);
	     F.add(L1);
	     L1.setFont(new Font("Arial",Font.BOLD,20));
		
	      final JButton B1 = new JButton("OPEN");
			
			F.setLayout(null);
			B1.setBounds(500,150,100,45);
			F.add(B1);
			
			F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			F.setVisible(true);
			
			
			
			
			
			B1.addActionListener(new ActionListener() {
				
				  public void actionPerformed(ActionEvent e) { 
					  
					  final JFrame F1 = new JFrame("Main2 Frame");
						F1.setSize(400,200);
						
						 JButton B2 = new JButton("CLOSE");
							
							F1.setLayout(null);
							B2.setBounds(500,150,100,45);
							F1.add(B2);
						
						F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						F1.setVisible(true);
						
						B2.addActionListener(new ActionListener() {
							
							  public void actionPerformed(ActionEvent e) { 
								  
								  F1.setVisible(false);  
							  }});
				  }});
			
			}
			
			*/
	/*
public static void main(String[]  args) {
		
		
		JFrame F = new JFrame("Main Frame");
		F.setSize(400,200);
		
		
	
		
		  JMenuBar  bar =  new JMenuBar(); 
	  
		  
		  
		  
		  JMenu  M1=  new JMenu("File"); 
		  JMenu  M2=  new JMenu("Edit"); 
		  JMenu  M3=  new JMenu("Help"); 
		  
		  bar.add(M1);
		  bar.add(M2);
		  bar.add(M3);
		  
		  JMenuItem  File1 = new JMenuItem("open");
		  
		  JMenuItem  File2 = new JMenuItem("save");
		  
		  JMenuItem  File3 = new JMenuItem("exit");
		  
		  
		  M1.add(File1);
		  M1.add(File2);
		  M1.addSeparator();
		  M1.add(File3);
		  
		  
		    F.setJMenuBar(bar);
		    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			F.setVisible(true);
}

*/
	

	/*
	    public static void main(String[] args) {
	        JFrame F = new JFrame("Fenêtre principale");
	        F.setSize(500, 300);
	        F.setLayout(null);
	        
	        // Champs de texte
	        final JTextField text_field_1 = new JTextField();
	        final JTextField text_field_2 = new JTextField();
	        final JTextField text_field_3 = new JTextField();
	        final JTextField text_field_4 = new JTextField();
	        final JLabel Label_result = new JLabel();
	        
	        // Positionner les champs et les ajouter
	        text_field_1.setBounds(20, 20, 100, 30);
	        text_field_2.setBounds(20, 60, 100, 30);
	        text_field_3.setBounds(20, 100, 100, 30);
	        text_field_4.setBounds(20, 140, 100, 30);
	        Label_result.setBounds(20, 180, 200, 30);
	        
	        F.add(text_field_1);
	        F.add(text_field_2);
	        F.add(text_field_3);
	        F.add(text_field_4);
	        F.add(Label_result);
	        
	        // Bouton "Open"
	        JButton B2 = new JButton("Open");
	        B2.setBounds(150, 60, 100, 45);
	        F.add(B2);
	        
	        B2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) { 
	                try {
	                   
	                    int x = Integer.parseInt(text_field_1.getText());
	                    int y = Integer.parseInt(text_field_2.getText());
	                    int width = Integer.parseInt(text_field_3.getText());
	                    int height = Integer.parseInt(text_field_4.getText());
	                    
	                   
	                    if (width > 0 && height > 0) {
	                      
	                        JFrame newFrame = new JFrame("Nouvelle fenêtre");
	                        newFrame.setBounds(x, y, width, height);
	                        newFrame.setVisible(true);
	                    } else {
	                        throw new IllegalArgumentException("La largeur et la hauteur doivent être positives.");
	                    }
	                } catch (Exception ex) {
	                    Label_result.setForeground(Color.RED);
	                    Label_result.setText("Erreur: valeurs invalides !");
	                }
	            }
	        });
	        
	        // Configurer la fenêtre principale
	        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        F.setVisible(true);
	    }
	    */
	
public static void main(String[] args) {
		   	 
		  JFrame F = new JFrame("Afficher/Masquer Mot de Passe");
	        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        F.setSize(400, 150);
	        F.setLayout(new FlowLayout());
	        
	        JLabel passwordLabel = new JLabel("password:");
	        F.add(passwordLabel);

	        
	        
	        
	        final JPasswordField passwordField = new JPasswordField(20);
	        passwordField.setEchoChar('*'); 
	        F.add(passwordField);

	        
	        
	        final JCheckBox showPasswordCheckbox = new JCheckBox("show password");
	        F.add(showPasswordCheckbox);

	        
	        showPasswordCheckbox.addActionListener(new ActionListener() {
	           
	            public void actionPerformed(ActionEvent e) {
	                if (showPasswordCheckbox.isSelected()) {
	                    passwordField.setEchoChar((char) 0); 
	                } else {
	                    passwordField.setEchoChar('*'); 
	                }
	            }
	        });

	        
	        
	        
	        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        F.setVisible(true);
	        }}
	
	
	
	
	
	
	
	
	
	
	

    



        
      

       
       

        
        
        
      

