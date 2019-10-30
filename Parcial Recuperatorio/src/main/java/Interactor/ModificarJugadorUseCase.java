package Interactor;

import Exceptions.JugadorExisteException;
import Model.Jugador;
import Repositorio.IRepositorioModificarJugador;

public class ModificarJugadorUseCase {
	private IRepositorioModificarJugador repositorio;

	public ModificarJugadorUseCase(IRepositorioModificarJugador iRepositorioModificarJugador) {
		this.repositorio = iRepositorioModificarJugador;
	}

	public boolean modificarJugador(Jugador jugadorDatosNuevos) throws JugadorExisteException {
		if(this.repositorio.findByDNI(jugadorDatosNuevos.getDocumento()) == null)
			return this.repositorio.actualizar(jugadorDatosNuevos);
		else throw new JugadorExisteException();
	}

}
