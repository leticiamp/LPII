package br.ufrn.imd.lp.imc;

public class Principal {

	public static void main(String[] args) {
		
		ArrayPessoa pessoas = new ArrayPessoa();
		Homem cephas = new Homem("Cephas", "17/03/1986", 62, 180);
		Mulher leticia = new Mulher("Leticia", "16/04/1998", 50.1, 156);
		
		pessoas.adicionar(cephas);
		pessoas.adicionar(leticia);
		
		pessoas.printPessoas();
	}

}
