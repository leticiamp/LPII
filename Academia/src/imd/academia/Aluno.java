package imd.academia;

import java.util.HashSet;
import java.util.Set;

public class Aluno {

	protected String nome;
	private Set<String> listaTreinos;
	
	public Aluno() {
		this.listaTreinos = new HashSet<String>();
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
