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
		this.listaTreinos = new HashSet<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarTreino(String treino) {
		this.listaTreinos.add(treino);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Aluno >>> ");
		sb.append(this.nome + " ");
		sb.append(treinosToString());
		sb.append("\n");
		
		return sb.toString();
	}
	
	private String treinosToString() {
		
		int contador = 0;
		StringBuilder sb = new StringBuilder();
		
		sb.append("{");
		for(String s : this.listaTreinos) {
			sb.append(s);
			if(contador < listaTreinos.size()-1) {
				sb.append(", ");
			}
			else {
				sb.append("}");
			}
			contador++;
		}
		return sb.toString();
	}
}
