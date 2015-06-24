package modelo.municiones;

public class CalibreFlechaFuego extends CalibreFlecha {
	private static final int DAÑO = 1;
	
	public String toString()
	{
		return "Soy una flecha de fuego! Con '" + DAÑO + "' de daño!";
	}
}
