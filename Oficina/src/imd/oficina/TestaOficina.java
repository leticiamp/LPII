package imd.oficina;

public class TestaOficina {

	public static void main(String[] args) {
		
		Oficina oficina = new Oficina();
		
		Bicicleta bike1 = new Bicicleta("Daniel", "Fiat", 2011);
		Bicicleta bike2 = new Bicicleta("Rafael", "Ford", 2019);
		Automovel versa = new Automovel("Henrique", "Nissan", 2010, false);
		Automovel clio = new Automovel("Leticia", "Renault", 2012, true);
		
		oficina.adcionarVeiculo(versa);
		oficina.adcionarVeiculo(clio);
		oficina.adcionarVeiculo(bike1);
		oficina.adcionarVeiculo(bike2);
		
		oficina.manutencaoVeiculos();
		System.out.println("### Lista Ordenada de Fabricacao ###");
		for(Automovel a : oficina.getAutomoveisOleoTrocadoByAno()) {
			System.out.println("Marca: " + a.marca + " Ano de Fabricacao: " + a.anoFabricacao);
		}
	}

}
