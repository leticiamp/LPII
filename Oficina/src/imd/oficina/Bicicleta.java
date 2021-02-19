package imd.oficina;

public class Bicicleta extends Veiculo {

	public Bicicleta(String dono, String marca, int anoFabricacao) {
		super(dono, marca, anoFabricacao);
	}

	@Override
	public void limparVeiculo() {
		System.out.println("Bicicleta esta limpa!");
	}

}
