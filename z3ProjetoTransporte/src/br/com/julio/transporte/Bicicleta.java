package br.com.julio.transporte;

import br.com.julio.interfaces.Manutenivel;

public class Bicicleta extends Transporte implements Manutenivel {

    private boolean eletrica;

    public Bicicleta(String modelo, int capacidade, boolean eletrica) {
 
        super(modelo, capacidade); 
        this.eletrica = eletrica;
    }

    @Override
    public double calcularTarifa(double minutosDeUso) {
       
        double custoPorMinuto;
        
        if (this.eletrica) {
            custoPorMinuto = 0.45; 
        } else {
            custoPorMinuto = 0.25;
        }
        
        return custoPorMinuto * minutosDeUso;
    }

    @Override
    public boolean verificarManutencao() {
     
        System.out.println("Verificando freios, pneus e bateria (se elétrica)...");
        
        return true; 
    }

    @Override
    public void realizarManutecao() {
        System.out.println("Manutenção da bicicleta (ajuste de freios e pneus) realizada.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("É elétrica: " + (this.eletrica ? "Sim" : "Não"));
    }

    // Getters e Setters
    public boolean isEletrica() {
        return eletrica;
    }

    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }
}