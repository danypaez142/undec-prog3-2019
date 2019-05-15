package ar.edu.undec;

import java.util.ArrayList;
import java.util.List;

public class GestorDeUbicaciones {
	private List<Ciudad> ciudades;
	private List<Aeropuerto> aeropuertos;
	
	public GestorDeUbicaciones() {
		ciudades = new ArrayList<>();
		aeropuertos = new ArrayList<>();
	}

	public boolean crearCiudad(String nombre, String codigoPostal) {
		boolean existe = true;
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codigoPostal)) {
				existe = false;
			}
		}
		try {
			if(existe) {			
				Ciudad agregar = new Ciudad(ciudades.size()+1, nombre, codigoPostal);
				ciudades.add(agregar);
				return existe;
			}else	return false;
		} catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public boolean consultarExistenciaCiudad(String codigoPostal) {
		boolean devolver = false;
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codigoPostal))
				devolver = true;
		}
		return devolver;
	}
	

	public Ciudad consultarCiudad(String codigoPostal) {
		Ciudad devolver = new Ciudad();
		for (Ciudad ciudad : ciudades) {
			if(ciudad.getCodigoPostal().equals(codigoPostal))
				devolver = ciudad;
		}
		return devolver;
	}

	public boolean actualizarCiudad(String codigoPostal, String nombre) {
		if(consultarExistenciaCiudad(codigoPostal)) {
			int i = 0;
			for(i = 0; i < ciudades.size(); i++) {
				if(ciudades.get(i).getCodigoPostal().equals(codigoPostal))
					break;
			}
			Ciudad actualizar = this.consultarCiudad(codigoPostal);
			actualizar.setNombre(nombre);			
			ciudades.set(i, actualizar);
			return true;
		}else return false;
	}

	public boolean eliminarCiudad(String codigoPostal) {
		Ciudad borrar = new Ciudad();
		for (int i = 0; i < ciudades.size();i++) {
				if (ciudades.get(i).getCodigoPostal().equals(codigoPostal)) {
					borrar = ciudades.get(i);
				}
			}
		return ciudades.remove(borrar);
	}

	public boolean crearAeropuerto(String nombre, Ciudad almacenar, String codigo) {
		boolean existe = true;
		for (Aeropuerto aeropuerto : aeropuertos) {
			if(aeropuerto.getCodigo().equals(codigo)) {
				existe = false;
			}
		}
		try {
			if(existe) {			
				Aeropuerto agregar = new Aeropuerto(aeropuertos.size()+1, nombre, almacenar, codigo);
				aeropuertos.add(agregar);
				return existe;
			}else	return false;
		} catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

	public boolean consultarExistenciaAeropuerto(String codigo) {
		boolean devolver = false;
		for (Aeropuerto aeropuerto : aeropuertos) {
			if(aeropuerto.getCodigo().equals(codigo))
				devolver = true;
		}
		return devolver;
	}
	
	public Aeropuerto consultarAeropuerto(String codigo) {
		Aeropuerto devolver = new Aeropuerto();
		for (Aeropuerto aeropuerto : aeropuertos) {
			if(aeropuerto.getCodigo().equals(codigo))
				devolver = aeropuerto;
		}
		return devolver;
	}
	
	public boolean actualizarAeropuerto(String codigo, String nombre) {
		if(consultarExistenciaAeropuerto(codigo)) {
			int i = 0;
			for(i = 0; i < aeropuertos.size(); i++) {
				if(aeropuertos.get(i).getCodigo().equals(codigo))
					break;
			}
			Aeropuerto actualizar = this.consultarAeropuerto(codigo);
			actualizar.setNombre(nombre);			
			aeropuertos.set(i, actualizar);
			return true;
		}else return false;
	}
	
	public boolean eliminarAeropuerto(String codigo) {
		Aeropuerto borrar = new Aeropuerto();
		for (int i = 0; i < aeropuertos.size();i++) {
				if (aeropuertos.get(i).getCodigo().equals(codigo)) {
					borrar = aeropuertos.get(i);
				}
			}
		return aeropuertos.remove(borrar);
	}
	
}
