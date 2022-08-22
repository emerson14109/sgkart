package Kart;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BtGerenciar extends JButton implements ActionListener{
	BtGerenciar(){
	this.setBounds(320, 150, 140, 40);
	this.addActionListener(this);
	this.setFocusable(false);
	this.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
	this.setText("Gerenciar");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int pw;
		pw = 123;
		if(e.getSource()==this) {
			 String senha = JOptionPane.showInputDialog(null, "Para acessar as funcoes de administrador, digite a senha: ");
			 if(Integer.parseInt(senha) == pw) {
				 System.out.println("correto!");
				 MyFrame fGerenciar = new MyFrame();
				 JLabel gLabel = new JLabel();
				 fGerenciar.add(gLabel);
				 BtCadastrar bCadastrarC = new BtCadastrar();
				 gLabel.add(bCadastrarC);
				 BtCadastrarV bCadastrarV = new BtCadastrarV();
				 gLabel.add(bCadastrarV);
				 BtExcluirC bExcluirC = new BtExcluirC();
				 gLabel.add(bExcluirC);
				 BtAlterarC bAlterarC = new BtAlterarC();
				 gLabel.add(bAlterarC);
				 BtExcluirV bExcluirV = new BtExcluirV();
				 gLabel.add(bExcluirV);
				 BtAlterarV bAlterarV = new BtAlterarV();
				 gLabel.add(bAlterarV);
			 }
			 else return;
			}
		
	}}
