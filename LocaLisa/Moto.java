public class Moto extends Veiculo {
    
    public enum TipoPartida {
        MANUAL, ELETRICA;
    }
    
    private int cilindradas;
    private TipoPartida tipo;

	public Moto(String marca, String modelo, String placa, double valorAluguel, boolean alugado, int cilindradas,
			TipoPartida tipo) {
		super(marca, modelo, placa, valorAluguel, alugado);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}

	public int getCilindradas() {
        return this.cilindradas;
    }
    
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void print() {
    	super.print();
    	System.out.println("Cilindradas: " + this.cilindradas);
    	System.out.println("Tipo de partida: " + this.tipo + "\n");
    }
}