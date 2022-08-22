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

public class FalterarV extends JFrame implements ActionListener {
	JTextField tCor;
	JTextField tNumero;
	JTextField tPotencia;
	JTextField tCombustivel;
	JTextField tPreco;
	JTextField tConsumo;
	JButton BtCAlterarV;
		FalterarV(){

	this.setVisible(true);
	this.setTitle("SGKart");
	//JLabel cLabel = new JLabel();
    tCor = new JTextField("Cor");
	tCor.setPreferredSize(new Dimension(180, 30));
	tNumero = new JTextField("Numero");
	tNumero.setPreferredSize(new Dimension(60, 30));
	tPotencia = new JTextField("Potencia");
	tPotencia.setPreferredSize(new Dimension(60, 30));
	tConsumo = new JTextField("Consumo");
	tConsumo.setPreferredSize(new Dimension(60, 30));
	tCombustivel = new JTextField("Combustivel");
	tCombustivel.setPreferredSize(new Dimension(180, 30));
	tPreco = new JTextField("Preco");
	tPreco.setPreferredSize(new Dimension(180, 30));
	
	this.setLayout(new FlowLayout());
	this.add(tCor);
	this.add(tNumero);
	this.add(tPotencia);
	this.add(tConsumo);
	this.add(tCombustivel);
	this.add(tPreco);
	
	BtCAlterarV = new JButton("Confirmar");
	BtCAlterarV.setFocusable(false);
	BtCAlterarV.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
	BtCAlterarV.addActionListener(this);
	this.add(BtCAlterarV);
	this.pack();

		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==BtCAlterarV) {
				BancoVeiculo ctrlVeiculo = BancoVeiculo.getInstance();
				if(new File("Veiculos.ser").canRead() == true) { 
					try {
						FileInputStream inC = new FileInputStream("Veiculos.ser");
						ObjectInputStream objInC = new ObjectInputStream(inC);
						
						List <Veiculo> vei = (List<Veiculo>) objInC.readObject();
						ctrlVeiculo.receberLista(vei);
					}catch(FileNotFoundException ex) {
						ex.printStackTrace();
					}catch(ClassNotFoundException ex) {
						ex.printStackTrace();
					}catch(IOException ex){
						ex.printStackTrace();
					}
				}
				
				Veiculo veiculo = new Veiculo(tCor.getText(), Integer.parseInt(tNumero.getText()), Double.parseDouble(tPotencia.getText()), Double.parseDouble(tConsumo.getText()), tCombustivel.getText(), Double.parseDouble(tPreco.getText()));
				ctrlVeiculo.alterarVeiculo(veiculo);
				System.out.println(veiculo);
		
	}
	}
	}
