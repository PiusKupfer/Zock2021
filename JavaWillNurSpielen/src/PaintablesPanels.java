import Util.ShowInFrame;
import java.util.*;
public class PaintablesPanels extends SizePanel{

	
	List<Paintable> pas;
	

 public PaintablesPanels(List<Paintable>pas) {this.pas=pas;}

 public void paintComponent(java.awt.Graphics g) {
	 for(Paintable pa:pas)pa.PaintTo(g);
 }
  
 public static void main(String[]args) {
	 List<Paintable> ps= new ArrayList<Paintable>();
	 ps.add(new PaintableOval(100,50,50,200));
	 ps.add(new PaintableOval(100,50,30,50));
 
  ShowInFrame.show("Oval", new PaintablesPanels(ps));
 
 }
 }

 