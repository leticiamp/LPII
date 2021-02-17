import java.util.Date;

public class Professor {

	protected String nome;
	protected String matricula;
	protected Date dataNascimento;
	protected double salario;

	public Professor(String nome, String matricula, String dataNascimento, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = DateUtils.convertStringToDate(dataNascimento);
		this.salario = salario;

	}

	public Professor() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Salário: " + this.salario + "\n");
	}

}
