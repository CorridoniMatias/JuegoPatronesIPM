package modelo.luchadores;

import modelo.fabricaequipamiento.FabricaEquipamientoArquero;

public class Arquero extends Luchador{
	
	public Arquero()
	{
		super(new FabricaEquipamientoArquero());
	}

	public void setear() {
		this.arma		= this.fabrica.crearArma();
		this.armadura	= this.fabrica.crearArmadura();
	}

	public String toString()
	{
		return "Soy un arquero!";
	}
}
