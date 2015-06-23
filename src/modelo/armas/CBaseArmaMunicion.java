package modelo.armas;

import modelo.fabricaarmas.FabricaMunicionArmas;
import modelo.municiones.CBaseMunicion;

public abstract class CBaseArmaMunicion extends CBaseArma{
	protected CBaseMunicion municion;
	protected FabricaMunicionArmas fabrica;
	protected int rondas;
	
	public CBaseArmaMunicion(FabricaMunicionArmas fa)
	{
		this.fabrica = fa;
		this.setear();
	}
}
