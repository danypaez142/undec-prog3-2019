package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Test;

public class PilotoUnitTest {

	@Test
	public void instanciarPiloto_todosLosCaAtributos_Correctos() {
		LocalDate fechaNacimiento = LocalDate.of(1989, 7, 25);
		Piloto nuevo = new Piloto(0, "Perez", "Julio Alejandro", "37492933", fechaNacimiento);
		assertEquals(0, nuevo.getIdPiloto());
		assertEquals("Perez", nuevo.getApellido());
		assertEquals("Julio Alejandro", nuevo.getNombres());
		assertEquals("37492933", nuevo.getDocumento());
		assertEquals(fechaNacimiento, nuevo.getFechaNacimiento());
	}
	@Test
	public void instanciarPiloto_todosLosCaAtributos_Incorrectos() {
		LocalDate fechaNacimiento = LocalDate.of(1989, 7, 25);
		LocalDate fechaPrueba = LocalDate.of(1979, 7, 30);
		Piloto nuevo = new Piloto(0, "Perez", "Julio Alejandro", "37492933", fechaNacimiento);
		assertNotEquals(3, nuevo.getIdPiloto());
		assertNotEquals("Paez", nuevo.getApellido());
		assertNotEquals("Julio Alejandra", nuevo.getNombres());
		assertNotEquals("38492933", nuevo.getDocumento());
		assertNotEquals(fechaPrueba, nuevo.getFechaNacimiento());	
	}
	@Test
	public void instanciarPiloto_todosLosAtributos_MayorDeEdad() {
		LocalDate fechaAhora = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(2001, 5, 8);
		Piloto nuevo = new Piloto(0, "Perez", "Julio Alejandro", "37492933", fechaNacimiento);
		Period edad = Period.between(nuevo.getFechaNacimiento(), fechaAhora);		
		assertTrue(edad.getYears() >= 18);
	}
}
