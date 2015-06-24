package modelo.luchadores;

import modelo.armas.CBaseArmaMunicion;
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

	public void atacar() {
		(this.arma).accionar(); //Alguna forma de hacer esto mas lindo?
	}
	
	public String toString()
	{
		return "Soy un arquero!";
	}
}
