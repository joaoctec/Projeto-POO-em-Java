package br.com.ZoologicoVirtual.Animais;

public class Mamiferos extends Animais {

	private String tipoGestacao;

	public Mamiferos(String genero, String especie, int tamanho, String modo_de_andar, String como_Morre,String habtate_natural, String tipoGestacao) {
		super(genero, especie, tamanho, modo_de_andar, como_Morre, habtate_natural);
		this.tipoGestacao = tipoGestacao;
	}
	
	public void Mamar() {
		
		System.out.println("Filhote mamando");
		
	}
	public void Clase() {
		
		System.out.println("Mamifero");
		
	}
	 public void informacao() {
			
		System.out.println("\n"+"Infomacoes do animal--> genero:"+ getGenero() +"\nEspecie:" +getEspecie()+"\nTamanho:"+getTamanho()+"\nModo de Andar:"+getModo_de_andar()+"\n"+"Morte:"+getComo_Morre()+"\nHabtate natural:"+getHabtate_natural()+" \nTipo de gestaçao:" + tipoGestacao);
			
		}
	
}
