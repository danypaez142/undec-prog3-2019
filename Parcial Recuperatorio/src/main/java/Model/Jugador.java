package Model;

import java.time.LocalDate;

import Exceptions.JugadorIncompletoException;

public class Jugador {


    private Integer idJugador;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double estatura;
    private String documento;

    private Jugador(Integer id, String nombre, LocalDate fechaNacimiento, double estatura, String documento) {
    	this.idJugador = id;
    	this.nombre = nombre;
    	this.fechaNacimiento = fechaNacimiento;
    	this.estatura = estatura;
    	this.documento = documento;
    }

	public static Jugador instancia(Integer id, String nombre, LocalDate fechaNacimiento, double estatura, String documento) throws JugadorIncompletoException {
		if(documento == null || nombre == null || fechaNacimiento == null || estatura == 0.0) {
			throw new JugadorIncompletoException("Alguno de los campos importantes no puede ser nulo");
		}			
		else return new Jugador(id, nombre, fechaNacimiento, estatura, documento);
	}
}
