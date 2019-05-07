package ar.edu.undec;

public class Aerolinea {
	private Integer idAerolinea;
	private String nombre;

	Aerolinea(Integer id, String nombre) {
		this.idAerolinea = id;
		this.nombre = nombre;
	}

	public Integer getIdAerolinea() {
		return this.idAerolinea;
	}

	public String getNombre() {
		return this.nombre;
	}

}
