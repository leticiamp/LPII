public class Veiculo {
    
    protected String marca;
    protected String modelo;
    protected String placa;
    protected double valorAluguel;
    protected boolean alugado;
    
    public Veiculo(String marca, String modelo, String placa, double valorAluguel, boolean alugado) {
    	this.marca = marca;
    	this.modelo = modelo;
    	this.placa = placa;
    	this.valorAluguel = valorAluguel;
    	this.alugado = alugado;
    	
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public double getValorAluguel() {
        return this.valorAluguel;
    }
    
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
    
    public boolean getAlugado() {
        return this.alugado;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public void print() {
        
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Valor do aluguel: " + this.valorAluguel);
    }
}