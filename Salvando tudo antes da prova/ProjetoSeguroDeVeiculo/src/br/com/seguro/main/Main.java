package br.com.seguro.main;

import br.com.seguro.cliente.Cliente;
import br.com.seguro.cliente.ClienteAltoRisco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente objCliente = new Cliente("Julio");
		objCliente.CalculaValorSeguro(2000);
		
		double valorPadrao = 2000;
		
		System.out.println("Nome Cliente:"+ objCliente.getNome());
		System.out.println("Valor doseguro:"+ objCliente.CalculaValorSeguro(valorPadrao));

		System.out.println("=============================================================");
		
		ClienteAltoRisco objClienteAltoRisco = new ClienteAltoRisco("Maria");
		objClienteAltoRisco.CalculaValorSeguro(valorPadrao);

		System.out.println("Nome do cliente:"+ objClienteAltoRisco.getNome());
		System.out.println("Valor do seguro:"+ objClienteAltoRisco.CalculaValorSeguro(valorPadrao));
	
	}

}
