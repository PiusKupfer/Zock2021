import javax.swing.ImageIcon;

import Util.ShowInFrame;
public class GeometricImage extends GeometrischeObjekte implements Paintable{

	ImageIcon icon;
	
	public GeometricImage(String filename, double x, double y) {
		super (new Vertex(x,y));
		icon = new ImageIcon(getClass().getClassLoader().getResource(filename));
		init();
		
	
	}
	
	public GeometricImage(ImageIcon icon, double x, double y) {
		super(x,y);
		this.icon=icon;
		init();
	}
	void init() {
		width= icon.getImage().getWidth(icon.getImageObserver());
		height= icon.getImage().getHeight(icon.getImageObserver());
	}
	public void PaintTo(java.awt.Graphics g){
	icon.paintIcon(null, g, (int)pos.x,(int)pos.y);
	
	}
public static void main(String[]args) {
	GeometricImage gi = new GeometricImage("Images/371720.png",10,10);
	System.out.println(gi.width);
	System.out.println(gi.height);
	ShowInFrame.show(new PaintablePanel(gi));
}


}

