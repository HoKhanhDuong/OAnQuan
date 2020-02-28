package game;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class box {
	private int dx, dy;
	private int x, y;
	private Image image;
	private final int SPEED =10;
	public box() {
		ImageIcon iiIcon = new ImageIcon("E:\\C\\gamebasic\\src\\game\\cho1.jpg");
		image = iiIcon.getImage();
		x=50;
		y=50;
	}
	public void move() {
		x+=dx;
		y+=dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Image getImage() {
		return image;
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_UP:
			dy=-1;
			break;
		case KeyEvent.VK_DOWN:
			dy=1;
			break;
		case KeyEvent.VK_LEFT:
			dx=-1;
			break;
		case KeyEvent.VK_RIGHT:
			dx = 1;
			break;
			
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_UP:
			dy=0;
			break;
		case KeyEvent.VK_DOWN:
			dy=0;
			break;
		case KeyEvent.VK_LEFT:
			dx=0;
			break;
		case KeyEvent.VK_RIGHT:
			dx=0;
			break;
		}
	}
}
