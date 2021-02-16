public class ExecutaMaquinaRefrigerante {
	
	// Criando o método executável da classe
		public static void main(String args[]) {
			
			// Instanciar a classe
			MaquinaRefrigerante maquina = new MaquinaRefrigerante(5);
			
			// Chamando um método
			maquina.imprimirPreco();
			
			// Inserir dinheiro na máquina
			System.out.println("");
			maquina.inserirDinheiro(18);
			
			// Retornando o balanco corrente
			System.out.println("");
			System.out.println("Balanço atual => " + maquina.getBalanco());
			
			// Comprar
			maquina.comprarRefrigerante();
			
			// Retornando o balanco corrente
			System.out.println("");
			System.out.println("Balanço atual => " + maquina.getBalanco());
			
			// Comprar
			maquina.comprarRefrigerante();
			
			// Retornando o balanco corrente
			System.out.println("");
			System.out.println("Balanço atual => " + maquina.getBalanco());
			
			maquina.setDarTroco();
			
			// Comprar
			maquina.comprarRefrigerante();
			
			maquina.imprimirMovimentoDia();
		}
	
}