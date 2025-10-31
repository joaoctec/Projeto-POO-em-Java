package br.com.davi.main;

import br.com.davi.animal.AnimalFactory;
import br.com.davi.interfac.Animal;

public class Main {

	public static void main(String[] args) {
	AnimalFactory objAnimalFactory = new AnimalFactory();
	Animal objGato = objAnimalFactory.gerarAnimal("Gato");
	objGato.emitirSom();

	}

}
