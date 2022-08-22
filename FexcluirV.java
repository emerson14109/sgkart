package Kart;

import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FexcluirV extends JFrame implements ActionListener {
	JTextField tNumero;
	JButton BtCExcluirV;

	FexcluirV() {

		this.setVisible(true);
		this.setTitle("SGKart");
		// JLabel cLabel = new JLabel();
		tNumero = new JTextField("Numero");
		tNumero.setPreferredSize(new Dimension(250, 30));

		this.setLayout(new FlowLayout());
		this.add(tNumero);

		BtCExcluirV = new JButton("Excluir veiculo");
		BtCExcluirV.setFocusable(false);
		BtCExcluirV.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
		BtCExcluirV.addActionListener(this);
		this.add(BtCExcluirV);
		this.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtCExcluirV) {
			BancoVeiculo ctrlVeiculo = BancoVeiculo.getInstance();
			if (new File("Veiculos.ser").canRead() == true) {

			}
			ctrlVeiculo.excluirVeiculo(Integer.parseInt(tNumero.getText()));
		}
	}
}