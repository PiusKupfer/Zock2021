import Util.*;
import java.util.*;
	public class RemoveAnimation extends AnimationPanel {

		public void doChecks() {
			List<GameObject> toRemove = new LinkedList<GameObject>();
			for (GameObject g1 : gos) {
				for (GameObject g2 : gos) {
					if (g1 != g2 && g1.touches(g2)) {
						if (g1.isLargerThan(g2)) {
							toRemove.add(g2);
						} else {
							toRemove.add(g1);
						}
					}
				}
			}
			gos.removeAll(toRemove);
		}

		public static void main(String[] args) {
	        MoveablePanel p = new RemoveAnimation();
			p.gos.add(new MoveableImage("images/hexe.png",0,0,1,1));
			p.gos.add(new MoveableImage("images/biene.png",400,400,-1,-1));
			ShowInFrame.show(p);
		}

	}

