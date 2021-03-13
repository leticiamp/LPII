package br.ufrn.imd.q1.controle;

import java.util.ArrayList;
import br.ufrn.imd.q1.modelo.Funcionario;

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
			System.out.println("Bonus..: " + f.getBonificacao());
		}
		System.out.println("****************************************");
		System.out.println("Total das bonificacoes.: " + bonos.getTotalBonificacoes());
		System.out.println("****************************************");
	}
}
