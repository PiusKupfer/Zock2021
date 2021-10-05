
public class GeometrischeObjekte {

	public Vertex pos;
	public double height;
	public double width;
	
	public GeometrischeObjekte( double width, double height, Vertex pos){
		this.pos = pos;
		this.width = width;
		this.height = height;
		
		if(width<0) {
			width = -width;
			pos.x = pos.x + width;
			
			}
		if(height<0) {
			height = -height;
			pos.y = pos.y - height;
		}
		
	}
	
	public GeometrischeObjekte( double width, double height){
		 this(width,height,new Vertex(0,0));
		
	}
	
	public GeometrischeObjekte( double width) {
		this(width,width);
	}
	
	public GeometrischeObjekte() {
		this(10);
	}
	
	
	public String toString(){
	
			return "width=" +width+" ,height=" +height+", pos="+pos;
	
	}	
	public double circumference() {
		return 2*(width+height);
	}
	public double area() {
		return width+height;
	}
	
	
	
	
	public double getwidth() {return width;}
	public double getheight() {return height;}
	
	public Vertex getpos() {return pos;}
	
		
}
