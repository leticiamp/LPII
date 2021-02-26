package imd.oficina;

import java.util.Comparator;

public class Automovel extends Veiculo {
	
	private boolean oleoTrocado;
	
	public Automovel(String dono, String marca, int anoFabricacao, boolean oleoTrocado) {
		super(dono, marca, anoFabricacao);
	}

	public boolean isOleoTrocado() {
		return oleoTrocado;
	}

	public void setOleoTrocado(boolean oleoTrocado) {
		this.oleoTrocado = oleoTrocado;
	}
	
	public void trocarOleo() {
	
		this.oleoTrocado = true;
	}

	@Override
	public void limparVeiculo() {
		System.out.println("Automovel esta limpo!");
	}
	
	public static Comparator<Automovel> comparatorAutomovelDesc = new Comparator<Automovel>() {
		
		public int compare(Automovel a1, Automovel a2) {
			
			double x = a2.getAnoFabricacao() - a1.getAnoFabricacao();
			if(x > 0) {
				return 1;
			}
			else if(x == 0) {
				return 0;
			}
			else {
				return -1;
			}
		}
	};
}
