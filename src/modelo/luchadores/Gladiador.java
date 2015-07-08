package modelo.luchadores;

import modelo.fabricaequipamiento.FabricaEquipamientoGladiador;

public class Gladiador extends Luchador {
	
	public Gladiador()
	{
		super(new FabricaEquipamientoGladiador());
	}

	public void setear() {
		this.arma 		= this.fabrica.crearArma();
		this.armadura	= this.fabrica.crearArmadura();
	}

	public String toString()
	{
		return "Soy un gladiador!";
	}
}
