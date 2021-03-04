package br.ufrn.imd.lp.funcionario;

import java.util.ArrayList;

public class FuncionarioDAO {

	private ArrayList<Funcionario> funcionarios;
	private ControleBonificacao bonos = new ControleBonificacao();

	public FuncionarioDAO() {
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public void cadastrarFuncionario(Funcionario f) {
		this.funcionarios.add(f);
		bonos.registraBonificacoes(f);
	}

	public void listarFuncionarios() {

		for (Funcionario f : funcionarios) {
			System.out.println("****************************************");
			System.out.println("Nome...: " + f.getNome() + " - " + f.getClass());
			System.out.println("CPF....: " + f.getCpf());
			System.out.println("Salario: " + f.getSalario());
			System.out.println("Bonos..: " + f.getBonificacao());
		}
		System.out.println("****************************************");
		System.out.println("Total das bonificacoes.: " + bonos.getTotalBonificacoes());
		System.out.println("****************************************");
	}
}
