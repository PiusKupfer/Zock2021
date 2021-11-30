
public class PaintableArrayPanel extends SizePanel {

	Paintable[] ps;
	public PaintableArrayPanel(Paintable[]pa) {pa=ps;}
	
	public void PaintableComponent(java.awt.Graphics g) {
		for(Paintable p:ps)p.PaintTo(g);
	}
	public static void main(String[]args) {
	//	Paintable pa[] = {new PaintableOval(100,50,50,100), new PaintableOval(50,30,50,50)};
	}
}
