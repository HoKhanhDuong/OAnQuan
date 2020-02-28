package game;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class leftright {
	private int  right;
	private JButton leftButton, rightButton;
	public leftright(JFrame frame,int left, int high) {
		this.right = left + 122;
		
		leftButton = new JButton("",new ImageIcon("E:\\C\\gamebasic\\src\\game\\left.png"));
		rightButton = new JButton("",new ImageIcon("E:\\C\\gamebasic\\src\\game\\right.png"));
		
		leftButton.setBounds(left-40, high+28, 40, 32);
		rightButton.setBounds(right, high+28, 40, 32);
		
		frame.add(leftButton);
		frame.add(rightButton);
	}
}
