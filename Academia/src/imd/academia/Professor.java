package imd.academia;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario {
	
	public enum Tipo {
        NATACAO, MUSCULACAO;
    }
	
	private Tipo tipo;
	private Set<Aluno> alunos;

	public Professor(String nome, String matricula, Tipo tipo) {
		super(nome, matricula);
		this.tipo = tipo;
		this.alunos = new HashSet<Aluno>(); 
	}
}
