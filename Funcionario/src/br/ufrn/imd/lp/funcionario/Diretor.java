package br.ufrn.imd.lp.funcionario;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.bonificacao = calcularBonificacao();
	}

	@Override
	public double calcularBonificacao() {
		
		this.bonificacao = this.salario * 0.4 + 2000;
		return this.bonificacao;
	}
}
