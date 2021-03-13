package br.ufrn.imd.q2.controle;

import br.ufrn.imd.q2.modelo.Pessoa;

public class GeradorImpostoRenda {

	public static double calculaValorTotalTributo(Pessoa pessoa) {

		double valor = pessoa.calcularTributos();
		valor += pessoa.getConta().calcularTributos();
		valor += pessoa.getSeguro().calcularTributos();

		return valor;
	}
}