package Kart;

import java.io.Serializable;

public class Pessoa implements Serializable{
	String nome;
	Data nascimento;
	String cpf;
	String telefone;
	
	public Pessoa(String nome, Data nascimento, String cpf, String telefone) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public Pessoa(String nome, Data nascimento, String cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
	}
	//set
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	//get
	public Data getNascimento() {
		return this.nascimento;
	}
	public String getNome() {
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public String toString() {
		String temp;
		temp = "nome: "+nome+"Nascimento: "+nascimento+"cpf: "+cpf;
		return temp;
	}
	
}
