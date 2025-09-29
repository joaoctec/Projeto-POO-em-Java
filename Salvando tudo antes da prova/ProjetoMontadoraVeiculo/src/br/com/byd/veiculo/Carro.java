package br.com.byd.veiculo;

public class Carro extends Veiculo {

	private int QtdRodas;
	private int QtdBancos;
	private String motor;
	
	public Carro(int ano, String cor, String modelo, int qtdRodas, int qtdBancos, String motor) {
		super(ano, cor, modelo);
		this.QtdRodas = qtdRodas;
		this.QtdBancos = qtdBancos;
		this.motor = motor;
	}
	
	
	public void abrirAirBagColuna() {
		System.out.println("Abrrindo AirBag");
		
	}
}
