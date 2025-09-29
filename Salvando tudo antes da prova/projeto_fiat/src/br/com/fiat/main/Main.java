package br.com.fiat.main;

import br.com.fiat.veiculo.Carro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//vamos intacear um (objeto forma)
		
		Carro objFerrari = new Carro("Ferrari","488 Spider",2023);
		objFerrari.acelerar();
		objFerrari.exibirInformacoesCarro();
		
		// agora vou tarzer um fiat da forma
		
		Carro objFiat = new Carro("Fiat","Uno",2007);
		objFiat.acelerar();
		objFiat.exibirInformacoesCarro();
		
	}

}
