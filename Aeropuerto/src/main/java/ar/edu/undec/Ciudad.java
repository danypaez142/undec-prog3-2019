package ar.edu.undec;

public class Ciudad {
	private Integer idCiudad;
	private String nombre;
	private String codigoPostal;
	
	public Ciudad(Integer id, String nombre, String codigoPostal) {
		this.idCiudad = id;
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}

	public int getIdCiudad() {
		return this.idCiudad.intValue();
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public Object getNombre() {
		return this.nombre;
	}
	
}
