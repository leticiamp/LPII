
public class Main {

	public static void main(String[] args) {
		
		Loja loja = new Loja();
		Carro argo = new Carro("Fiat", "Argo", "VVV-0000", 890.0, true, 1.6, 4);
		Carro bravo = new Carro("Fiat", "Bravo", "BBB-1111", 710.9, false, 1.8, 4);
		Carro up = new Carro("Volkswagen", "up!", "UUU-2222", 847.5, true, 1.0, 2);
		Moto diavel = new Moto("Ducati", "Diavel", "DDD-3333", 1030.6, true, 1198, Moto.TipoPartida.ELETRICA);
		Moto cb500x = new Moto("Honda", "CB 500X", "HHH-4444", 591.3, false, 1000, Moto.TipoPartida.MANUAL);
		Moto vulcan = new Moto("Kawasaki", "Vulcan", "KKK-5555", 758.2, true, 1500, Moto.TipoPartida.ELETRICA);
		
		System.out.println("\n########## Loja de veiculos ##########\n");
		
		loja.adcionarVeiculo(argo);
		loja.adcionarVeiculo(bravo);
		loja.adcionarVeiculo(up);
		loja.adcionarVeiculo(diavel);
		loja.adcionarVeiculo(cb500x);
		loja.adcionarVeiculo(vulcan);
		
		loja.exibirVeiculos();
		loja.exibirVeiculosAlugados();
		loja.exibirVeiculosDisponiveis();
		loja.exibirMaiorAluguel();
		loja.exibirMarcaMaiorQtd();
		
		loja.removerVeiculo(argo);
		loja.exibirVeiculos();
	}

}
