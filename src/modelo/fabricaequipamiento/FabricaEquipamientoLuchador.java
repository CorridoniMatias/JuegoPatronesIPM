package modelo.fabricaequipamiento;

import modelo.armaduras.CBaseArmadura;
import modelo.armas.CBaseArma;

public interface FabricaEquipamientoLuchador {
	public CBaseArma crearArma();
	public CBaseArmadura crearArmadura();
}
