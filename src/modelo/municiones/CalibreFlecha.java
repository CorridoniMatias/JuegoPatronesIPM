package modelo.municiones;

public class CalibreFlecha extends CBaseMunicion{
	private static final int DAÑO = 1;
	
	public String toString()
	{
		return "Soy una flecha! Con '" + DAÑO + "' de daño!"; 
	}
}
