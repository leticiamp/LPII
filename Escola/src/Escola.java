import java.util.ArrayList;

public class Escola {
	
	private ArrayList<Professor> professores;
	
	public Escola() {
		this.professores = new ArrayList<Professor>();
	}
	
	public void adicionarProfessor(Professor p) {
		this.professores.add(p);
		System.out.println("Professor " + p.getNome() + " adcionado");
	}
	
	public void removerProfessor(Professor p) {
		this.professores.remove(p);
	}
	
	public void quantidadeProfessores() {
		int quantidade = this.professores.size();
		System.out.println("Ha " + quantidade + " professoreses na escola\n");
	}
	
	// Informar o professor com maior salario
	public void maiorSalario() {
		
		double maior = 0;
		String prof = "";
		
		for(Professor p:professores) {
			if(p.getSalario() > maior) {
				maior = p.getSalario();
				prof = p.getNome();
			}
		}
		
		System.out.println("O professor com maior salário é " + prof + ", que recebe R$" + maior + "\n");
	}
	
	// Informar o professor mais novo na escola
	public void professorMaisNovo() {
	    Professor maisNovo = new Professor();
	    
		maisNovo = professores.get(professores.size()-1); // ultimo prof adicionado
		System.out.println("Professor mais novo: " + maisNovo.getNome() + "\n");
	}
	
	// Listar os professores de regime integral e seus respectivos departamentos
	public void listarProfessorIntegral() {
		
		System.out.println("Professores em regime integral:");
		for(Professor p:professores) {
			if (p instanceof ProfessorIntegral) {
				((ProfessorIntegral) p).print();
			}
		}
		
	}
	
	// Listar o total de salarios a ser pago pela escola
	public void totalSalariosAPagar() {
	    double valorTotal = 0;
	    
	    for(Professor p:professores) {
	        valorTotal += p.getSalario();
	    }
	    System.out.println("Valor total dos salarios a serem pagos pela escola: " + valorTotal + "\n");
	}
	
	public static void main(String args[]) {
	    
	    Escola imd = new Escola();
		
		ProfessorIntegral silvio = new ProfessorIntegral("Silvio", "20139475281", "15/02/1982", 8700, "imd");
		ProfessorIntegral kayo = new ProfessorIntegral("Kayo", "20160638291", "13/03/1987",5300.0, "imd");
		ProfessorIntegral gibeon = new ProfessorIntegral("Gibeon", "20136489304", "18/06/1815", 8900.0, "DIMAP");
		
		ProfessorHorista eigi = new ProfessorHorista("Eigi", "20155379271", "21/09/1950", 9100.0, 500);
		ProfessorHorista renan = new ProfessorHorista("Renan", "20196180396", "04/05/1980", 4900.0, 420);
		ProfessorHorista charles = new ProfessorHorista("Charles", "20140759263", "19/12/1990", 15000.0, 570);
		
		// Adicionando professores na escola
		imd.adicionarProfessor(silvio);
		imd.adicionarProfessor(kayo);
		imd.adicionarProfessor(gibeon);
		imd.adicionarProfessor(eigi);
		imd.adicionarProfessor(renan);
		imd.adicionarProfessor(charles);
		
		System.out.println();
		
		//
		imd.quantidadeProfessores();
		imd.maiorSalario();
		imd.professorMaisNovo();
		imd.listarProfessorIntegral();
		imd.totalSalariosAPagar();
		imd.removerProfessor(silvio);
		imd.quantidadeProfessores();
	}

}
