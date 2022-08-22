package Kart;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
		
		JLabel label = new JLabel();
		label.setText("Bem vindo usuario!");
		frame.add(label);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon bg = new ImageIcon("bg.png");
		label.setIcon(bg);
		BtServicos servico = new BtServicos();
		label.add(servico);
		BtGerenciar gerencia = new BtGerenciar();
		label.add(gerencia);
	}
}
