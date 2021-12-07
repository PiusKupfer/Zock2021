import javax.swing.*;
import java.awt.event.*;
import Util.ShowInFrame;

public class ButtonAnimation extends JPanel{

	JButton b = new JButton("Push to move");
	MoveablePanel mp= new MoveablePanel();
	
	ButtonAnimation(){
		add(mp);
		add(b);
	
	
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		mp.doOnTick();
		}
	});
	}
	public static void main(String[]args) {
		ButtonAnimation p = new ButtonAnimation();
	
		p.mp.gos.add(new MoveableImage("images/Mirage.png",0,0,1,1));
		p.mp.gos.add(new MoveableImage("images/Teros.jfif",300,300,-1,-1));
	ShowInFrame.show(p);
	}
}
