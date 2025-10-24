package br.com.julio.transporte;

public abstract class Transporte {

	private String modelo;
    private int capacidade;

    public Transporte(String modelo, int capacidade) {
        super();
        
        if (capacidade < 1) {
        	throw new IllegalArgumentException("nao e possivel atribuir valor menor que 1 na capasidade");
        }
        
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public abstract double calcularTarifa(double distancia); 

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade: " + capacidade);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }}
