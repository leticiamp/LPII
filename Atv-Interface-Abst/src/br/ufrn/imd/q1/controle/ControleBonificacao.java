package br.ufrn.imd.q1.controle;

import br.ufrn.imd.q1.modelo.Funcionario;

public class ControleBonificacao {

	private double totalBonificacao;
	
	public ControleBonificacao() {}

	public void registraBonificacoes (Funcionario f) {
		this.totalBonificacao += f.calcularBonificacao();
	}
	
	public double getTotalBonificacoes() {
		
		return totalBonificacao;
	}
}
