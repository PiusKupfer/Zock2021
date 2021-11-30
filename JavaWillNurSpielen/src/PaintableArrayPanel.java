
public class PaintableArrayPanel extends SizePanel {

	Paintable[] ps;
	public PaintableArrayPanel(Paintable[]pa) {pa=ps;}
	
	public void PaintableComponent(java.awt.Graphics g) {
		for(Paintable p:ps)p.PaintTo(g);
	}
	public static void main(String[]args) {
		
	}
}
