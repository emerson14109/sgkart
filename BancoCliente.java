package Kart;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class BancoCliente implements Serializable {

	private static BancoCliente INSTANCE;
	private List<Pessoa> pessoas;

	private BancoCliente() {
		pessoas = new ArrayList<>();
	}

	public static BancoCliente getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new BancoCliente();
		}

		return INSTANCE;
	}

	public void inserirPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluirPessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluirPessoa(String cpf) {
		int index = 0;
		for (index = 0; index < pessoas.size(); index++) {
			if (pessoas.get(index).getCpf().equals(cpf)) {
				break;
			}
		}
		if (index < pessoas.size())
			pessoas.remove(index);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Pessoa buscarPessoa(Pessoa pessoa) {
		int index = pessoas.indexOf(pessoa);
		if (index == -1) {
			return null;
		}
		return pessoas.get(index);
	}

	public Pessoa buscarPessoa(String cpf) {
		int index = 0;
		for (index = 0; index < pessoas.size(); index++) {
			if (pessoas.get(index).getCpf().equals(cpf)) {
				break;
			}
		}
		if (index >= pessoas.size())
			return null;
		return pessoas.get(index);
	}

	public List<Pessoa> buscarTodos() {
		return pessoas;
	}

	public Pessoa alterarPessoa(Pessoa pessoa) {
		Pessoa p = buscarPessoa(pessoa.getCpf());
		if (p == null) {
			return null;
		}
		excluirPessoa(p);
		inserirPessoa(pessoa);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pessoa;
	}

	public boolean isEmpty() {
		return pessoas.isEmpty();
	}

	public void receberLista(List<Pessoa> lista) {
		pessoas = lista;
	}

	public void salvar() throws IOException {
		try {
			FileOutputStream out = new FileOutputStream("Clientes.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(pessoas);
			objOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
