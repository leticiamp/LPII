public class ProfessorHorista extends Professor {

	private int horasTrabalhadas;
	private double valorHora;
	
	public ProfessorHorista(String nome, String matricula, String dataNascimento, double salario, int horasTrabalhadas) {
		super(nome, matricula, dataNascimento, salario);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = 25.0;
	}
	
	public int gethorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void sethorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public void print() {
	    System.out.println("Nome: " + this.nome);
	    System.out.println("Matrícula: " + this.matricula);
	    System.out.println("Data de nascimento: " + this.dataNascimento);
	    System.out.println("Salário: " + this.salario);
	    System.out.println("Horas trabalhadas: " + this.horasTrabalhadas);
	    System.out.println("Valor da hora: " + this.valorHora + "\n");
	}
}
