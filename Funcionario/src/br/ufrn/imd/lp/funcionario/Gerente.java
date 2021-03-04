package br.ufrn.imd.lp.funcionario;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.bonificacao = calcularBonificacao();
	}

	@Override
	public double calcularBonificacao() {
		
		this.bonificacao = this.salario * 0.3 + 1000;
		return this.bonificacao;
	}
}
