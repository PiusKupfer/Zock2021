
public class MouseControlledAnimation extends RemoveAnimation {

	GameObject controlled;
	
	MouseControlledAnimation(final GameObject contr){
		controlled=contr;
		gos.add(controlled);
	}
	
	public static void main(String[]args) {
		
	}
}
