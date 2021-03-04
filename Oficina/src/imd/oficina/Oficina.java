package imd.oficina;

import java.util.ArrayList;

public class Oficina {
	
	BancoDeDados banco;
	
	public Oficina() {
		this.banco = new BancoDeDados();
	}

	public void manutencao(Veiculo v) {

		v.limparVeiculo();
		if(v instanceof Automovel && ((Automovel) v).isOleoTrocado() == false) {
			trocarOleoAutomovel((Automovel)v);
		}
	}
	
	public void manutencaoVeiculos() {
		
		System.out.println("Manutencao dos veiculos");
		for(Veiculo v : this.banco.getVeiculos()) {
			manutencao(v);
		}
	}
	
	public void trocarOleoAutomovel(Automovel a) {
		
		a.trocarOleo();
		System.out.println("Oleo trocado!");
	}
	
	public void trocarOleoAutomoveis() {
		for(Veiculo v : banco.getVeiculos()) {
			if(v instanceof Automovel && ((Automovel) v).isOleoTrocado() == false) {
				trocarOleoAutomovel((Automovel)v);
			}
		}
	}
	
	public ArrayList<Automovel> getAutomoveisOleoTrocadoByAno() {
		
		ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
		
		for(Veiculo v : banco.getVeiculos()) {
			if(v instanceof Automovel && ((Automovel) v).isOleoTrocado() == true) {
				automoveis.add((Automovel) v);
			}
		}
		
		return banco.ordenarLista(automoveis);
	}
	
	public void adcionarVeiculo(Veiculo v) {

		this.banco.adcionarVeiculo(v);
	}

	public void removerVeiculo(Veiculo v) {

		this.banco.removerVeiculo(v);
	}
}
