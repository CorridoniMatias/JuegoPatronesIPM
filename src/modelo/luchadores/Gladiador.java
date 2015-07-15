package modelo.luchadores;

import modelo.estrategia.EstrategiaCercana;
import modelo.estrategia.EstrategiaLejana;
import modelo.estrategia.Objetivo;
import modelo.fabricaequipamiento.FabricaEquipamientoGladiador;

public class Gladiador extends Luchador {
	
	public Gladiador()
	{
		super(new FabricaEquipamientoGladiador());
	}

	public void setear() {
		this.arma 					= null;
		this.armasDisponibles		= this.fabrica.crearArmas();
		this.armadura				= this.fabrica.crearArmadura();
		this.vida					= 20;
		this.definirEstrategias();
	}

	public String toString()
	{
		return "Peter Pan";
	}
	
	public int getVida() {
		return this.vida;
	}

	protected void definirEstrategias() {
		this.estrategiasDisponibles.put(Objetivo.CERCANO, new EstrategiaCercana());
		this.estrategiasDisponibles.put(Objetivo.DISTANTE, new EstrategiaLejana());
	}
}
