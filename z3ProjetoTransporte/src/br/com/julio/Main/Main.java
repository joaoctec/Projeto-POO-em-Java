package br.com.julio.Main;

import br.com.julio.transporte.Transporte;
import br.com.julio.transporte.Onibus; 
import br.com.julio.transporte.Metro;
import br.com.julio.transporte.Bicicleta;

public class Main {

    public static void main(String[] args) {

    	System.out.println("----Onibus----"); 
        Transporte objOnibus = new Onibus("Mercerdes A2987", 40, true);
        System.out.println(objOnibus.calcularTarifa(30)); 
        objOnibus.exibirInformacoes();

        System.out.println("-----Metro-----"); 
        Transporte objMetro = new Metro("Linha-Verde", 1200, 6);
        System.out.println(objMetro.calcularTarifa(15)); 
        objMetro.exibirInformacoes();

        System.out.println("-----Bicicleta-------"); 
        Transporte objBicicleta = new Bicicleta("Bike-Vermelha", 1, true);
        System.out.println(objBicicleta.calcularTarifa(45)); 
        objBicicleta.exibirInformacoes();
    }

}