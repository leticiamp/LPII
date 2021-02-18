package imd.academia;

import java.util.ArrayList;

public class Recepcionista extends Funcionario {
	
	private String horarioTrabalho;
	private ArrayList<String> listaHorarios;

	public String getListaHorarios() {
		return horarioTrabalho;
	}

	public void setListaHorarios(String horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}

	public Recepcionista(String nome, String matricula, String horarioTrabalho) {
		super(nome, matricula);
		adicionarHorario(horarioTrabalho);
	}
	
	// Adiciona o horario de trabalho na lista de horarios da recepcionista
	public void adicionarHorario(String horario) {
		this.listaHorarios.add(horario);
	}
}
