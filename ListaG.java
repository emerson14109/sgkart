package Kart;

import java.io.Serializable;

public class ListaG <T> implements Serializable{	
	private No <T> first;
	
	public ListaG() {
		first = null;
	}
	public void inserir(T elemento) {
		No <T> nova = new No <T> (elemento);
			nova.setProximo(this.first);
			this.first = nova;
	}
	public No <T> deletar(No a){
		No current = first;
		No previous = first;
		while(current.getElemento() != a) {
			if(current.getProximo() == null)
				return null;
			else {
				previous = current;
				current = current.getProximo();
			}
		}
		if(current == first) 
			first = first.getProximo();
		else {
			previous = current.getProximo();
		}
		return current;					
	}
	public No <T> getFirst(){
		return first;
	}
	public No <T> deletarP(No <T> busca){
		first = first.getProximo();
		return (No<T>) busca;
	}
	public No <T> deletarM(No<T> antes,No<T> depois){
		antes.setProximo(depois.getProximo());
		return antes;
	}
	public boolean isEmpty() {
		if(this.first == null) {
			return true;
		}
		return false;}
	}


