package modelo.fabricaarmas;

import modelo.municiones.CBaseMunicion;
import modelo.municiones.CalibreFlecha;

public class FabricaMunicionArco implements FabricaMunicionArmas{

	public CBaseMunicion crearMunicion() {
		return new CalibreFlecha();
	}
}
