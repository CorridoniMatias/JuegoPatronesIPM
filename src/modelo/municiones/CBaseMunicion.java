package modelo.municiones;

public abstract class CBaseMunicion {
	
	protected int daño = 15; //Daño por defecto.
	
	public int getDaño() {
		return this.daño;
	}
}
