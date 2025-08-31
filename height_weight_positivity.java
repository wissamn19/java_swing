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
	    
	
	
	
	
	
	
	
	
	
	
	
	

    



        
      

       
       

        
        
        
      


