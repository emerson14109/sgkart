package Kart;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BtServicos extends JButton implements ActionListener {
	BtServicos() {
		this.setBounds(320, 90, 140, 40);
		this.addActionListener(this);
		this.setFocusable(false);
		this.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
		this.setText("Servicos");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this) {
			System.out.println("Ok!");
			 MyFrame fServicos = new MyFrame();
			 JLabel sLabel = new JLabel();
			 fServicos.add(sLabel);
			 BtCadastrarS bCadastrarS = new BtCadastrarS();
			sLabel.add(bCadastrarS);
		}

	}
}
