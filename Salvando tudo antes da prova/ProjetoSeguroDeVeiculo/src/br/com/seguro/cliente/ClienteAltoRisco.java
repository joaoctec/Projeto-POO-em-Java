package br.com.seguro.cliente;

public class ClienteAltoRisco extends Cliente {

	public ClienteAltoRisco(String nome) {
		super(nome);
	}

	@Override
	public double CalculaValorSeguro(double valor) {
		// TODO Auto-generated method stub
		return super.CalculaValorSeguro(valor)+500;
	}
	
	

}
