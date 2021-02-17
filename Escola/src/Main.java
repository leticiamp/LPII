
public class Main {

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
		
		System.out.println();
		System.out.println("Silvio tem " + DateUtils.calcAge(silvio.getDataNascimento()) + " anos");
	}
}
