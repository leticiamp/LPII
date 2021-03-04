package imd.academia;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario {
	
	private TipoProfessor tipo;
	private Set<Aluno> alunos;

	public Professor(String nome, String matricula, TipoProfessor tipo) {
		super(nome, matricula);
		this.tipo = tipo;
		this.alunos = new HashSet<Aluno>(); 
	}
	
	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String getTipoProfessor() {
		return tipo.getInfo();
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Professor : [" + this.nome + "]\n");
		sb.append(alunosToString());
		
		return sb.toString();
	}
	
	private String alunosToString() {
		
		StringBuilder sb = new StringBuilder();
		for(Aluno a :  this.alunos) {
			sb.append(a.toString());
		}
		
		return sb.toString();
	}
}
