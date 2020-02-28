package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class menu extends JPanel implements ActionListener{
	private JButton playButton, hdButton,exitButton;
	private int an = 0;
	JFrame mainFrame;
	public menu(JFrame main) {
		ImageIcon icon1 = new ImageIcon("E:\\C\\gamebasic\\src\\game\\play.png");
		playButton = new JButton();
		playButton.setIcon(icon1);
		hdButton = new JButton("",new ImageIcon("E:\\C\\gamebasic\\src\\game\\hd1.png"));
		exitButton = new JButton("",new ImageIcon("E:\\C\\gamebasic\\src\\game\\exit1.png"));
		
		playButton.setBackground(Color.WHITE);
		playButton.setSize(233, 45);
		playButton.setLocation(0, 0);
		add(playButton);
		
		hdButton.setBackground(Color.WHITE);
		hdButton.setBounds(0, 45, 233, 45);
		add(hdButton);
		
		exitButton.setBackground(Color.WHITE);
		exitButton.setBounds(0, 90, 233, 50);
		add(exitButton);
		
		setSize(231,140);
		setLayout(null);
		setLocation(742, 504);
		
		playButton.addActionListener(this);
		exitButton.addActionListener(this);
		hdButton.addActionListener(this);
		
		this.mainFrame = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exitButton) {
			System.exit(0);
		}
		if(e.getSource() == playButton) {
			int i,j;
			for(i=0;i<2;i++)
				for(j=0;j<5;j++) {
					this.mainFrame.add(new PlayGame(this.mainFrame,i,j,"bt"+i*6+j));
				}

			this.mainFrame.add(new Background("mainplay.png",1200,700));
			this.mainFrame.setVisible(true);
			this.removeAll();
			 
		
		}
		if(e.getSource() == hdButton) {
			JFrame hdFrame = new JFrame();
			hdFrame.setBounds(400, 180, 500, 490);
			hdFrame.add(new Background("canh1.jpg",500,490));
			hdFrame.setVisible(true);
		}
	}
}
