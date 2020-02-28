package game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class run extends JFrame  {
	public run() {
		setBounds(0, 0, 1200, 700);
		menu mnMenu = new menu(this);
		add(mnMenu);
		
		Background bgBackground = new Background("nen.png",1200,700);
		add(bgBackground);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		run r =  new run();
		r.setVisible(true);
		
		
	}
}
