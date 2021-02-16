public class ExecutarGerente {
	
	public static void main(String args[]) {
		Gerente gerente = new Gerente();
		
		gerente.setNome();
		gerente.setSalario();
		gerente.imprimirSalario();
		
		gerente.aumentoFixo();
		gerente.imprimirSalario();
		
		gerente.aumentoVariavel();
		gerente.imprimirSalario();
	}
}
