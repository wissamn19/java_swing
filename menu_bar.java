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
