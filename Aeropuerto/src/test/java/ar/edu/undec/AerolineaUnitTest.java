package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AerolineaUnitTest {

	@Test
	public void instanciarAerolinea_TodosLosAtributos_Correctos() {
		Aerolinea nueva = new Aerolinea(0, "Avianchi");
		assertEquals(0, nueva.getIdAerolinea().intValue());
		assertEquals("Avianchi", nueva.getNombre());		
	}
	
	@Test
	public void instanciarAerolinea_TodosLosAtributos_IdIncorrecto() {
		Aerolinea nueva = new Aerolinea(0, "Avianchi");
		assertEquals("Avianchi", nueva.getNombre());
		assertNotEquals(1, nueva.getIdAerolinea().intValue());
	}
	
	@Test
	public void instanciarAerolinea_TodosLosAtributos_NombreIncorrecto() {
		Aerolinea nueva = new Aerolinea(0, "Flyyyyy");
		assertEquals(0, nueva.getIdAerolinea().intValue());
		assertNotEquals("Avianchi", nueva.getNombre());
	}
	
	@Test
	public void instanciarAerolinea_TodosLosAtributosIncorrectos() {
		Aerolinea nueva = new Aerolinea(0, "Avianchi");
		assertNotEquals(25, nueva.getIdAerolinea().intValue());
		assertNotEquals("Flyyyyyy", nueva.getNombre());
	}
}
