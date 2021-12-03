import javax.swing.*;

import Util.ShowInFrame;

import java.awt.event.*;

public class Counter extends SimpleButton {
	
	int i= 0;
	public Counter() {
		
		b.addActionListener(
			
			
			new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					i++;
					l.setText(""+i);
				}
			}
			
		);
		
		c.addActionListener(
			
			
			new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					i--;
					l.setText(""+i);
				}
			}
			
		);
		
		d.addActionListener(
			
			
			new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					i=0;
					l.setText(""+i);
				}
			}
			
		);
			
			
		}
	
	public static void main(String[]args) {
		ShowInFrame.show(new Counter());
	
	
	}

}
	