package imd.academia;

import java.util.ArrayList;

public class BancoDeDados {

	private ArrayList<Funcionario> funcionarios;
	
	public BancoDeDados() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public void listarFuncionarios() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("########## Funcionarios ##########\n");
		
		for(Funcionario f : funcionarios) {
			sb.append("Matricula: " + f.getMatricula() + " Nome: " + f.getNome() + " Tipo: " + f.getClass());
			if(f instanceof Professor) {
				sb.append(" [" + ((Professor) f).getTipoProfessor() + "]");
			}
			sb.append("\n");
		}
		sb.append("##################################");
		System.out.println(sb.toString());
	}
	
	public void listarAtividades() {
		
		System.out.println("########## Professores ##########");
		for(Funcionario f : funcionarios) {
			if(f instanceof Professor) {
				System.out.println(f.toString());
			}
		}
		System.out.println("##################################");
	}
	
	public void listarRecepcionistas() {
		
		System.out.println("########## Recepcionistas ##########");
		for(Funcionario f : funcionarios) {
			if(f instanceof Recepcionista) {
				System.out.println(f.toString());
			}
		}
		System.out.println("####################################");
	}
	
	public void adicionarFuncionario(Funcionario f) {
		
		this.funcionarios.add(f);
	}
}
