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
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Falterar extends JFrame implements ActionListener {
	JTextField tNome;
	JTextField tCpf;
	JTextField tTelefone;
	JTextField tDia;
	JTextField tMes;
	JTextField tAno;
	JButton BtCAlterar;
		Falterar(){

	this.setVisible(true);
	this.setTitle("SGKart");
    tNome = new JTextField("Nome");
	tNome.setPreferredSize(new Dimension(180, 30));
	tDia = new JTextField("dia");
	tDia.setPreferredSize(new Dimension(60, 30));
	tMes = new JTextField("mes");
	tMes.setPreferredSize(new Dimension(60, 30));
	tAno = new JTextField("ano");
	tAno.setPreferredSize(new Dimension(60, 30));
	tCpf = new JTextField("CPF");
	tCpf.setPreferredSize(new Dimension(180, 30));
	tTelefone = new JTextField("Telefone");
	tTelefone.setPreferredSize(new Dimension(180, 30));
	
	this.setLayout(new FlowLayout());
	this.add(tNome);
	this.add(tDia);
	this.add(tMes);
	this.add(tAno);
	this.add(tCpf);
	this.add(tTelefone);
	
	BtCAlterar = new JButton("Alterar");
	BtCAlterar.setFocusable(false);
	BtCAlterar.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
	BtCAlterar.addActionListener(this);
	this.add(BtCAlterar);
	this.pack();



	
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==BtCAlterar) {
			BancoCliente ctrlCliente = BancoCliente.getInstance();
			if(new File("Clientes.ser").canRead() == true) { 
				try {
					FileInputStream inC = new FileInputStream("Clientes.ser");
					ObjectInputStream objInC = new ObjectInputStream(inC);
					
					List <Pessoa> cli = (List<Pessoa>) objInC.readObject();
					ctrlCliente.receberLista(cli);
				}catch(FileNotFoundException ex) {
					ex.printStackTrace();
				}catch(ClassNotFoundException ex) {
					ex.printStackTrace();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
			
			Data data1 = new Data(Integer.parseInt(tDia.getText()),Integer.parseInt(tMes.getText()),Integer.parseInt(tAno.getText()));
			Pessoa cliente = new Pessoa(tNome.getText(), data1, tCpf.getText(), tTelefone.getText());
			ctrlCliente.alterarPessoa(cliente);
			System.out.println(cliente);
	
}
}
}


