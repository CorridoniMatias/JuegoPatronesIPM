package modelo.luchadores;

import modelo.fabricaequipamiento.FabricaEquipamientoGladiador;

public class Gladiador extends Luchador {
	
	public Gladiador()
	{
		super(new FabricaEquipamientoGladiador());
	}

	public void setear() {
		this.arma 				= null;
		this.armasDisponibles	= this.fabrica.crearArmas();
		this.armadura			= this.fabrica.crearArmadura();
		this.vida				= 20;
	}

	public String toString()
	{
		return "Peter Pan";
	}
}
