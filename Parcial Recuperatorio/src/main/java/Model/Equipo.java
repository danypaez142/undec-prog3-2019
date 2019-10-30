package Model;



import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.html.HTMLEditorKit.Parser;

import Exceptions.EquipoIncompletoException;

public class Equipo {

    private Integer idEquipo;
    private String nombre;
    private Collection<Jugador> jugadores;

    private Equipo(Integer id, String nombre, ArrayList<Jugador> jugadores) {
    	this.idEquipo = id;
    	this.nombre = nombre;
    	this.jugadores = jugadores;
    }

	public static Equipo instancia(Integer id, String nombre, ArrayList<Jugador> jugadores) throws EquipoIncompletoException {
		if(nombre == null ||  nombre.isEmpty())
			throw new EquipoIncompletoException("El equipo necesita un nombre valido.");
		else	return new Equipo(id, nombre, jugadores);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public boolean asignarJugador(Jugador messi) {
		for (Jugador jugador : this.jugadores) {
			if(jugador.getDocumento().equals(messi.getDocumento())) {
				return false;
			}
		}		
		this.jugadores.add(messi);
		return true;		
	}

	public double obtenerPromedioEdad() {
		double sumaDeEdades = 0.0;
		double promedio;
		for (Jugador jugador : jugadores) {
			sumaDeEdades+=jugador.getEdad();
		}
		return sumaDeEdades/this.jugadores.size();
		
	}

	public double obtenerPromedioAltura() {
		double sumaDeAlturas = 0.0;
		double promedio;
		for (Jugador jugador : jugadores) {
			sumaDeAlturas+=jugador.getAltura();
		}
		return sumaDeAlturas/this.jugadores.size();
	}
}
