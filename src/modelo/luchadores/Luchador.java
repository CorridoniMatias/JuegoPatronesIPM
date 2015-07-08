package modelo.luchadores;

import java.util.HashMap;

import modelo.armaduras.CBaseArmadura;
import modelo.armas.CBaseArma;
import modelo.estrategia.Estrategia;
import modelo.estrategia.Objetivo;
import modelo.fabricaequipamiento.FabricaEquipamientoLuchador;

public abstract class Luchador {
	protected CBaseArma arma;
	protected CBaseArmadura armadura;
	protected FabricaEquipamientoLuchador fabrica;
	protected Estrategia estrategia;
	protected HashMap<Objetivo, Estrategia> estrategiasDisponibles;
	protected HashMap<Objetivo, CBaseArma> armasDisponibles;
	
	protected int vida;
	
	public Luchador(FabricaEquipamientoLuchador fab)
	{
		this.fabrica = fab;
		this.setear();
	}
	
	private boolean cambiarEstrategia(Objetivo estrategia)
	{
		Estrategia tmp = this.estrategiasDisponibles.get(estrategia);
		if(tmp == null)
			return false;
		
		this.estrategia = tmp;
		return true;
	}
	
	public void setArma(Objetivo estrategia)
	{
		switch (estrategia) {
			case CERCANO:
				
			break;
			
			case DISTANTE:
				
			break;
	
			default:
			break;
		}
	}
	
	public void atacar(Luchador enemigo)
	{
		Objetivo obj = visualizarObjetivo(); //Hace un random. Si es mas de 5 devuelve distante, de lo contrario cercano. 
		this.cambiarEstrategia(obj);
		this.estrategia.atacar(this, enemigo); 
	}
	
	public CBaseArma getArma() {
		return arma;
	}

	public abstract void setear();
}
