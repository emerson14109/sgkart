package Kart;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BtAlterarV extends JButton implements ActionListener{
	BtAlterarV(){
	this.setBounds(300, 390, 220, 40);
	this.addActionListener(this);
	this.setFocusable(false);
	this.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
	this.setText("Alterar Veiculo");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this) {
			System.out.println("Ok!");
			new FalterarV();	
	  }
   }
}