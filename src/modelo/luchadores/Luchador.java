package modelo.luchadores;

import java.util.HashMap;
import java.util.Random;

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
	
	protected int vida = -1;
	
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
		CBaseArma tmp = this.armasDisponibles.get(estrategia);
		if(tmp == null)
			tmp = this.armasDisponibles.get(Objetivo.CERCANO);
		
		this.arma = tmp;
	}
	
	public void atacar(Luchador enemigo)
	{
		Objetivo obj = visualizarObjetivo(); 
		this.cambiarEstrategia(obj);
		this.estrategia.atacar(this, enemigo); 
	}
	
	private Objetivo visualizarObjetivo() {
		int n = new Random().nextInt();
		if(n > 5)
			return Objetivo.DISTANTE;
		else
			return Objetivo.CERCANO;
	}

	public CBaseArma getArma() {
		return arma;
	}
	
	public void herir(int daño) {
		this.vida -= daño;
		
		/*if(this.deberiaMorir())
			this.morir(); //Esto deberia ser un system.out.
			*/
	}
	
	private boolean deberiaMorir() {
		return ((this.vida <= 0) ? true : false);
	}

	public abstract void setear();

}
