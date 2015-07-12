package modelo.fabricaequipamiento;

import java.util.HashMap;

import modelo.armaduras.CBaseArmadura;
import modelo.armas.CBaseArma;
import modelo.estrategia.Objetivo;

public interface FabricaEquipamientoLuchador {
	public HashMap<Objetivo, CBaseArma>  crearArmas();
	public CBaseArmadura crearArmadura();
}
