package gui.main;

import modelo.luchadores.*;

public class Main {
	public static void main(String[] args) {
		HandlerLuchador hl = new HandlerLuchador();
		Gladiador g = (Gladiador) hl.crearLuchador(TipoLuchador.GLADIADOR);
		System.out.println(g.toString());
		g.atacar();
		
		Arquero a = (Arquero) hl.crearLuchador(TipoLuchador.ARQUERO);
		System.out.println(a.toString());
		a.atacar();

	}
}
