package Kart;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BtCadastrar extends JButton implements ActionListener{
	BtCadastrar(){
	this.setBounds(300, 90, 220, 40);
	this.addActionListener(this);
	this.setFocusable(false);
	this.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
	this.setText("Cadastrar cliente");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this) {
			System.out.println("Ok!");
			Fcadastrar frameCadastrar = new Fcadastrar();	
	  }
   }
}