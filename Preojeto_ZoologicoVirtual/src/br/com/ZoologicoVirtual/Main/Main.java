package br.com.ZoologicoVirtual.Main;
import br.com.ZoologicoVirtual.Animais.*;

public class Main {

	public static void main(String[] args) {

	Mamiferos objElefante = new Mamiferos(" Macho ", " Elefante-africano ",300, " Quadrúpede "," fome e velhice " ," Savana africana","placentários");	
		objElefante.Clase();
		objElefante.comer();
		objElefante.Dormir();
		objElefante.Mamar();
		objElefante.informacao();
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
		
	Aves objArara = new Aves(" Macho "," Arara-Azul1 ",100,"bipedi","Predadores naturais e velhice","Florestas tropicais da América do Sul","Amartelo","azul");	
		objArara.Classe();
		objArara.comer();
		objArara.Dormir();
		objArara.Voar();
		objArara.criar_ninho();
		objArara.informacao();
		
	}

}
