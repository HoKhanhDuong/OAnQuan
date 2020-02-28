package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Box;

public class MyAdapter extends KeyAdapter {
	private box box1;
	public MyAdapter(box box1) {
		this.box1 = box1;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		box1.keyPressed(e);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		box1.keyReleased(e);
	}
}
