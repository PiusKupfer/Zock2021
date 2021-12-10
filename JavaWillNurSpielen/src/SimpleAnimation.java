import javax.swing.*;
import java.awt.event.*;
import Util.*;
public class SimpleAnimation extends MoveablePanel{
	
	Timer t = new Timer(30,new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			doOnTick();
		}
		});
	SimpleAnimation(){
		t.start();
	}

	
	
	 	public static void main(String[]args) {
	 		MoveablePanel p = new SimpleAnimation();
	 		
			p.gos.add(new MoveableImage("hexe.png",0,0,1,1));
			p.gos.add(new MoveableImage("biene.png",800,800,-1,-1));
		ShowInFrame.show(p);
	 	}
}
