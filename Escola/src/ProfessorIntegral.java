public class ProfessorIntegral extends Professor {
	
	private String departamento;
	
	public ProfessorIntegral(String nome, String matricula, String dataNascimento, double salario, String departamento) {
		super(nome, matricula, dataNascimento, salario);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public void print() {
	    System.out.println("Nome: " + this.nome);
	    System.out.println("Matrícula: " + this.matricula);
	    System.out.println("Data de nascimento: " + this.dataNascimento);
	    System.out.println("Salário: " + this.salario);
	    System.out.println("Departamento: " + this.departamento + "\n");
	}
}
