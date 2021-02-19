package imd.oficina;

public class Veiculo {

	protected String dono;
	protected String marca;
	protected Integer anoFabricacao;

	public Veiculo(String dono, String marca, Integer anoFabricacao) {
		this.dono = dono;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void limparVeiculo() {
		System.out.println("Veiculo esta limpo!");
	}

}
