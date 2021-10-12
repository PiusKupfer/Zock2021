
public class square extends GeometrischeObjekte{
	
	public square(double width, double height, Vertex pos) {
		super(width, height, pos);
	}
	
	public square(double width, double height, double x, double y ) {
		super(width, height, new Vertex(x,y));
	}
	
	@Override public double area() {
	return width*height;

	}
	
	@Override public String toString() {
		return "square("+super.toString() +")";
	}
	
	
	public @Override boolean equals(Object that) {
		return (that instanceof square) && super.equals(that);
	}
	
	
	
	
	
	
	
}
