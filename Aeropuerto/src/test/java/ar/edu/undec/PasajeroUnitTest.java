package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasajeroUnitTest {

	@Test
	public void instanciarPasajero_TodosLosAtributos_Correctos() {
		Pasajero nuevo = new Pasajero(0, "20374929330", "Paez", "Daniel Marcelo", "+5493825416602");
		assertEquals(0, nuevo.getIdPasajero());
		assertEquals("20374929330", nuevo.getCuil());
		assertEquals("Paez", nuevo.getApellido());
		assertEquals("Daniel Marcelo", nuevo.getNombres());
		assertEquals("+5493825416602", nuevo.getTelefono());
	}
	
	@Test
	public void instanciarPasajero_TodosLosAtributos_Inorrectos() {
		Pasajero nuevo = new Pasajero(0, "20374929330", "Paez", "Daniel Marcelo", "+5493825416602");
		assertNotEquals(6, nuevo.getIdPasajero());
		assertNotEquals("21374929330", nuevo.getCuil());
		assertNotEquals("Perez", nuevo.getApellido());
		assertNotEquals("Panchito Jose", nuevo.getNombres());
		assertNotEquals("+5493825416607", nuevo.getTelefono());
		
	}

}
