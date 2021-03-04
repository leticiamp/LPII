package br.ufrn.imd.lp.funcionario;

public class RecursosHumanos {
	
	public static void main(String[] args) {
		
		FuncionarioDAO funcionario = new FuncionarioDAO();
		
		Secretaria flavia = new Secretaria("Flavia", "537.920.638-35", 2300);
		Secretaria jose = new Secretaria("Jose", "417.338.016-34", 2160);
		Diretor itamir = new Diretor("Itamir", "916.338.025-13", 10650);
		Diretor jacy = new Diretor("Jacy", "538.119.036-34", 15000);
		Gerente sergio = new Gerente("Sergio", "537.027.548-40",3200);
		Gerente wanessa = new Gerente("Wanessa", "415.728.304-84",3200);
		
		funcionario.cadastrarFuncionario(flavia);
		funcionario.cadastrarFuncionario(jose);
		funcionario.cadastrarFuncionario(itamir);
		funcionario.cadastrarFuncionario(jacy);
		funcionario.cadastrarFuncionario(sergio);
		funcionario.cadastrarFuncionario(wanessa);
		
		funcionario.listarFuncionarios();
	}
	
}
