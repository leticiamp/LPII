package imd.oficina;

import java.util.ArrayList;
import java.util.Collections;

import imd.oficina.Automovel.OrdenaAnoFabricacao;

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
	
	public void ordenarLista(ArrayList<Integer> oleoTrocado) {
		
		Collections.sort(oleoTrocado, new OrdenaAnoFabricacao());
		System.out.println(oleoTrocado);
	}

}
