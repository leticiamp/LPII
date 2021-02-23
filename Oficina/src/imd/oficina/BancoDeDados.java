package imd.oficina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BancoDeDados {

	public ArrayList<Automovel> automoveisOleoTrocado;
	public ArrayList<Veiculo> veiculosOleoNaoTrocado;

	public BancoDeDados() {
		this.automoveisOleoTrocado = new ArrayList<Automovel>();
		this.veiculosOleoNaoTrocado = new ArrayList<Veiculo>();
	}

	public void adcionarVeiculo(Veiculo v) {

		if (v instanceof Automovel) {
			Automovel a = (Automovel) v;
			if (a.isOleoTrocado()) {
				automoveisOleoTrocado.add(a);
			} else {
				veiculosOleoNaoTrocado.add(v);
			}
		} else {
			veiculosOleoNaoTrocado.add(v);
		}
	}

	public void removerVeiculo(Veiculo v) {

		if (v instanceof Automovel) {
			Automovel a = (Automovel) v;
			if (a.isOleoTrocado()) {
				automoveisOleoTrocado.remove(a);
			} else {
				veiculosOleoNaoTrocado.remove(v);
			}
		} else {
			veiculosOleoNaoTrocado.remove(v);
		}
	}

	public void ordenarLista(ArrayList<Integer> oleoTrocado) {

		Collections.sort(oleoTrocado, new OrdenaAnoFabricacao());
		System.out.println(oleoTrocado);
	}

	public ArrayList<Automovel> getAutomoveisOleoTrocado() {
		return automoveisOleoTrocado;
	}

	public void setAutomoveisOleoTrocado(ArrayList<Automovel> automoveisOleoTrocado) {
		this.automoveisOleoTrocado = automoveisOleoTrocado;
	}

	public ArrayList<Veiculo> getVeiculosOleoNaoTrocado() {
		return veiculosOleoNaoTrocado;
	}

	public void setVeiculosOleoNaoTrocado(ArrayList<Veiculo> veiculosOleoNaoTrocado) {
		this.veiculosOleoNaoTrocado = veiculosOleoNaoTrocado;
	}
	
	public class OrdenaAnoFabricacao implements Comparator<Automovel> {

		@Override
		public int compare(Automovel um, Automovel dois) {

			return um.getAnoFabricacao() - dois.getAnoFabricacao();
		}
	}
}
