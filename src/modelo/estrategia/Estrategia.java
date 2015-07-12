package modelo.estrategia;

import modelo.luchadores.Luchador;

public abstract class Estrategia {
	public void atacar(Luchador atacante, Luchador enemigo)
	{
		this.setArmaAtacante(atacante);
		
		/*CBaseArma arma = atacante.getArma();
		
		if(arma instanceof CBaseArmaMunicion)
			enemigo.herir(((CBaseArmaMunicion)arma).getMunicion().getDaño());
		else
			enemigo.herir(atacante.getArma().getMunicion().getDaño());*/
		enemigo.herir(atacante.getArma().getDaño());
	}
	
	// Es abstract porque el arma se setea dependiendo de la estrategia.
	public abstract void setArmaAtacante(Luchador atacante);
}
