package modelo.fabricaequipamiento;

import modelo.armaduras.CBaseArmadura;
import modelo.armaduras.Ligera;
import modelo.armas.Arco;
import modelo.armas.CBaseArma;

public class FabricaEquipamientoArquero implements FabricaEquipamientoLuchador {

	public CBaseArma crearArma() {
		return new Arco();
	}
	
	public CBaseArmadura crearArmadura() {
		return new Ligera();
	}
}
