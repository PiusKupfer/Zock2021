import javax.swing.*;

import Util.ShowInFrame;

import java.awt.Dimension;
public class SizePanel extends JPanel {

	int preferredWidth = 400 , preferredHeight =300;
	
	public SizePanel(int w, int h) {
		preferredWidth=w;
		preferredHeight=h;
	}
public SizePanel() {
	
}
	@Override public Dimension getPreferredSize() {
return new Dimension(preferredWidth, preferredHeight);
	}
	public static void main(String[]args) {
		ShowInFrame.show(new SizePanel());
	}
}
