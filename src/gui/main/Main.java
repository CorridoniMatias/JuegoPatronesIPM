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
		

		for(int i = 0;i < 10;i++)
		{
			a.atacar(g);
			System.out.println(a.toString() + " está atacando a " + g.toString() + " con un arma " + a.getArma().getTipo() + ": " + a.getArma().toString());
			System.out.println("El luchador " + g.toString() + " está herido. Vida: " + g.getVida());
			if(g.deberiaMorir())
			{
				System.out.println("El luchador " + g.toString() + " ha muerto!");
				g = null; //Para el garbage collector.
			}
			
			if(g == null)
				break;
		}
		
	}
}
