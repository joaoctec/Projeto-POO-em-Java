package br.com.IMC.Main;
import br.com.IMC.Pessoas.*;

public class Main {
	
    public static void main(String[] args) {
    	
    	System.out.println("--- Cálculo do IMC ---");
    	
    	System.out.println("--------------------------------------------------");
        
        Pessoa objPessoa = new Pessoa("João", 70.0, 1.75);
        	objPessoa.informacao();
        	objPessoa.IMC();

        System.out.println("--------------------------------------------------");

        Atleta objAtleta = new Atleta("Maria", 65.0, 1.70, "Natação");
        	objAtleta.informacao();
        	objAtleta.IMC();
        	objAtleta.praticarEsporte();
        	objAtleta.reduzIMC();
    }
}
        
        	
    