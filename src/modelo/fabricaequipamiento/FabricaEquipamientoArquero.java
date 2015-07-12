package modelo.fabricaequipamiento;

import java.util.HashMap;

import modelo.armaduras.CBaseArmadura;
import modelo.armaduras.Ligera;
import modelo.armas.Arco;
import modelo.armas.CBaseArma;
import modelo.armas.Espada;
import modelo.estrategia.Objetivo;

public class FabricaEquipamientoArquero implements FabricaEquipamientoLuchador {

	public CBaseArma crearArma() {
		return new Arco();
	}
	
	public CBaseArmadura crearArmadura() {
		return new Ligera();
	}

	public HashMap<Objetivo, CBaseArma> crearArmas() {
		HashMap<Objetivo, CBaseArma> armas = new HashMap<Objetivo, CBaseArma>();
		armas.put(Objetivo.CERCANO, new Espada());
		armas.put(Objetivo.DISTANTE, new Arco());
		
		return armas;
	}
}
