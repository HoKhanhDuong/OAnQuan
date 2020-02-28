package game;

import javax.swing.JFrame;

public class test extends JFrame {
	public test() {
		add(new MainGame());
		setSize(1200,600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new test();
	}
}
