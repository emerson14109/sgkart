package Kart;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class BancoVeiculo implements Serializable {

	private static BancoVeiculo INSTANCE;
	private List<Veiculo> veiculos;

	private BancoVeiculo() {
		veiculos = new ArrayList<>();
	}

	public static BancoVeiculo getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new BancoVeiculo();
		}

		return INSTANCE;
	}

	public void inserirVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluirVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluirVeiculo(int numero) {
		int index = 0;
		for (index = 0; index < veiculos.size(); index++) {
			if (veiculos.get(index).getNumero() == numero) {
				break;
			}
		}
		if (index < veiculos.size())
			veiculos.remove(index);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Veiculo buscarVeiculo(Veiculo veiculo) {
		int index = veiculos.indexOf(veiculo);
		if (index == -1) {
			return null;
		}
		return veiculos.get(index);
	}

	public Veiculo buscarVeiculo(int numero) {
		int index = 0;
		for (index = 0; index < veiculos.size(); index++) {
			if (veiculos.get(index).getNumero() == numero) {
				break;
			}
		}
		if (index >= veiculos.size())
			return null;
		return veiculos.get(index);
	}

	public List<Veiculo> buscarTodos() {
		return veiculos;
	}

	public Veiculo alterarVeiculo(Veiculo veiculo) {
		Veiculo p = buscarVeiculo(veiculo.getNumero());
		if (p == null) {
			return null;
		}
		excluirVeiculo(p);
		inserirVeiculo(veiculo);
		try {
			salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return veiculo;
	}

	public boolean isEmpty() {
		return veiculos.isEmpty();
	}

	public void receberLista(List<Veiculo> lista) {
		veiculos = lista;
	}

	public void salvar() throws IOException {
		try {
			FileOutputStream out = new FileOutputStream("Veiculos.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(out);
			objOut.writeObject(veiculos);
			objOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
