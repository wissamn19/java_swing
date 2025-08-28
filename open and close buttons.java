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
			
