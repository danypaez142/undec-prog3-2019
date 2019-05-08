package ar.edu.undec;

import java.time.LocalDate;
import java.util.List;

public class Vuelo {
	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDate fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDate fechaHoraArribo;
	private Aerolinea aerolinea;
	private List<Piloto> pilotos;
	private Avion avion;
	private List<Pasajero> pasajeros;
	
	public Vuelo(String codigoVuelo, Aeropuerto salida, LocalDate fechaHoraSalida, Aeropuerto arribo,
			LocalDate fechaHoraArribo, Aerolinea aerolinea, List<Piloto> pilotos, Avion avion,
			List<Pasajero> pasajeros) {
		this.codigoVuelo = codigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.pilotos = pilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
	}

	public String getCodigoVuelo() {
		return codigoVuelo;
	}

	public Aeropuerto getSalida() {
		return salida;
	}

	public LocalDate getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	public Aeropuerto getArribo() {
		return arribo;
	}

	public LocalDate getFechaHoraArribo() {
		return fechaHoraArribo;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public List<Piloto> getPilotos() {
		return pilotos;
	}

	public Avion getAvion() {
		return avion;
	}

	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}
	
}
