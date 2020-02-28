package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Background extends JPanel {
	private Image image;
	private int dai, rong;
	public Background(String tenanh, int dai, int rong) {
		ImageIcon imageIcon = new ImageIcon("E:\\C\\gamebasic\\src\\game\\"+tenanh);
		image = imageIcon.getImage();
		this.dai = dai;
		this.rong = rong;
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, dai, rong,Color.blue , this);
	}
	@Override
	public void paintComponents(Graphics g) {
	}
}
