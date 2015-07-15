package modelo.armas;


/*
En caso que tuviera municion de diversos tipos
tendria que hacer fabricas para crear municiones? ej:

CbaseMunicionc
9mm
20mm

FabricaMuncionArmas
FabricaMunicionArco
FabricaMunicionPistola
*/
public abstract class CBaseArma {
	
	protected int daño = 15;
	
	public CBaseArma()
	{
		this.setear();
	}
	
	public int getDaño()
	{
		return this.daño;
	}
	
	public abstract void setear();
	public abstract void accionar(); //Disparar
	public abstract String getTipo();
	public abstract String toString();
}
