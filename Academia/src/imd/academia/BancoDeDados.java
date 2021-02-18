package imd.academia;

import java.util.ArrayList;

public class BancoDeDados {

	private ArrayList<Funcionario> funcionarios;
	
	public BancoDeDados() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	// falta add tipo
	public void listarFuncionarios() {
		
		System.out.println("########## Funcionarios ##########");
		for(Funcionario f : funcionarios) {
			System.out.println("Matricula: " + f.getMatricula() + " Nome: " + f.getNome());
		}
		System.out.println("##################################");
	}
	
	public void listarAtividades() {
		
		System.out.println("########## Prrofessores ##########");
		for(Funcionario f : funcionarios) {
			if(f instanceof Professor) {
				System.out.println("Professor [" + f.getNome() + "]\n");
			}
			//System.out.println("Aluno >>> " nomeDoAluno + "{" + horario + "}");
		}
		System.out.println("##################################");
	}
	
	public void listarRecepcionistas() {
		
		System.out.println("########## Recepcionistas ##########");
		for(Funcionario f : funcionarios) {
			if(f instanceof Recepcionista) {
				System.out.println(" Nome: " + f.getNome() + " {" +  + "}");
			}
		}
		System.out.println("##################################");
	}
}
