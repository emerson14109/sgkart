package Kart;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	MyFrame(){
	this.setTitle("SGKart");
	this.setSize(800,680);
	this.setVisible(true);
	
	ImageIcon image = new ImageIcon("pneu.pgn");
	this.setIconImage(image.getImage());
}
}