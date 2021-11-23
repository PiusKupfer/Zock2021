import javax.swing.*;

import java.awt.Color;


public class FirstPanel extends JPanel {
	
	@Override public void paintComponent( java.awt.Graphics g) {
		
		g.setColor(Color.cyan);
		g.fillRect(50,50,50,50);
	}
	
	public static void main(String[] args) {
		
		JFrame f= new JFrame("Mein erster Rechtsklick");
		
	
		f.add(new FirstPanel());
		f.pack();
		f.setVisible(true);
	}
	
	
	
	
	
	

}
