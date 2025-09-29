package br.com.animal.felino;

public class Felino {

	//caracteriaticas(atributos,propriedades)
	
	private String raca;
	private String cor;
	
	//inicializar os atributos da clsse
	public Felino(String raca, String cor) {
		super();
		this.raca = raca;
		this.cor = cor;
	}
	
	//meodo da clasee
	public void MIar() {
		System.out.println("Gata, Miando");
		
		
	}
	
	public void infomaçoes() {
		
		System.out.println("Raça: "+raca);
		System.out.println("cor: "+cor);
		
	}
	
	
}
