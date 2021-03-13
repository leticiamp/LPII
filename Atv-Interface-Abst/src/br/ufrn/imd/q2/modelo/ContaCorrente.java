package br.ufrn.imd.q2.modelo;

public class ContaCorrente implements Tributavel {

	protected String agencia;
	protected String numero;
	protected double saldo;
	
	public ContaCorrente(String agencia, String numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}	

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de " + valor + " em [" + this.numero + "] efetuado com sucesso!");
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Deposito de " + valor + " em ["+ this.numero + "] efetuado com sucesso!");
	}
	
	public boolean transferir(double valor, ContaCorrente cc) {
		
		if(valor <= this.saldo) {
			this.saldo -= valor;
			cc.saldo += valor;
			System.out.println("Transferindo " + valor + " para [" + cc.getNumero() + "]");
			
			return true;
		}
		else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}

	@Override
	public double calcularTributos() {
		
		double valor = this.saldo * 0.0038;
		
		return valor;
	}
}
