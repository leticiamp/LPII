package br.ufrn.imd.lp.funcionario;

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
