package br.ufrn.imd.lp2;

public class Carro extends Veiculo {
    
    private double potenciaMotor;
    private int quantidadePortas;
    

    
    public Carro(String marca, String modelo, String placa, double valorAluguel, boolean alugado, double potenciaMotor,
			int quantidadePortas) {
		super(marca, modelo, placa, valorAluguel, alugado);
		this.potenciaMotor = potenciaMotor;
		this.quantidadePortas = quantidadePortas;
	}

	public double getPotenciaMotor() {
        return this.potenciaMotor;
    }
    
    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }
    
    public int getQuantidadePortas() {
        return this.quantidadePortas;
    }
    
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    
    @Override
    public void print() {
    	super.print();
    	System.out.println("Potencia do motor: " + this.potenciaMotor);
    	System.out.println("Quantidade de portas: " + this.quantidadePortas + "\n");
    }

}