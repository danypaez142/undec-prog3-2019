package ar.edu.undec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorDePilotos {
	private List<Piloto> pilotos;

	public GestorDePilotos() {
		this.pilotos = new ArrayList<>();
	}

	public boolean crearPiloto(String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
		boolean existe = true;
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumento().equals(documento)) {
				existe = false;
			}
		}
		try {
			if(existe) {			
				Piloto agregar = new Piloto(pilotos.size()+1, apellido, nombres, documento, fechaNacimiento);
				pilotos.add(agregar);
				return existe;
			}else	return false;
		} catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	

	public Piloto consultarPiloto(String documento) {
		Piloto devolver = new Piloto();
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumento().equals(documento))
				devolver = piloto;
		}
		return devolver;
	}
	
	public List<Piloto> consultarTodosLosPilotos(){
		return this.pilotos;
	}
	
	public List<Piloto> consultarTodosLosPilotosPorApellido(String apellido){
		List<Piloto> devolver = new ArrayList<>();
		for (Piloto piloto : devolver) {
			if(piloto.getApellido().equals(apellido))
				devolver.add(piloto);
		}
		return devolver;
	}
	
	public boolean consultarExistenciaPiloto(String documento) {
		boolean devolver = false;
		for (Piloto piloto : pilotos) {
			if(piloto.getDocumento().equals(documento))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}

	public boolean actualizarPiloto(String documento, String apellido, String nombres) {
		if(consultarExistenciaPiloto(documento)) {
			int i = 0;
			for(i = 0; i < pilotos.size(); i++) {
				if(pilotos.get(i).getDocumento().equals(documento))
					break;
			}
			Piloto actualizar = this.consultarPiloto(documento);
			actualizar.setNombres(nombres);
			actualizar.setApellido(apellido);
			pilotos.set(i, actualizar);
			return true;
		}else return false;
	}
	

	public boolean eliminarPiloto(String documento) {
		Piloto borrar = new Piloto();
		for (int i = 0; i < pilotos.size();i++) {
				if (pilotos.get(i).getDocumento().equals(documento)) {
					borrar = pilotos.get(i);
				}
			}
		return pilotos.remove(borrar);
	}

}
