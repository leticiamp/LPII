package imd.oficina;

import java.util.ArrayList;
import java.util.Collections;

public class BancoDeDados {

	public ArrayList<Veiculo> veiculos;

	public BancoDeDados() {
		this.veiculos = new ArrayList<Veiculo>();
	}

	public void adcionarVeiculo(Veiculo v) {

		veiculos.add(v);
	}

	public void removerVeiculo(Veiculo v) {

		veiculos.remove(v);
	}

	public ArrayList<Automovel> ordenarLista(ArrayList<Automovel> automoveis) {

		Collections.sort(automoveis, Automovel.comparatorAutomovelDesc);
		return automoveis;
	}

	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
