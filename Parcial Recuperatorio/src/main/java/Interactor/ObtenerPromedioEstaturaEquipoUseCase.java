package Interactor;

import Model.Equipo;
import Model.Jugador;
import Repositorio.IRepositorioObtenerEquipo;

public class ObtenerPromedioEstaturaEquipoUseCase {
	private IRepositorioObtenerEquipo repositorio;

	public ObtenerPromedioEstaturaEquipoUseCase(IRepositorioObtenerEquipo iRepositorioObtenerEquipo) {
		this.repositorio = iRepositorioObtenerEquipo;
	}

	public double obtenerPromedioEstatura(Equipo elEquipo) {
		return Math.round(this.repositorio.obtenerEquipoPorNombre(elEquipo.getNombre()).obtenerPromedioAltura()*100.0)/100.0;
	}

}
