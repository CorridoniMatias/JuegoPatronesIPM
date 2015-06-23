package modelo.armas;

import modelo.fabricaarmas.FabricaMunicionArco;

public class Arco extends CBaseArmaMunicion {
	
	public Arco()
	{
		super(new FabricaMunicionArco());
	}

	public String toString()
	{
		return "Soy un arco! y mi municion es " + this.municion.toString();
	}

	public void setear() {
		this.municion = this.fabrica.crearMunicion();
		this.rondas = 30;
	}

	public void accionar() {
		System.out.println("El arco dispara! Me quedan " + --this.rondas + " rondas.");
	}
}
