package imd.oficina;

public class Oficina {
	
	BancoDeDados banco;
	
	public Oficina() {
		this.banco = new BancoDeDados();
	}

	public void manutencao(Veiculo v) {

		v.limparVeiculo();
		if (v instanceof Automovel) {
			trocarOleoUm((Automovel)v);
		}
	}
	
	public void trocarOleoUm(Automovel a) {
		
		a.trocarOleo();
		banco.getAutomoveisOleoTrocado().add(a);
		banco.getVeiculosOleoNaoTrocado().remove(a);
		
		System.out.println("Oleo trocado!");
	}
	
	public void trocarOleo() {
		for(Veiculo v : banco.getVeiculosOleoNaoTrocado()) {
			if(v instanceof Automovel) {
				trocarOleoUm((Automovel)v);
			}
		}
	}
}
