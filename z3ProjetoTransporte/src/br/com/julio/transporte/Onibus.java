package br.com.julio.transporte;

import br.com.julio.interfaces.Manutenivel;

public class Onibus extends Transporte implements Manutenivel{
 
	private boolean possuiArCondicionado;

    public Onibus(String modelo, int capacidade, boolean possuiArCondicionado) {
        super(modelo, capacidade);
        this.possuiArCondicionado = possuiArCondicionado;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double calcularTarifa(double distancia) {
        // TODO Auto-generated method stub
        double tarifaBase = 5.50;
        double tarifaAcrescimo = 0.70;
        double tarifaCalculada = tarifaBase + (tarifaAcrescimo * distancia);

        return tarifaCalculada;
    }

    public boolean verificarManutencao() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void realizarManutecao() {
        // TODO Auto-generated method stub
        System.out.println("Manutenção em dia...");

    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    @Override
    public void exibirInformacoes() {
        // TODO Auto-generated method stub
        super.exibirInformacoes();
        System.out.println("Tem ar condicionado? " + possuiArCondicionado);

    }

}
