package Kart;
import java.io.Serializable;

public class Servico implements Serializable {
	
	double precoServico;
	String nomeServico;
	Veiculo karts[] = new Veiculo[10];
	double tempo;
	Data dataServico;
	String cpfCliente;

	
	public Servico(String nomeServico, double precoServico, Data dataServico) {
		this.nomeServico = nomeServico;
		this.precoServico = precoServico;
		this.dataServico = dataServico;
	}
	
	public double getPrecoServico() {
		return precoServico;
	}
	public String getNomeServico() {
		return nomeServico;
	}
	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public Data getDataServico() {
		return dataServico;
	}
	public void setDataServico(Data dataServico) {
		this.dataServico = dataServico;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	
	public double calculaPreco(Veiculo karts[], double tempo, int nVeiculos) {
		double precoServico = 0;
		for(int i=0; i<nVeiculos; i++) {
			precoServico = karts[i].getPreco() + precoServico;
		}
		return precoServico;
	}
	public void selecionaVeiculo(Veiculo karts[], int i, Veiculo kart) {
		karts[i]=kart;
	}
	//public void sortPreco()
	
	
	
	
}
