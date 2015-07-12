package modelo.fabricaequipamiento;

import java.util.HashMap;

import modelo.armaduras.CBaseArmadura;
import modelo.armaduras.Pesada;
import modelo.armas.CBaseArma;
import modelo.armas.Espada;
import modelo.armas.Lanza;
import modelo.estrategia.Objetivo;

public class FabricaEquipamientoGladiador implements FabricaEquipamientoLuchador {

	public CBaseArmadura crearArmadura() {
		return new Pesada();
	}

	public HashMap<Objetivo, CBaseArma> crearArmas() {
		HashMap<Objetivo, CBaseArma> armas = new HashMap<Objetivo, CBaseArma>();
		armas.put(Objetivo.CERCANO, new Espada());
		armas.put(Objetivo.DISTANTE, new Lanza());
		
		return armas;
	}
}
