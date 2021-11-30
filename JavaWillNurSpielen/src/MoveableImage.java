
public class MoveableImage extends GeometricImage implements GameObject {

	Vertex deltaPos = new Vertex(0,0);
	
	public Vertex getDeltaPos() {return deltaPos;}
	
	public void setDeltaPos(Vertex v) {deltaPos= v;}
	
	public MoveableImage(String name, double x, double y) {
		super(name,x,y);
	
	}
	public MoveableImage(String name, double x, double y,double dX,double dY) {
		super(name,x,y);
		deltaPos= new Vertex(dX,dY);
}
	public void move() {pos.addMod(deltaPos);}
	
	
	public void turn() {deltaPos.skalarMultMod(-1);}
		
	
}