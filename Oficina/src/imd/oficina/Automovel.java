package imd.oficina;

import java.util.ArrayList;
import java.util.Comparator;

public class Automovel extends Veiculo {

	public ArrayList<Integer> oleoTrocado;

	public Automovel(String dono, String marca, int anoFabricacao, boolean oleoTrocado) {
		super(dono, marca, anoFabricacao);
		this.oleoTrocado = new ArrayList<Integer>();
	}

	/*public void trocarOleo(Automovel a) {
		System.out.println("Oleo trocado!");
		oleoTrocado.add(a.getAnoFabricacao());
	}*/
	
	public void trocarOleo() {
		System.out.println("Oleo trocado!");
		oleoTrocado.add(getAnoFabricacao());
	}

	@Override
	public void limparVeiculo() {
		System.out.println("Automovel esta limpo!");
	}
	
	public class OrdenaAnoFabricacao implements Comparator<Automovel> {
		
	    @Override
	    public int compare(Automovel um, Automovel dois) {
	    	
	        return um.getAnoFabricacao() - dois.getAnoFabricacao();
	    }
	}
}
