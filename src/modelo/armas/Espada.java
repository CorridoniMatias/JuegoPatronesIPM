package modelo.armas;

public class Espada extends CBaseArma{

	public String toString()
	{
		return "Espada";
	}

	public void setear() {
		this.daño = 3;
	}

	public void accionar() {
		System.out.println("Soy una espada atacando!");
	}

	public String getTipo() {
		return "Cercano";
	}
}
