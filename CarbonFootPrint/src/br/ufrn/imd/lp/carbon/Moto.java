package br.ufrn.imd.lp.carbon;

public class Moto extends Veiculo {

	private int cilindrada;

	public Moto(int quilometragemMensal, int cilindrada) {
		super(quilometragemMensal);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public double getCarbonFootprint() {

		if (this.cilindrada < 150) {
			this.carbono = this.quilometragemMensal * 0.20;
		} else if (this.cilindrada > 650) {
			this.carbono = this.quilometragemMensal * 0.65;
		} else {
			this.carbono = this.quilometragemMensal * 0.50;
		}

		return this.carbono;
	}

	@Override
	public void print() {

		System.out.println("Quilometragem mensal: " + this.quilometragemMensal);
		System.out.println("Cilindrada: " + this.cilindrada);
		System.out.println("Quantidade de carbono: " + getCarbonFootprint());
		System.out.println("Custo mensal do combustivel: " + this.custoMensalCombustivel);
		System.out.println();
	}

	@Override
	public double calcCustoMensalCombustivel() {

		this.custoMensalCombustivel = (this.quilometragemMensal / 25) * 5.50;

		return this.custoMensalCombustivel;
	}

}
