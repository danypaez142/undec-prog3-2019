package Model;



import java.util.ArrayList;
import java.util.Collection;

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
}
