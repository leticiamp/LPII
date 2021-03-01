package br.ufrn.imd.lp.carbon;

public class Taxi extends Veiculo {

	private int qtdPessoas;

	public Taxi(int quilometragemMensal, int qtdPessoas) {
		super(quilometragemMensal);
		this.qtdPessoas = qtdPessoas;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	@Override
	public double getCarbonFootprint() {

		return this.quilometragemMensal * 1.10;
	}

	@Override
	public void print() {

		System.out.println("Quilometragem mensal: " + this.quilometragemMensal);
		System.out.println("Quantidade de pessoas: " + this.qtdPessoas);
		System.out.println("Quantidade de carbono: " + getCarbonFootprint());
		System.out.println("Custo mensal do combustivel: " + this.custoMensalCombustivel);
		System.out.println();
	}

	@Override
	public double calcCustoMensalCombustivel() {

		this.custoMensalCombustivel = (this.quilometragemMensal / 11) * 5.50;

		return this.custoMensalCombustivel;
	}
}
