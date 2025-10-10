package br.com.ZoologicoVirtual.Animais;

public class Animais {
	
	private String genero;
	private String especie;
	private int tamanho;
	private String modo_de_andar;
	private String como_Morre;
	private String habtate_natural;
	
	
	public Animais(String genero, String especie, int tamanho, String modo_de_andar, String como_Morre,
			String habtate_natural) {
		super();
		this.genero = genero;
		this.especie = especie;
		this.tamanho = tamanho;
		this.modo_de_andar = modo_de_andar;
		this.como_Morre = como_Morre;
		this.habtate_natural = habtate_natural;
	}
	
	public void comer() {
		
		System.out.println("Animal comendo");
		
	}
	public void Dormir() {
		
		System.out.println("Animal Dormindo");
		
	}
/*ecapsulamento*/
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		if(genero == " Macho ") {
			this.genero = genero;
			}else {
				System.out.println("Nao alterar");
			}
		}
	

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		if(especie == " Elefante-africano ") {
		this.especie = especie;
		}else {
			System.out.println("Nao alterar");
		}
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		if(tamanho == 300) {
			this.tamanho = tamanho;
			}else {
				System.out.println("Nao alterar");
			}
		}
	
	public String getModo_de_andar() {
		return modo_de_andar;
	}

	public void setModo_de_andar(String modo_de_andar) {
			if(modo_de_andar == " Quadrúpede ") {
				this.modo_de_andar = modo_de_andar;
				}else {
					System.out.println("Nao alterar");
				}
			
	}

	public String getComo_Morre() {
		return como_Morre;
	}

	public void setComo_Morre(String como_Morre) {
		if(como_Morre == " fome e velhice ") {
			this.como_Morre = como_Morre;
			}else {
				System.out.println("Nao alterar");
			}
		
	}

	public String getHabtate_natural() {
		return habtate_natural;
	}

	public void setHabtate_natural(String habtate_natural) {
		if(habtate_natural == " Savana africana") {
		this.habtate_natural = habtate_natural;
		}else {
			System.out.println("Nao alterar");
		}
	}
   
	
}