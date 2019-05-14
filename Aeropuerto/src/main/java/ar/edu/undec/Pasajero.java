package ar.edu.undec;

public class Pasajero {
	private Integer idPasajero;
	private String cuil;
	private String apellido;
	private String nombres;
	private String telefono;

	public Pasajero(Integer id, String cuil, String apellido, String nombres, String telefono) throws ExcepcionCampoIncorrecto{
		if(cuil.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El cuil no puede estar vacio");
		}else if(cuil.length() < 11 || cuil.length() > 14){
			throw new ExcepcionCampoIncorrecto("El cuil esta incorrecto");
		}else {
			this.idPasajero = id;
			this.cuil = cuil;
			this.apellido = apellido;
			this.nombres = nombres;
			this.telefono = telefono;
		}
	}

	public Pasajero() {
		
	}

	public int getIdPasajero() {
		return this.idPasajero.intValue();
	}

	public String getCuil() {
		return this.cuil;
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNombres() {
		return this.nombres;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
