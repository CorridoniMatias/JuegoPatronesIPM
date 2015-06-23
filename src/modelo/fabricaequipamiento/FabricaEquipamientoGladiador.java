package modelo.fabricaequipamiento;

import modelo.armaduras.CBaseArmadura;
import modelo.armaduras.Pesada;
import modelo.armas.CBaseArma;
import modelo.armas.Espada;

public class FabricaEquipamientoGladiador implements FabricaEquipamientoLuchador {

	public CBaseArma crearArma() {
		return new Espada();
	}

	public CBaseArmadura crearArmadura() {
		return new Pesada();
	}
}
