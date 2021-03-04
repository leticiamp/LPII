package br.ufrn.imd.lp.funcionario;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.bonificacao = calcularBonificacao();
	}

	@Override
	public double calcularBonificacao() {
		
		this.bonificacao = this.salario * 0.2;
		return this.bonificacao;
	}

}
