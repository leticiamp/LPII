package br.ufrn.imd.lp.imc;

import java.util.ArrayList;

public class ArrayPessoa {

	private ArrayList<PessoaIMC> pessoas;
	
	public ArrayPessoa() {
		this.pessoas = new ArrayList<PessoaIMC>();
	}

	public void adicionar(PessoaIMC p) {
		this.pessoas.add(p);
		System.out.println(p.getNome() + " adcionado");
	}

	public void remover(PessoaIMC p) {
		this.pessoas.remove(p);
		System.out.println(p.getNome() + " removido");
	}
	
	public void printPessoas() {
		for(PessoaIMC p : this.pessoas) {
			System.out.println(p.toString());
		}
	}
}
