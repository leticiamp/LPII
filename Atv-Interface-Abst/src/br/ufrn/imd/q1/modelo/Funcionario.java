package br.ufrn.imd.q1.modelo;

public abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected double salario;
	protected double bonificacao;
	public abstract double calcularBonificacao();
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}
}
