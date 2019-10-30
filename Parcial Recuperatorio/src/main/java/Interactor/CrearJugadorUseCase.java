package Interactor;

import Exceptions.JugadorExisteException;
import Model.Jugador;
import Repositorio.IRepositorioCrearJugador;

public class CrearJugadorUseCase {
	private IRepositorioCrearJugador repositorio;

	public CrearJugadorUseCase(IRepositorioCrearJugador crearJugadorGateway) {
		this.repositorio = crearJugadorGateway;
	}

	public boolean crearJugador(Jugador elJugador) throws JugadorExisteException {
		if(this.repositorio.findByDocumento(elJugador.getDocumento()) != null)
			throw new JugadorExisteException();
		else 	return this.repositorio.guardar(elJugador);
	}

}
