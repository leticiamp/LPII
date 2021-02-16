import java.util.Scanner;

public class Gerente {
	private String nome;
	private double salario;
	Scanner ler = new Scanner(System.in);
	
	public Gerente() {}
	
	public void setNome() {
		System.out.printf("\n######################################\n");
		System.out.printf("Nome do Gerente: ");
		nome = ler.nextLine();
	}
	
	public void setSalario() {
		System.out.printf("Salário do Gerente: ");
		salario = ler.nextDouble();
		System.out.printf("######################################\n");
	}
	
	public void aumentoFixo() {
		salario *= 1.1;
		
		System.out.printf("######################################\n");
		System.out.printf("Gerente: " + nome + " recebeu um aumento de salário de 10%%\n");
		System.out.println("");
	}
	
	public void aumentoVariavel() {
		double aumento;
		
		System.out.printf("######################################\n");
		System.out.printf("\n######################################\n");
		System.out.printf("Novo percentual de aumento: ");
		
		aumento = ler.nextDouble();
		salario *= (1 + aumento);
		
		System.out.printf("######################################\n");
		System.out.printf("\nGerente: " + nome + " recebeu um aumento de salário de " + (aumento*100) + "%%\n");
	}
	
	public void imprimirSalario() {
		System.out.printf("Salário atual: " + salario + "\n");
	}
}