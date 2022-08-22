package Kart;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fexcluir extends JFrame implements ActionListener {
	JTextField tCpf;
	JButton BtCExcluir;

	Fexcluir() {

		this.setVisible(true);
		this.setTitle("SGKart");
		// JLabel cLabel = new JLabel();
		tCpf = new JTextField("CPF");
		tCpf.setPreferredSize(new Dimension(250, 30));

		this.setLayout(new FlowLayout());
		this.add(tCpf);

		BtCExcluir = new JButton("Excluir cadastro");
		BtCExcluir.setFocusable(false);
		BtCExcluir.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
		BtCExcluir.addActionListener(this);
		this.add(BtCExcluir);
		this.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtCExcluir) {
			BancoCliente ctrlCliente = BancoCliente.getInstance();
			if (new File("Clientes.ser").canRead() == true) {

			}
			ctrlCliente.excluirPessoa(tCpf.getText());
		}
	}
}