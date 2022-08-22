package Kart;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BtExcluirV extends JButton implements ActionListener{
	BtExcluirV(){
	this.setBounds(300, 340, 220, 40);
	this.addActionListener(this);
	this.setFocusable(false);
	this.setFont(new Font("Franklin Gothic", Font.PLAIN, 20));
	this.setText("Excluir veiculo");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this) {
			new FexcluirV();	
	  }
   }
}