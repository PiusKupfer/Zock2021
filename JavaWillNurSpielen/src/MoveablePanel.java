import java.util.*;
public class MoveablePanel extends SizePanel {

	List<GameObject> gos =new ArrayList<GameObject>();
	
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		for(GameObject go:gos) go.PaintTo(g);
	}
	
	public void move() {
		for(GameObject go:gos) go.move();
	}
	
	public void doOnTick() {
		
		move();
		repaint();
		
	}
}
