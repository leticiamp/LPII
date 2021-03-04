package imd.academia;

public class Main {

	public static void main(String[] args) {
		
		NatalFitness natalFitness = new NatalFitness();
		
		Recepcionista cephas = new Recepcionista("Cephas", "3417638", "Terca=15:00, Segunda=07:00");
		Recepcionista gibeon = new Recepcionista("Gibeon", "5836013", "Sexta=12:00, Quarta=12:00");
		Professor itamir = new Professor("Itamir", "0257189", TipoProfessor.MUSCULACAO);
		Professor jacyana = new Professor("Jacyana", "6473024", TipoProfessor.NATACAO);
		
		natalFitness.adicionarRecepcionista(cephas);
		natalFitness.adicionarRecepcionista(gibeon);
		natalFitness.adicionarProfessor(itamir);
		natalFitness.adicionarProfessor(jacyana);
		
		Aluno lucas = new Aluno("Lucas");
		Aluno thiago = new Aluno("Thiago");
		
		lucas.adicionarTreino("10:00=Hipertrofia");
		lucas.adicionarTreino("11:00=Hergometria");
		thiago.adicionarTreino("08:00=Nado de Costas");
		thiago.adicionarTreino("09:00=Nado Borboleta");
		
		itamir.adicionarAluno(lucas);
		jacyana.adicionarAluno(thiago);
		
		System.out.println();
		natalFitness.listarFuncionario();
		System.out.println();
		natalFitness.listarRecepcionistas();
		System.out.println();
		natalFitness.listarAtividades();

	}

}
