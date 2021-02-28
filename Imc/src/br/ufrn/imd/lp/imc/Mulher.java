package br.ufrn.imd.lp.imc;

public class Mulher extends PessoaIMC {

	public Mulher(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	@Override
	public String resultIMC() {

		double imc = calculaIMC(this.altura, this.peso);
		String resultadoIMC;

		if (imc < 19) {
			resultadoIMC = "Abaixo do peso ideal";
		} else if (imc >= 19 && imc <= 25.8) {
			resultadoIMC = "Peso ideal";
		} else {
			resultadoIMC = "Acima do peso ideal";
		}

		return resultadoIMC;
	}

	@Override
	public String toString() {

		System.out.println("------------------------------------------------");
		
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
		sb.append("\n");
		sb.append("IMC: ");
		sb.append(resultIMC());
		
		return sb.toString();
	}
}
