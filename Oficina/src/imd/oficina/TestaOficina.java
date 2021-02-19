package imd.oficina;

public class TestaOficina {

	public static void main(String[] args) {
		
		BancoDeDados banco = new BancoDeDados();
		Oficina oficina = new Oficina();
		
		Bicicleta bike1 = new Bicicleta("Daniel", "Fiat", 2011);
		Bicicleta bike2 = new Bicicleta("Rafael", "Ford", 2019);
		Automovel versa = new Automovel("Henrique", "Nissan", 2010, false);
		Automovel clio = new Automovel("Leticia", "Renault", 2012, true);
		
		banco.adcionarVeiculo(versa);
		banco.adcionarVeiculo(clio);
		banco.adcionarVeiculo(bike1);
		banco.adcionarVeiculo(bike2);
		
		System.out.println("\n########## Manutencao de veiculos ##########\n");
		oficina.manutencao(bike1);
		oficina.manutencao(bike2);
		oficina.manutencao(versa);
		oficina.manutencao(clio);
		System.out.println("\n############################################\n");
	}

}
