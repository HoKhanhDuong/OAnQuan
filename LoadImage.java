package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LoadImage extends JPanel {
	private Image image;
	public LoadImage() {
		ImageIcon imageIcon = new ImageIcon("E:\\C\\gamebasic\\src\\game\\cho.jpg");
		image = imageIcon.getImage();
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 20, 20, 800, 800,Color.blue , this);
		g.drawImage(image, 100,100,this);
	}
	@Override
	public void paintComponents(Graphics g) {
	}

}
