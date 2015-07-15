package modelo.armas;

import modelo.fabricaarmas.FabricaMunicionArco;

public class Arco extends CBaseArmaMunicion {
	
	public Arco()
	{
		super(new FabricaMunicionArco());
	}


	public void setear() {
		//this.municion = this.fabrica.crearMunicion();
		this.rondas = 30;
		this.daño = 2;
	}

	public void accionar() {
		System.out.println("El arco dispara! Me quedan " + --this.rondas + " rondas.");
	}

	public String getTipo() {
		return "Lejano";
	}

	public String toString() {
		return "Arco";
	}
}
