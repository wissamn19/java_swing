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
	
	
	
