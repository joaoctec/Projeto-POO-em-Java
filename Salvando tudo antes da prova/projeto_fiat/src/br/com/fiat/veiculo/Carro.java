package br.com.fiat.veiculo;

public class Carro {
	
	//Atributos - Caracteristicas
	private String marca ; // fiat nao pode ficar aqui se nao A STRINT SEMPRE VAI VAI SER FIAT
	private String modelo;
	private int ano;
	
	public Carro(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public void acelerar() {
     System.out.println(modelo+" Carro acelerado ..... Vrummm");
		
	}
	public void exibirInformacoesCarro() {
		
		System.out.println("esse e o carro"+" " + modelo +" "+ marca +" "+ ano +" ");
		
	}
}
