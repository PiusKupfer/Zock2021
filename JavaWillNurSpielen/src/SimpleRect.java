import java.awt.Color;



public class SimpleRect extends GeometrischeObjekte{
	
	public SimpleRect(double width, double height, Vertex pos, Color color) {
		super(width, height, pos,color);
	}
	
	public SimpleRect(double width, double height, double x, double y ) {
		super(width, height, new Vertex(x,y),new Color(0,0,0));
	}
	
	@Override public double area() {
	return width*height;

	}
	
	@Override public String toString() {
		return "square("+super.toString() +")";
	}
	
	
	public @Override boolean equals(Object that) {
		return (that instanceof SimpleRect) && super.equals(that);
	}
	
	
	
	
	
	
	
}
