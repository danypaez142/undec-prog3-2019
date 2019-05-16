package ar.edu.undec;

import java.util.ArrayList;
import java.util.List;

public class GestorDeAviones {
	private List<Avion> aviones;

	public GestorDeAviones() {
		this.aviones = new ArrayList<>();
	}

	public boolean crearAvion(String modelo, String matricula, int cantidadAsientos) {
		boolean existe = true;
		List<Asiento> asientos = new ArrayList<>();
		for (Avion avion : aviones) {
			if(avion.getMatricula().equals(matricula)) {
				existe = false;
			}
		}
		try {
			if(existe) {
				for (int i = 0; i < 2; i++) {
					Asiento este = new Asiento(i, "Asiento "+i);
					asientos.add(este);
				}
				Avion agregar = new Avion(aviones.size()+1, modelo, matricula, asientos);
				aviones.add(agregar);
				return true;
			}else	return false;
		} catch (ExcepcionCampoIncorrecto e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	

	public boolean consultarExistenciaAvion(String matricula) {
		boolean devolver = false;
		for (Avion avion : aviones) {
			if(avion.getMatricula().equals(matricula))
				devolver = true;
		}
		if(devolver)
			return true;
		else return false;
	}
	
	public Avion consultarAvion(String matricula) {
		Avion devolver = new Avion();
		for (Avion avion : aviones) {
			if(avion.getMatricula().equals(matricula))
				devolver = avion;
		}
		return devolver;
	}
	
	public List<Avion> consultarTodosLosAviones(){
		return this.aviones;
	}
	
	public List<Avion> consultarAvionesPorModelo(String modelo){
		List<Avion> devolver = new ArrayList<>();
		for (Avion avion : devolver) {
			if(avion.getModelo().equals(modelo))
				devolver.add(avion);
		}
		return devolver;
	}
	
	public boolean eliminarAvion(String matricula) {
		Avion borrar = new Avion();
		for (int i = 0; i < aviones.size();i++) {
				if (aviones.get(i).getMatricula().equals(matricula)) {
					borrar = aviones.get(i);
				}
			}
		return aviones.remove(borrar);
	}
}
