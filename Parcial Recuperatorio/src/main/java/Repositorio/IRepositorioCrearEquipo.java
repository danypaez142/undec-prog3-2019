package Repositorio;

import Model.Equipo;

public interface IRepositorioCrearEquipo {

	public Equipo findByNombre(String nombre);

	public boolean guardar(Equipo equipoNuevo);

}
