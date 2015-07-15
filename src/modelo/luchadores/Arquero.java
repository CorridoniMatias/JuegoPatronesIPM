package modelo.luchadores;

import modelo.estrategia.EstrategiaCercana;
import modelo.estrategia.EstrategiaLejana;
import modelo.estrategia.Objetivo;
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
		this.definirEstrategias();
	}

	public String toString()
	{
		return "Carlo Magno";
	}

	protected void definirEstrategias() {
		this.estrategiasDisponibles.put(Objetivo.CERCANO, new EstrategiaCercana());
		this.estrategiasDisponibles.put(Objetivo.DISTANTE, new EstrategiaLejana());
	}
}
