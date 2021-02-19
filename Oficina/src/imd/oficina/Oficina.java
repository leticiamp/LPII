package imd.oficina;

public class Oficina {

	public void manutencao(Veiculo v) {

		v.limparVeiculo();
		if (v instanceof Automovel) {
			((Automovel) v).trocarOleo();
		}
	}
}
