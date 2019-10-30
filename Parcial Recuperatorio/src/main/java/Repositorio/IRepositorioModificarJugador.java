package Repositorio;

import Model.Jugador;

public interface IRepositorioModificarJugador {

	public Jugador findByDNI(String string);

	public boolean actualizar(Jugador jugadorDatosNuevos);

}
