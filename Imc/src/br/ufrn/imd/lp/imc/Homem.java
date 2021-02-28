package br.ufrn.imd.lp.imc;

public class Homem extends PessoaIMC {

	public Homem(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento, peso, altura);
	}

	@Override
	public String resultIMC() {

		double imc = calculaIMC(this.altura, this.peso);
		String resultadoIMC;

		if (imc < 20.7) {
			resultadoIMC = "Abaixo do peso ideal";
		} else if (imc >= 20.7 && imc <= 26.4) {
			resultadoIMC = "Peso ideal";
		} else {
			resultadoIMC = "Acima do peso ideal";
		}

		return resultadoIMC;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("----------------------------------------\n");
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
