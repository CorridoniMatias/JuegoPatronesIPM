package modelo.estrategia;

import modelo.luchadores.Luchador;

public abstract class Estrategia {
	public void atacar(Luchador atacante, Luchador enemigo)
	{
		this.setArmaAtacante(atacante);
		enemigo.herir(atacante.getArma().getMunicion().getDaño());
	}
	
	// Es abstract porque el arma se setea dependiendo de la estrategia.
	public abstract void setArmaAtacante(Luchador atacante);
}
