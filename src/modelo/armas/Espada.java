package modelo.armas;

public class Espada extends CBaseArma{

	public String toString()
	{
		return "Soy un arco!";
	}

	public void setear() {
		this.da�o = 3;
	}

	public void accionar() {
		System.out.println("Soy una espada atacando!");
	}
}
