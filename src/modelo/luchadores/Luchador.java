package modelo.luchadores;

import modelo.armaduras.CBaseArmadura;
import modelo.armas.CBaseArma;
import modelo.fabricaequipamiento.FabricaEquipamientoLuchador;

public abstract class Luchador {
	protected CBaseArma arma;
	protected CBaseArmadura armadura;
	protected FabricaEquipamientoLuchador fabrica;
	protected int vida;
	
	public Luchador(FabricaEquipamientoLuchador fab)
	{
		this.fabrica = fab;
		this.setear();
	}
	
	public abstract void setear();
	public abstract void atacar();
}
