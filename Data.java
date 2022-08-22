package Kart;
import java.io.Serializable;

import javax.swing.JOptionPane;
public class Data implements Serializable {
		private int dia;
		private int mes;
		private int ano;
		
		public Data(int dia, int mes, int ano) {
			this.dia=dia;
			this.mes=mes;
			this.ano=ano;
		}
			
		public int getDia() {
			return this.dia;
		}
		
		public void setDia(int dia) {
			if(dia>0 && dia<=31) {
				this.dia = dia;
			}
			else JOptionPane.showMessageDialog(null, "O dia deve estar entre 1 e 31!");
		}
		public int getMes() {
				return this.mes;
		}
		public void setMes(int mes) {
			if(mes>0 && mes<=12) {
				this.mes = mes;
			}
			else JOptionPane.showMessageDialog(null, "O dia deve estar entre 1 e 12!");
		}
		public int getAno() {
			return this.ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public String toString() {
			String temp;
			temp = "Dia: "+dia+" Mes: "+mes+" Ano: "+ano;
			return temp;
			}
		

	}

