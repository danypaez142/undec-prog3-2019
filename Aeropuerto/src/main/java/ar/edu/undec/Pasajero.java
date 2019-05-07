package ar.edu.undec;

public class Pasajero {
	private Integer idPasajero;
	private String cuil;
	private String apellido;
	private String nombres;
	private String telefono;

	public Pasajero(Integer id, String cuil, String apellido, String nombres, String telefono) {
		this.idPasajero = id;
		this.cuil = cuil;
		this.apellido = apellido;
		this.nombres = nombres;
		this.telefono = telefono;		
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
	
	
}
