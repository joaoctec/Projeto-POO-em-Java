package br.com.julio.transporte;

import br.com.julio.interfaces.Manutenivel;

public class Metro extends Transporte implements Manutenivel {

    private int numeroDeVagoes;

    public Metro(String modelo, int capacidade, int numeroDeVagoes) {
        super(modelo, capacidade);
        this.numeroDeVagoes = numeroDeVagoes;
    }

    @Override
    public double calcularTarifa(double distancia) {
       
        double tarifaFixa = 6.50; 
        return tarifaFixa;
    }


    public boolean verificarManutencao() {
        System.out.println("Verificando sistemas elétricos e trilhos...");
        return false; 
    }

    @Override
    public void realizarManutecao() {
        System.out.println("Manutenção dos vagões e sistemas elétricos do metrô realizada.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Número de Vagões: " + this.numeroDeVagoes);
    }

    // Getters e Setters
    public int getNumeroDeVagoes() {
        return numeroDeVagoes;
    }

    public void setNumeroDeVagoes(int numeroDeVagoes) {
        this.numeroDeVagoes = numeroDeVagoes;
    }
}
