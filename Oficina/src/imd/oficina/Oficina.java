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
	
	public void manutencaoVeiculos(ArrayList<Veiculo> veiculos) {
		
		System.out.println("Manutencao dos veiculos");
		for(Veiculo v : veiculos) {
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
}
