package br.ufrn.imd.lp.imc;

public abstract class PessoaIMC extends Pessoa {
	
	protected double peso;
	protected double altura;
	protected double imc;
	
	public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento);
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getImc() {
		return imc;
	}
	
	public void setImc(double imc) {

		this.imc = imc;
	}
	
	public double calculaIMC(double altura, double peso) {
		
		this.imc = peso/(altura*altura);
		return this.imc;
	}
	
	public abstract String resultIMC();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome: ");
		sb.append(this.nome);
		sb.append("\n");
		sb.append("Data de nascimento: ");
		sb.append(this.dataNascimento);
		sb.append("\n");
		sb.append("Peso: ");
		sb.append(this.peso);
		sb.append("\n");
		sb.append("Altura: ");
		sb.append(this.altura);
		
		return sb.toString();
	}

}
