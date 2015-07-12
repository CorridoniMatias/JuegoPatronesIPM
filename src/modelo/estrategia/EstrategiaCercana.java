package modelo.estrategia;

import modelo.luchadores.Luchador;

public class EstrategiaCercana extends Estrategia {

	public void atacar() {
		
	}

	public void setArmaAtacante(Luchador atacante) {
		atacante.setArma(Objetivo.CERCANO);
	}
}
