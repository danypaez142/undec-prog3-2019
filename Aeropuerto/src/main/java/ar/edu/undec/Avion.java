package ar.edu.undec;

import java.util.List;

public class Avion {
	private Integer idAvion;
	private String modelo;
	private String matricula;
	private List<Asiento> asientos;

	public Avion(Integer id, String modelo, String matricula, List<Asiento> asientos) {
		this.idAvion = id;
		this.modelo = modelo;
		this.matricula = matricula;
		this.asientos = asientos;
	}

	public int getId() {
		return this.idAvion.intValue();
	}

	public String getModelo() {
		return this.modelo;
	}

	public List<Asiento> getAsientos() {
		return this.asientos;
	}

	public String getMatricula() {
		return this.matricula;
	}

}
