package ar.edu.undec;

public class Aeropuerto {
	private Integer idAeropuerto;
	private String nombre;
	private Ciudad ciudad;
	private String codigo;

	public Aeropuerto(Integer id, String nombre, Ciudad ciudad, String codigo) throws ExcepcionCampoIncorrecto {
		if(codigo.isEmpty())
			throw new ExcepcionCampoIncorrecto("El codigo del Aeropuerto no puede estar vacio");
		else {
			this.idAeropuerto = id;
			this.nombre = nombre;
			this.ciudad = ciudad;
			this.codigo = codigo;
		}
	}

	public Aeropuerto() {
		// TODO Auto-generated constructor stub
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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
