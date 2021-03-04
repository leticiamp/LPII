package imd.academia;

public class NatalFitness {
	
	private BancoDeDados banco;
	
	public NatalFitness() {
		this.banco = new BancoDeDados();
	}
	
	public void adicionarRecepcionista(Recepcionista r) {
		this.banco.adicionarFuncionario(r);
	}
	
	public void adicionarProfessor(Professor p) {
		this.banco.adicionarFuncionario(p);
	}
	
	public void listarRecepcionistas() {
		this.banco.listarRecepcionistas();
	}
	
	public void listarAtividades() {
		this.banco.listarAtividades();
	}
	
	public void listarFuncionario() {
		this.banco.listarFuncionarios();
	}
}
