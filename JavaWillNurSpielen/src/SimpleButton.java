import javax.swing.*;
import Util.ShowInFrame;
public class SimpleButton extends JPanel{
	
	JButton b = new JButton("push this Button");
	JButton c = new JButton("push this Button to count down");
	JButton d = new JButton("push this Button to reset");
	JLabel l = new JLabel("000");
	 SimpleButton(){
	add(b);
	add(c);
	add(d);
	add(l);
	 
	 }
	
	public static void main(String[]args) {
		ShowInFrame.show(new SimpleButton());
	}

}
