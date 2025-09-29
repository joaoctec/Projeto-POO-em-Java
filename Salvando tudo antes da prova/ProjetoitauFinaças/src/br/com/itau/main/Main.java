package br.com.itau.main;
import br.com.itau.conta.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ContaBancaria objConta = new ContaBancaria("Julio",1000,"CC1023","22/08/2025");
	objConta.verificarSaldo();
	objConta.depositar(1000);
	objConta.verificarSaldo();
	
		
	}

}
