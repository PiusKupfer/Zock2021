
public interface GameObject extends Moveable,Paintable {

	double getWidth();
	double getHeight();
	Vertex getPos();
	Vertex getDeltaPos();
	void SetDeltaPos();
	boolean IsLargerThan(GameObject that);
	boolean IsAbove(GameObject that);
	boolean touches(GameObject that);
	
}
