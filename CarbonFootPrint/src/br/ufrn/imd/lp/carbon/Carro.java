package br.ufrn.imd.lp.carbon;

public class Carro extends Veiculo {

	private double motor;

	public Carro(int quilometragemMensal, double motor) {
		super(quilometragemMensal);
		this.motor = motor;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	@Override
	public double getCarbonFootprint() {

		if (this.motor < 1.0) {
			this.carbono = this.quilometragemMensal * 0.13;
		} else if (this.motor > 2.0) {
			this.carbono = this.quilometragemMensal * 1.85;
		} else {
			this.carbono = this.quilometragemMensal * 1.22;
		}

		return this.carbono;
	}

	@Override
	public void print() {

		System.out.println("Quilometragem mensal: " + this.quilometragemMensal);
		System.out.println("Motor: " + this.motor);
		System.out.println("Quantidade de carbono: " + getCarbonFootprint());
		System.out.println("Custo mensal do combustivel: " + this.custoMensalCombustivel);
		System.out.println();
	}

	@Override
	public double calcCustoMensalCombustivel() {

		this.custoMensalCombustivel = (this.quilometragemMensal / 9) * 5.50;

		return this.custoMensalCombustivel;
	}
}
