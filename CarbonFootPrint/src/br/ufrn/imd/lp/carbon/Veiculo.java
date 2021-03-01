package br.ufrn.imd.lp.carbon;

public class Veiculo implements CarbonFootprint {

	protected int quilometragemMensal;
	protected double carbono;
	protected double custoMensalCombustivel;

	public Veiculo(int quilometragemMensal) {
		this.quilometragemMensal = quilometragemMensal;
		this.custoMensalCombustivel = calcCustoMensalCombustivel();
	}

	public int getQuilometragemMensal() {
		return quilometragemMensal;
	}

	public void setQuilometragemMensal(int quilometragemMensal) {
		this.quilometragemMensal = quilometragemMensal;
	}

	public double getCustoMensalCombustivel() {
		return custoMensalCombustivel;
	}

	public void setCustoMensalCombustivel(double custoMensalCombustivel) {
		this.custoMensalCombustivel = custoMensalCombustivel;
	}

	@Override
	public double getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcCustoMensalCombustivel() {
		return 0;
	}

	public void print() {

		System.out.println("Quilometragem mensal: " + this.quilometragemMensal);
		System.out.println("Quantidade de carbono: " + getCarbonFootprint());
		System.out.println();
	}
}
