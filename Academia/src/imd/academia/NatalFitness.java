package imd.academia;

import java.util.ArrayList;

public class NatalFitness {
	
	private ArrayList<Recepcionista> recepcionistas;
	private ArrayList<Professor> professores;
	
	public NatalFitness() {
		this.recepcionistas = new ArrayList<Recepcionista>();
		this.professores = new ArrayList<Professor>();
	}
	
	public void adicionarRecepcionista(Recepcionista r) {
		this.recepcionistas.add(r);
	}
	
	public void adicionarProfessor(Professor p) {
		this.professores.add(p);
	}
	
	public void listarRecepcionistas() {
		
		for(Recepcionista r : recepcionistas) {
			r.printRecepcionista();
		}
	}
	
	public void listarProfessores() {
		
		for(Professor p : professores) {
			p.printProfessor();
		}
	}
	
	//private ArrayList<Funcionario> funcionarios;
	
	/*public void listarFuncionarios() {
		
		for (Funcionario f : funcionarios) {
			if(f instanceof Professor) {
				f.printProfessor();
			}
			else if(f instanceof Recepcionista) {
				f.printRecepcionista();
			}
		}
	}*/
}
