package br.com.ZoologicoVirtual.Animais;

public class Aves extends Animais{
	
	private String cor_de_penas;
	private String cor_do_bico;
	
	public Aves(String genero, String especie, int tamanho, String modo_de_andar, String como_Morre,
			String habtate_natural, String cor_de_penas, String cor_do_bico) {
		super(genero, especie, tamanho, modo_de_andar, como_Morre, habtate_natural);
		this.cor_de_penas = cor_de_penas;
		this.cor_do_bico = cor_do_bico;
	}
	public void Voar() {
		
		System.out.println("Ave voando");
		
	}	
	public void Classe() {
		
		System.out.println("Ave");
		
	}	
    public void criar_ninho() {
		
		System.out.println("Criando ninho para os filhotes");
		
	}	
    public void informacao() {
		
		System.out.println("\n"+"Infomacoes do animal--> genero:"+ getGenero() +"\nEspecie:" +getEspecie()+"\nTamanho:"+getTamanho()+"\n"+"Modo de Andar:"+getModo_de_andar()+"\nMorte:"+getComo_Morre()+"\nHabtate natutal:"+getHabtate_natural()+"\nCor do bico:" + cor_do_bico + "\nCor das penas:"+cor_de_penas);
			
		}
	

}
