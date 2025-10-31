package br.com.davi.animal;

import br.com.davi.interfac.Animal;

public class AnimalFactory {
	
	public  Animal gerarAnimal (String tipo ) {
		
		if (tipo=="Gato") {
			return new Gato();
			
		}else if (tipo =="Cachorro" ) {
			return new Cachorro(); 
			
		}else {
			return null;
		}
	}

}
