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
		
		for(Professor p : professores) {
			if(p.getSalario() > maior) {
				maior = p.getSalario();
				prof = p.getNome();
			}
		}
		
		System.out.println("O professor com maior salario: " + prof + ", que recebe R$" + maior + "\n");
	}
	
	// Informar o professor mais novo na escola
	public void professorMaisNovoNaEscola() {
	    Professor maisNovo = new Professor();
	    
		maisNovo = professores.get(professores.size()-1); // ultimo prof adicionado
		System.out.println("Professor mais novo na escola: " + maisNovo.getNome() + "\n");
	}
	
	// Informar o professor mais novo
		public void professorMaisNovo() {
		    Professor maisNovo = new Professor();
		    int idade = 0;
		    int temp = 0;
		    
		    for(int i = 0; i < professores.size(); i++) {
		    	temp = DateUtils.calcAge(professores.get(i).getDataNascimento());
		    	
		    	if(i == 0 || idade > temp) {
		    		idade = temp;
		    		maisNovo = professores.get(i);
		    	}
		    }
		    
			System.out.println("Professor mais novo: " + maisNovo.getNome() + "\n");
		}
	
	// Listar os professores de regime integral e seus respectivos departamentos
	public void listarProfessorIntegral() {
		
		System.out.println("Professores em regime integral:");
		for(Professor p : professores) {
			if (p instanceof ProfessorIntegral) {
				((ProfessorIntegral) p).print();
			}
		}
		
	}
	
	// Listar o total de salarios a ser pago pela escola
	public void totalSalariosAPagar() {
	    double valorTotal = 0;
	    
	    for(Professor p : professores) {
	        valorTotal += p.getSalario();
	    }
	    System.out.println("Valor total dos salarios a serem pagos pela escola: " + valorTotal + "\n");
	}
	
	

}
