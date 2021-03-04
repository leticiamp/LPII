package br.ufrn.imd.lp.conta;

public class ContaCorrente {

	protected String agencia;
	protected String numero;
	protected double saldo;

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
		
		this.saldo -= valor;
		System.out.println("Saque de " + valor + " em [" + "] efetuado com sucesso!");
	}

	public void depositar(double valor) {
		
		this.saldo += valor;
		System.out.println("Deposito de " + valor + " em ["+ "] efetuado com sucesso!");
	}
	
	public boolean transferir(double valor, ContaCorrente cc) {
		
		this.saldo -= valor;
		cc.saldo += valor;
		System.out.println("Transferindo " + valor + " para [" + "]");
		
		return true;
	}
}
