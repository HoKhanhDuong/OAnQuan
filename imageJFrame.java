package game;

import javax.swing.JFrame;

public class imageJFrame extends JFrame{
	public imageJFrame() {
		setTitle("image");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new LoadImage());
	}	
	public static void main(String[] args) {
		new imageJFrame().setVisible(true);
	}
}