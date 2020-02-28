package game;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayGame extends JPanel implements MouseListener {
	private int i,j;
	private JFrame jrFrame;
	public PlayGame(JFrame frame, int i, int j, String name) {
		setBounds(260 + j*(130+8), 230 + i*(103+10), 122, 103);
		ImageIcon icon = new ImageIcon("E:\\C\\gamebasic\\src\\game\\thu.png");
		//setIcon(icon);
		setBackground(Color.ORANGE);
		addMouseListener(this);
		setName(name);
		this.i = i;
		this.j = j;
		this.jrFrame = frame;
	}
	/*@Override
	public void actionPerformed(ActionEvent e) {
		//if(e.getSource() == "bt"+i*6+j)
			new leftright(this.jrFrame,260 + (this.j)*(130+8) ,230 + (this.i)*(103+10));
	}*/
	public void mouseClicked(MouseEvent e) {
		//new leftright(this.jrFrame,260 + (this.j)*(130+8) ,230 + (this.i)*(103+10));
     }

     public void mousePressed(MouseEvent e) {
     }

     public void mouseReleased(MouseEvent e) {
     }

     public void mouseEntered(MouseEvent e) {
     }

     public void mouseExited(MouseEvent e) {
     }
}
