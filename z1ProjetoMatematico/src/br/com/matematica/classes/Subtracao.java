package br.com.matematica.classes;
import br.com.matematica.interfaces.IOperacoesMatematicas;

public class Subtracao implements IOperacoesMatematicas {
	public void calcular(double b,double a) {
		System.out.println(a-b);
	}

}
