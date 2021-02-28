package br.ufrn.imd.lp.imc;

import java.util.Date;

public class Pessoa {

	protected String nome;
	protected Date dataNascimento;

	public Pessoa(String nome, String dataNascimento) {
		this.nome = nome;
		this.dataNascimento = DateUtils.convertStringToDate(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Nome: ");
		sb.append(this.nome);
		sb.append("\n");
		sb.append("Data de nascimento: ");
		sb.append(this.dataNascimento);

		return sb.toString();
	}
}
