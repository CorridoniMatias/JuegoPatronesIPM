package modelo.estrategia;

import modelo.luchadores.Luchador;

public abstract class Estrategia {
	public void atacar(Luchador atacante, Luchador enemigo)
	{
		this.setArmaAtacante(atacante);
		
		/*CBaseArma arma = atacante.getArma();
		
		if(arma instanceof CBaseArmaMunicion)
			enemigo.herir(((CBaseArmaMunicion)arma).getMunicion().getDa�o());
		else
			enemigo.herir(atacante.getArma().getMunicion().getDa�o());*/
		enemigo.herir(atacante.getArma().getDa�o());
	}
	
	// Es abstract porque el arma se setea dependiendo de la estrategia.
	public abstract void setArmaAtacante(Luchador atacante);
}
