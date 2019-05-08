package ar.edu.undec;

public class Asignacion {
	private Pasajero pasajero;
	private Asiento asiento;
	private String codigoAsignacion; 

	public Asignacion(Pasajero persona, Asiento asiento, String codigoAsignacion) {
		this.pasajero = persona;
		this.asiento = asiento;
		this.codigoAsignacion = codigoAsignacion;		
	}

	public Pasajero getPasajero() {
		return this.pasajero;
	}

	public Asiento getAsiento() {
		return this.asiento;
	}

	public String getCodigoAsignacion() {
		return this.codigoAsignacion;
	}

}
