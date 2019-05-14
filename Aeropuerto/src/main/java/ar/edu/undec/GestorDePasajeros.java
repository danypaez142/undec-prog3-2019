package ar.edu.undec;

import java.util.List;
import java.util.ArrayList;

public class GestorDePasajeros {
	private List<Pasajero> pasajeros;

	public GestorDePasajeros() {
		this.pasajeros = new ArrayList<>();
	}

	public boolean crearPasajero(String cuil, String apellido, String nombres, String telefono) throws ExcepcionCampoIncorrecto {
		boolean existe = true;
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil)) {
				existe = false;
			}
		}
		try {
			if(existe) {			
				Pasajero agregar = new Pasajero(pasajeros.size()+1, cuil, apellido, nombres, telefono);
				pasajeros.add(agregar);
				return existe;
			}else	return false;
		} catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public Pasajero consultarPasajero(String cuil) {
		Pasajero devolver = new Pasajero();
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil))
				devolver = pasajero;
		}
		return devolver;
	}
	
	private boolean consultarExistenciaPasajero(String cuil) {
		boolean devolver = false;
		for (Pasajero pasajero : pasajeros) {
			if(pasajero.getCuil().equals(cuil))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}
	
	public List<Pasajero> devolverTodosLosPasajeros(){
		return this.pasajeros;
	}
	
	public List<Pasajero> devolverPasajerosPorApellido(String apellido){
		List<Pasajero> retornar = new ArrayList<>();
		for (Pasajero pasajero : retornar) {
			if(pasajero.getApellido().equals(apellido))
				retornar.add(pasajero);
		}
		return retornar;
	}
	
	public boolean actualizarPasajero(String cuil, String nombres, String telefono) {
		if(consultarExistenciaPasajero(cuil)) {
			int i = 0;
			for(i = 0; i < pasajeros.size(); i++) {
				if(pasajeros.get(i).getCuil().equals(cuil))
					break;
			}
			Pasajero actualizar = this.consultarPasajero(cuil);
			actualizar.setNombres(nombres);
			actualizar.setTelefono(telefono);
			pasajeros.set(i, actualizar);
			return true;
		}else return false;
	}
	
	public boolean eliminarPasajero(String cuil) {
		Pasajero borrar = new Pasajero();
		for (int i = 0; i < pasajeros.size();i++) {
				if (pasajeros.get(i).getCuil().equals(cuil)) {
					borrar = pasajeros.get(i);
				}
			}
		return pasajeros.remove(borrar);		
	}
}
