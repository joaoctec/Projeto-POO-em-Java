package br.com.IMC.Pessoas;

public class Atleta extends Pessoa {
	
 private String esportePraticado;

 public Atleta(String nome, double peso, double altura, String esportePraticado) {
     super(nome, peso, altura);
     this.esportePraticado = esportePraticado;
 }

 public void praticarEsporte() {
     System.out.println(getNome() + " está praticando " + esportePraticado + "!");
 }

 public double aplicaporc() {
     // Aplica -5% ao IMC base para atletas
     return super.calcularIMC() * 0.95;
 }

 // Se quiser manter um método específico para mostrar o IMC ajustado:
 public void reduzIMC() {
     System.out.printf("IMC ajustado de %s: %.2f%n", getNome(), aplicaporc());
 }
 
 public String getEsportePraticado() { 
	 return esportePraticado; 

 }
 
}