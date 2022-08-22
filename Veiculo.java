package Kart;

import java.io.Serializable;

public class Veiculo implements Serializable{
	private String cor;
	private int numero;
	private double potencia;
	private double consumo;
	private String combustivel;
	private double preco;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Veiculo [cor=" + cor + ", numero=" + numero + ", potencia=" + potencia + ", consumo=" + consumo
				+ ", combustivel=" + combustivel + ", preco=" + preco + "]";
	}
	public Veiculo(String cor, int numero, double potencia, double consumo, String combustivel, double preco) {
		this.cor = cor;
		this.numero = numero;
		this.potencia = potencia;
		this.consumo = consumo;
		this.combustivel = combustivel;
		this.preco = preco;
	}
	public static String imprimirV(Veiculo veiculo) {
		String temp;
		temp = "Veiculo [cor=" + veiculo.getCor() + ", numero=" + veiculo.getNumero() + ", potencia=" + veiculo.getPotencia()+", preco=" + veiculo.getPreco() + "]";
		return temp;
	}
	
	
}
