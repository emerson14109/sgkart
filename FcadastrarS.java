package Kart;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class FcadastrarS extends JFrame implements ActionListener {
	JButton BtCCadastroS;
	JCheckBox checkBox1;
	JCheckBox checkBox2;
	JCheckBox checkBox3;
	JCheckBox checkBox4;
	JCheckBox checkBox5;
	JCheckBox checkBox6;
	JCheckBox checkBox7;
	JCheckBox checkBox8;
	JCheckBox checkBox9;
	JCheckBox checkBox10;
	JCheckBox checkBox11;
	JCheckBox checkBox12;
	JCheckBox checkBox13;
	JCheckBox checkBox14;
	JCheckBox checkBox15;
	JCheckBox checkBox16;
	JCheckBox checkBox17;
	JCheckBox checkBox18;
	JCheckBox checkBox19;
	JCheckBox checkBox20;
	JTextField tempo;
	JTextField cpf;
	BancoVeiculo ctrlVeiculo;
	double precoT;
	JLabel text;
	Servico servico1;
	Veiculo karts[];
	String relatorioP;

	FcadastrarS() {

		this.setVisible(true);
		this.setTitle("SGKart");
		// JLabel cLabel = new JLabel();
		ctrlVeiculo = BancoVeiculo.getInstance();
		try {
			FileInputStream inC = new FileInputStream("Veiculos.ser");
			ObjectInputStream objInC = new ObjectInputStream(inC);

			List<Veiculo> vei = (List<Veiculo>) objInC.readObject();
			ctrlVeiculo.receberLista(vei);
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		checkBox1 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(1)));
		checkBox2 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(2)));
		checkBox3 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(3)));
		checkBox4 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(4)));
		checkBox5 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(5)));
		checkBox6 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(6)));
		checkBox7 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(7)));
		checkBox8 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(8)));
		checkBox9 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(9)));
		checkBox10 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(10)));
		checkBox11 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(11)));
		checkBox12 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(12)));
		checkBox13 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(13)));
		checkBox14 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(14)));
		checkBox15 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(15)));
		checkBox16 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(16)));
		checkBox17 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(17)));
		checkBox18 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(18)));
		checkBox19 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(19)));
		checkBox20 = new JCheckBox(Veiculo.imprimirV(ctrlVeiculo.buscarVeiculo(20)));
		tempo = new JTextField("Tempo(horas)");
		cpf = new JTextField("CPF");
		
		
		this.setPreferredSize(new Dimension(500, 750));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.add(checkBox1);
		this.add(checkBox2);
		this.add(checkBox3);
		this.add(checkBox4);
		this.add(checkBox5);
		this.add(checkBox6);
		this.add(checkBox7);
		this.add(checkBox8);
		this.add(checkBox9);
		this.add(checkBox10);
		this.add(checkBox11);
		this.add(checkBox12);
		this.add(checkBox13);
		this.add(checkBox14);
		this.add(checkBox15);
		this.add(checkBox16);
		this.add(checkBox17);
		this.add(checkBox18);
		this.add(checkBox19);
		this.add(checkBox20);
		this.add(tempo);
		this.add(cpf);

		
	    text = new JLabel();
		text.setText("Preço total:"+precoT);
		this.add(text);

		BtCCadastroS = new JButton("Solicitar servico");
		BtCCadastroS.setFocusable(false);
		BtCCadastroS.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
		BtCCadastroS.addActionListener(this);
		this.add(BtCCadastroS);
		cpf.setPreferredSize(new Dimension(60, 30));
		tempo.setPreferredSize(new Dimension(90, 30));
		this.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtCCadastroS) {
			System.out.println("ok");
			precoT=0;
			Veiculo karts[]=new Veiculo[20];
			
			if(checkBox1.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(1).getPreco();
				karts[0]=ctrlVeiculo.buscarVeiculo(1);
			}
			if(checkBox2.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(2).getPreco();
				karts[1]=ctrlVeiculo.buscarVeiculo(2);
			}
			if(checkBox3.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(3).getPreco();
				karts[2]=ctrlVeiculo.buscarVeiculo(3);
			}
			if(checkBox4.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(4).getPreco();
				karts[3]=ctrlVeiculo.buscarVeiculo(4);
			}
			if(checkBox5.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(5).getPreco();
				karts[4]=ctrlVeiculo.buscarVeiculo(5);
			}
			if(checkBox6.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(6).getPreco();
				karts[5]=ctrlVeiculo.buscarVeiculo(6);
			}
			if(checkBox7.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(7).getPreco();
				karts[6]=ctrlVeiculo.buscarVeiculo(7);
			}
			if(checkBox8.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(8).getPreco();
				karts[7]=ctrlVeiculo.buscarVeiculo(8);
			}
			if(checkBox9.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(9).getPreco();
				karts[8]=ctrlVeiculo.buscarVeiculo(9);
			}
			if(checkBox10.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(10).getPreco();
				karts[9]=ctrlVeiculo.buscarVeiculo(10);
			}
			if(checkBox11.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(11).getPreco();
				karts[10]=ctrlVeiculo.buscarVeiculo(11);
			}
			if(checkBox12.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(12).getPreco();
				karts[11]=ctrlVeiculo.buscarVeiculo(12);
			}
			if(checkBox13.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(13).getPreco();
				karts[12]=ctrlVeiculo.buscarVeiculo(13);
			}
			if(checkBox14.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(14).getPreco();
				karts[13]=ctrlVeiculo.buscarVeiculo(14);
			}
			if(checkBox15.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(15).getPreco();
				karts[14]=ctrlVeiculo.buscarVeiculo(15);
			}
			if(checkBox16.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(16).getPreco();
				karts[15]=ctrlVeiculo.buscarVeiculo(16);
			}
			if(checkBox17.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(17).getPreco();
				karts[16]=ctrlVeiculo.buscarVeiculo(17);
			}
			if(checkBox18.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(18).getPreco();
				karts[17]=ctrlVeiculo.buscarVeiculo(18);
			}
			if(checkBox19.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(19).getPreco();
				karts[18]=ctrlVeiculo.buscarVeiculo(19);
			}
			if(checkBox20.isSelected()==true) {
				precoT=precoT+ctrlVeiculo.buscarVeiculo(20).getPreco();
				karts[19]=ctrlVeiculo.buscarVeiculo(20);
			}
			double temp;
			temp = Double.parseDouble(tempo.getText());
			precoT = precoT*temp;
			BancoCliente ctrlCli = BancoCliente.getInstance();
			if(new File("Clientes.ser").canRead() == true) { 
				try {
					FileInputStream inC = new FileInputStream("Clientes.ser");
					ObjectInputStream objInC = new ObjectInputStream(inC);
					
					List <Pessoa> cli = (List<Pessoa>) objInC.readObject();
					ctrlCli.receberLista(cli);
				}catch(FileNotFoundException ex) {
					ex.printStackTrace();
				}catch(ClassNotFoundException ex) {
					ex.printStackTrace();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
			if(ctrlCli.buscarPessoa(cpf.getText()) != null) {
				precoT = precoT - precoT*0.05;
			}
			text.setText("Preço total: "+precoT);
			Data data = new Data(22,8,2022);
			servico1 = new Servico("Servico customizado",precoT,data);
		    JOptionPane relatorio = new JOptionPane();
		    for(int i=0;i<20;i++) {
		    	if(karts[i]!= null) {
		    		relatorioP= relatorioP+"\nKart: "+karts[i]+"\n";
		    	}
		    }
		    JOptionPane.showMessageDialog(null,"RELATORIO DE PRECOS: \n"+relatorioP+"\nTotal: "+precoT);
			
			

		}
	}
}