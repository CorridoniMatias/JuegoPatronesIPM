package gui.main;

import modelo.luchadores.*;

public class Main {
	public static void main(String[] args) {
		HandlerLuchador hl = new HandlerLuchador();
		System.out.println("Creando luchador...");
		Gladiador g = (Gladiador) hl.crearLuchador(TipoLuchador.GLADIADOR);
		System.out.println("Creado luchador: " + g.toString());
		
		System.out.println("Creando luchador...");
		Arquero a = (Arquero) hl.crearLuchador(TipoLuchador.ARQUERO);
		System.out.println("Creado luchador: " + a.toString());
		
	}
}
