package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.ActiveEvent;
import javax.swing.*;

@SuppressWarnings("serial")
public class MainGame extends JPanel implements ActionListener {
	private Timer timer;
	private final int DELAY = 1;
	private box box1;
	
	public MainGame() {
		setFocusable(true);
		setBackground(Color.WHITE);
		box1 = new box();
		MyAdapter adapter = new MyAdapter(box1);
		addKeyListener(adapter);
		timer = new Timer(DELAY,this);
		timer.start();
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(box1.getImage(),box1.getX(),box1.getY(),this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		box1.move();
		repaint();
	}
}
