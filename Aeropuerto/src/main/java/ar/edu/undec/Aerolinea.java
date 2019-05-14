package ar.edu.undec;

public class Aerolinea {
	private Integer idAerolinea;
	private String nombre;

	Aerolinea(Integer id, String nombre) {
		this.idAerolinea = id;
		this.nombre = nombre;
	}

	public int getIdAerolinea() {
		return this.idAerolinea.intValue();
	}

	public String getNombre() {
		return this.nombre;
	}
}
