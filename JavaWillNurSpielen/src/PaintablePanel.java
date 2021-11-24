import Util.ShowInFrame;
public class PaintablePanel extends SizePanel{
	Paintable pa;	
	
	
	public PaintablePanel(Paintable pa) {
		this.pa=pa;
	}
	
	public void paintComponent(java.awt.Graphics g) {
	
	pa.PaintTo(g);
	
	}
	public static void main(String[]args) {

	ShowInFrame.show(new PaintablePanel(new PaintableOval(100,50,30,50)));
	ShowInFrame.show(new PaintablePanel(new PaintableOval(10,50,30,50)));
	
	}
	
	
}