package modelo.armas;

public class Lanza extends CBaseArma{

	public void setear() {
		this.da�o = 1;
	}

	public void accionar() {
		
	}

	public String getTipo() {
		return "Lejano";
	}

	public String toString() {
		return "Lanza";
	}
}
