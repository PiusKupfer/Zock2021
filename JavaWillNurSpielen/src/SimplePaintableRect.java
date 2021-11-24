
public class SimplePaintableRect extends SimpleRect
	implements Paintable {
	public SimplePaintableRect(double width, double height, double x, double y) {
		super(width,height,x,y);
	}
	public void PaintTo(java.awt.Graphics g) {
		g.fillRect((int)pos.x,(int)pos.y,(int)width,(int)height);
	}
}
 

