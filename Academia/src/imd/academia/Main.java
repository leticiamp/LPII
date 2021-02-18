package imd.academia;

public class Main {

	public static void main(String[] args) {
		
		NatalFitness natalFitness = new NatalFitness();
		
		Recepcionista cephas = new Recepcionista("Cephas", "3417638", "Terca=15:00, Segunda=07:00");
		Recepcionista gibeon = new Recepcionista("Gibeon", "5836013", "Sexta=12:00, Quarta=12:00");
		Professor itamir = new Professor("Itamir", "0257189", Professor.Tipo.MUSCULACAO);
		Professor jacyana = new Professor("Jacyana", "6473024", Professor.Tipo.NATACAO);
		
		natalFitness.adicionarRecepcionista(cephas);
		natalFitness.adicionarRecepcionista(gibeon);
		natalFitness.adicionarProfessor(itamir);
		natalFitness.adicionarProfessor(jacyana);
		
		natalFitness.listarProfessores();
		natalFitness.listarRecepcionistas();
		
		Aluno lucas = new Aluno("Lucas");
		Aluno thiago = new Aluno("Thiago");
		

	}

}
