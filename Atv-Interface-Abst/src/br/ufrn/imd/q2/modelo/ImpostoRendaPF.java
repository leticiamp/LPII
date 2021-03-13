package br.ufrn.imd.q2.modelo;

import br.ufrn.imd.q2.controle.PessoaDAO;

public class ImpostoRendaPF {

	public static void main(String[] args) {
		
		PessoaDAO pessoas = new PessoaDAO();
		
		SeguroVida s1 = new SeguroVida(92394, "Cephas", 5400, 200);
		SeguroVida s2 = new SeguroVida(73548, "Leticia", 5400, 200);
		SeguroVida s3 = new SeguroVida(51730, "Sara", 5400, 100);
		SeguroVida s4 = new SeguroVida(52729, "Pedro", 5400, 100);
		SeguroVida s5 = new SeguroVida(31826, "Gabriel", 5400, 300);
		
		ContaCorrente c1 = new ContaCorrente("932", "218337", 249);
		ContaCorrente c2 = new ContaCorrente("571", "758506", 560.4);
		ContaCorrente c3 = new ContaCorrente("846", "213225", 0);
		ContaCorrente c4 = new ContaCorrente("201", "544637", 103.6);
		ContaCorrente c5 = new ContaCorrente("849", "908665", 400);
		
		Pessoa cephas = new Pessoa("Cephas", 10000, c1, s1);
		Pessoa leticia = new Pessoa("Leticia", 400, c2, s2);
		Pessoa sara = new Pessoa("Sara", 158, c3, s3);
		Pessoa pedro = new Pessoa("Pedro", 0, c4, s4);
		Pessoa gabriel = new Pessoa("Gabriel", 2350.9, c5, s5);
		
		pessoas.cadastrarPessoa(cephas);
		pessoas.cadastrarPessoa(leticia);
		pessoas.cadastrarPessoa(sara);
		pessoas.cadastrarPessoa(pedro);
		pessoas.cadastrarPessoa(gabriel);
		
		pessoas.listarPessoas();
		pessoas.CalcularTributosPessoas();
	}

}
