package br.ufrn.imd.q2.controle;

import java.util.ArrayList;

import br.ufrn.imd.q2.modelo.Pessoa;

public class PessoaDAO {

	private ArrayList<Pessoa> pessoas;
	
	public PessoaDAO() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastrarPessoa(Pessoa p) {
		this.pessoas.add(p);
	}
	
	public void listarPessoas() {
		
		for (Pessoa p : pessoas) {
			System.out.println("****************************************************");
			System.out.println("Nome...: " + p.getNome() + " Salario.: " + p.getSalario());
			System.out.println("Agencia: " + p.getConta().getAgencia() + " Conta.: "
								+ p.getConta().getNumero() + " Saldo.: " + p.getConta().getSaldo());
			System.out.println("Seguro.: " + p.getSeguro().getNumero() + " Beneficiario.: "
								+ p.getSeguro().getBeneficiado());
		}
	}
	
	public void CalcularTributosPessoas() {
		
		for (Pessoa p : pessoas) {
			System.out.println("****************************************************");
			System.out.println("Nome...: " + p.getNome() + " IRPF...: " + GeradorImpostoRenda.calculaValorTotalTributo(p));
		}
	}
}
