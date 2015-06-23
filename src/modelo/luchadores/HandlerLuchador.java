package modelo.luchadores;

public class HandlerLuchador {
	public Luchador crearLuchador(TipoLuchador tipo)
	{
		switch(tipo)
		{
			case GLADIADOR:
				return new Gladiador();
			case ARQUERO:
				return new Arquero();
			default:
				return null;
		}
	}
}
