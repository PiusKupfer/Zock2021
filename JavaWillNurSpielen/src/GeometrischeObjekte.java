import java.awt.Color;
public class GeometrischeObjekte {

	public Vertex pos;
	public double height;
	public double width;
	public Color color;
	
	
	
	public GeometrischeObjekte( double width, double height, Vertex pos, Color color){
		this.pos = pos;
		this.width = width;
		this.height = height;
		this.color = color;
		
		
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
		 this(width,height,new Vertex(0,0),new Color(0,0,0));
		
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
	
	
	
	
	public double getwidth() {
		return width;
		}
	public double getheight() {
		return height;
		}
	
	public Vertex getpos() {
		return pos;
		}
	
	public boolean isLargerThan(GeometrischeObjekte that) { 
		return this.area() > that.area(); 
		}
		
	public void moveTo(Vertex pos) {
		this.pos = pos;
	}
	public void moveTo(double x, double y) {
		
		moveTo(new Vertex(x,y));
	
	
	}
	
	public void move(Vertex v) {
		moveTo(pos.add(v));
	}
	
	public boolean contains(Vertex v) {
		return v.x >=pos.x && v.x<=	pos.x+width 
				&& v.y >=pos.y &&v.y<=pos.y+height;
	}
	
	
	
	
	public boolean equals(Object thatObject) {
		if(thatObject instanceof GeometrischeObjekte) {
		GeometrischeObjekte that = (GeometrischeObjekte)thatObject;
		return that.width==this.width
				&& that.height == this.height
				&& this.pos .equals(that.pos);
		
	}
	return false;	
	}
		
	
}

