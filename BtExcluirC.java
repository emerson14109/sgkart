package Kart;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BtExcluirC extends JButton implements ActionListener{
	BtExcluirC(){
	this.setBounds(300, 190, 220, 40);
	this.addActionListener(this);
	this.setFocusable(false);
	this.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
	this.setText("Excluir cliente");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this) {
			Fexcluir frameExcluir = new Fexcluir();	
	  }
   }
}