package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class CiudadUnitTest {
	
	@Test
	public void instanciarCiudad_TodosLosAtributos_Correctos() {
		Ciudad nuevo = new Ciudad(0, "Chilecito", "5360");
		assertEquals(0, nuevo.getIdCiudad());
		assertEquals("Chilecito", nuevo.getNombre());
		assertEquals("5360", nuevo.getCodigoPostal());
	}
	
	@Test
	public void instanciarCiudad_TodosLosAtributos_IdIncorrecto() {
		Ciudad nuevo = new Ciudad(0, "Chilecito", "5360");
		assertNotEquals(3, nuevo.getIdCiudad());
		assertEquals("Chilecito", nuevo.getNombre());
		assertEquals("5360", nuevo.getCodigoPostal());
	}
	
	@Test
	public void instanciarCiudad_TodosLosAtributos_NombreIncorrecto() {
		Ciudad nuevo = new Ciudad(0, "Chilecito", "5360");
		assertEquals(0, nuevo.getIdCiudad());
		assertNotEquals("Famatina", nuevo.getNombre());
		assertEquals("5360", nuevo.getCodigoPostal());
	}
	
	@Test
	public void instanciarCiudad_TodosLosAtributos_CodigoPostalIncorrecto() {
		Ciudad nuevo = new Ciudad(0, "Chilecito", "5360");
		assertEquals(0, nuevo.getIdCiudad());
		assertEquals("Chilecito", nuevo.getNombre());
		assertNotEquals("5363", nuevo.getCodigoPostal());
	}

}
