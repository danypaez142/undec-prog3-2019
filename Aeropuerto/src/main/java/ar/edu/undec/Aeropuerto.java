package ar.edu.undec;

public class Aeropuerto {
	private Integer idAeropuerto;
	private String nombre;
	private Ciudad ciudad;
	private String codigo;

	public Aeropuerto(Integer id, String nombre, Ciudad ciudad, String codigo) {
		this.idAeropuerto = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo = codigo;
	}

	public int getIdAeropuerto() {
		return this.idAeropuerto.intValue();
	}

	public String getNombre() {
		return this.nombre;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public String getCodigo() {
		return this.codigo;
	}

}
