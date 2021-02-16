package imd.lp2.main;

public class Xadrez {
	
	public static void main(String[] args) {
		
		Peca peao = new Peao();
		Peca cavalo = new Cavalo();
		Peca bispo = new Bispo();
		
		peao.moverPeca();
		cavalo.moverPeca();
		bispo.moverPeca();
	}
}