package modelo.luchadores;

import modelo.fabricaequipamiento.FabricaEquipamientoArquero;

public class Arquero extends Luchador{
	
	public Arquero()
	{
		super(new FabricaEquipamientoArquero());
	}

	public void setear() {
		this.arma				= null;
		this.armasDisponibles	= this.fabrica.crearArmas();
		this.armadura			= this.fabrica.crearArmadura();
		this.vida				= 10;
	}

	public String toString()
	{
		return "Carlo Magno";
	}
}
