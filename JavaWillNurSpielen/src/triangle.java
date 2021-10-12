
public class triangle extends GeometrischeObjekte{
	
	public triangle(double width, double height, Vertex pos) {
		super(width, height, pos);
	}
	
	public triangle(double width, double height, double x, double y ) {
		super(width, height, new Vertex(x,y));
	}
	
	@Override public double area() {
	return ((width*height)/4)*Math.sqrt(3);

	}
	
	@Override public String toString() {
		return "triangle("+super.toString() +")";
	}
	
	
	public @Override boolean equals(Object that) {
		return (that instanceof triangle) && super.equals(that);
	}
	
	
	
	
	
	
	
}


