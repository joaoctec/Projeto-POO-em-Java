package br.com.itau.conta;

public class ContaBancaria {

	private String titular;
	private double saldo;
	private String nuconta;
	private String data;
	
	public ContaBancaria(String titular, double saldo, String nuconta, String data) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.nuconta = nuconta;
		this.data = data;
	}
	
	public void verificarSaldo() {
		System.out.println("Titular: "+titular);
		System.out.println("Numero Conta"+nuconta);
		System.out.println("Saldo:"+saldo);
		System.out.println("Data: "+data);
		
	}
	
	public void depositar(double valor) {
		saldo+=valor;
		System.out.println("Saldo atual: "+saldo);
		
		
	}public void sacar(double valor) {
		saldo+=valor;
		//if
		System.out.println("Saldo atual,após saque: "+valor);
		
		
	}	
}
