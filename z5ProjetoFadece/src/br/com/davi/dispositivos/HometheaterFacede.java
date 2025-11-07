package br.com.davi.dispositivos;

public class HometheaterFacede {
	private Luz objLuz= new Luz();
	private Som objSom = new Som();
	private Televisao objTelevisao =new Televisao();
	
	public void ligarTudoHomeTheater() {
		objLuz.ligar();
		objSom.ligar();
		objTelevisao.ligar();

	}
	public void desligarTudoHomeTheater() {
		objLuz.desligar();
		objSom.desligar();
		objTelevisao.desligar();
	
	}
}
