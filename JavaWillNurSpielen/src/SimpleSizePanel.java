import javax.swing.*;

import Util.ShowInFrame;
public class SimpleSizePanel extends SizePanel {
	public void paintComponent (java.awt.Graphics g) {
		g.fillRect(30,50,45,80);
	}
	public static void main(String[]args) {
		ShowInFrame.show(new SimpleSizePanel());
	}
}
