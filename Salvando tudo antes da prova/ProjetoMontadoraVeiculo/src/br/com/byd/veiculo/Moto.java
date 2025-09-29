package br.com.byd.veiculo;

public class Moto extends Veiculo{

	private int QtddeRodas;
	private int PeDeApoio;
	private String quidao;
	
	public Moto(int ano, String cor, String modelo, int qtddeRodas, int PeDeApoio, String quidao) {
		super(ano, cor, modelo);
		this.QtddeRodas = qtddeRodas;
		this.PeDeApoio = PeDeApoio;
		this.quidao = quidao;
	}
	
	public void acionarPedeApoio() {
		System.out.println("Acionar pé de Apoio");
		
	}
	
	
}
