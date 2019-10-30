package Interactor;

import Exceptions.EquipoExisteException;
import Model.Equipo;
import Repositorio.IRepositorioCrearEquipo;

public class CrearEquipoUseCase {
	private IRepositorioCrearEquipo repositorio;

	public CrearEquipoUseCase(IRepositorioCrearEquipo crearEquipoGateway) {
		this.repositorio = crearEquipoGateway;
	}

	public boolean crearEquipo(Equipo equipoNuevo) throws EquipoExisteException {
		if(this.repositorio.findByNombre(equipoNuevo.getNombre()) != null)
			throw new EquipoExisteException();
		else return this.repositorio.guardar(equipoNuevo);
	}

}
