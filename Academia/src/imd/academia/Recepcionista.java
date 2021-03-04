package imd.academia;

import java.util.ArrayList;

public class Recepcionista extends Funcionario {
	
	private String horarioTrabalho;
	private ArrayList<String> listaHorarios;
	
	public Recepcionista(String nome, String matricula, String horarioTrabalho) {
		super(nome, matricula);
		this.listaHorarios = new ArrayList<String>();
		adicionarHorario(horarioTrabalho);
	}

	public String getListaHorarios() {
		return horarioTrabalho;
	}

	public void setListaHorarios(String horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}
	
	// Adiciona o horario de trabalho na lista de horarios da recepcionista
	public void adicionarHorario(String horario) {
		this.listaHorarios.add(horario);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome.: ");
		sb.append(this.nome + " ");
		sb.append(horariosToString());
		
		return sb.toString();
	}
	
	private String horariosToString() {
		
		int contador = 0;
		StringBuilder sb = new StringBuilder();
		
		sb.append("{");
		for(String s : this.listaHorarios) {
			sb.append(s);
			if(contador < listaHorarios.size()-1) {
				sb.append(", ");
			}
			else {
				sb.append("}");
			}
			contador++;
		}
		return sb.toString();
	}
}
