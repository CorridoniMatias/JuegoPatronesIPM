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
	
	public CBaseArma()
	{
	}
	
	public abstract void setear();
	
	public abstract void accionar(); //Disparar
}
