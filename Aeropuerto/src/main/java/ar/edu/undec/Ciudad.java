package ar.edu.undec;

public class Ciudad {
	private Integer idCiudad;
	private String nombre;
	private String codigoPostal;
	
	public Ciudad(Integer id, String nombre, String codigoPostal) throws ExcepcionCampoIncorrecto {
		if(nombre.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El nombre de la ciudad no puede estar vacio");
		}else if (codigoPostal.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El codigo postal no puede estar vacio");
		}else {
			this.idCiudad = id;
			this.nombre = nombre;
			this.codigoPostal = codigoPostal;
		}
	}

	public Ciudad() {
		// TODO Auto-generated constructor stub
	}

	public int getIdCiudad() {
		return this.idCiudad.intValue();
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
