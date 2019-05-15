package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AeropuertoUnitTest {
		
	@Test
	public void instanciarAeropuerto_TodosLosAtributos_Correctos() throws ExcepcionCampoIncorrecto {
		Ciudad ciudad = new Ciudad(3, "Chilecito", "5360");
		Aeropuerto nuevo = new Aeropuerto(0, "Aeropuerto Chilecito", ciudad, "0b369s");
		assertEquals(0, nuevo.getIdAeropuerto());
		assertEquals("Aeropuerto Chilecito", nuevo.getNombre());
		assertEquals(ciudad, nuevo.getCiudad());
		assertEquals("0b369s", nuevo.getCodigo());
	}
	@Test
	public void instanciarAeropuerto_TodosLosAtributos_Incorrectos() throws ExcepcionCampoIncorrecto {
		Ciudad ciudad = new Ciudad(3, "Chilecito", "5360");
		Ciudad ciudad2 = new Ciudad(3, "Nonogasta", "5360");
		Aeropuerto nuevo = new Aeropuerto(0, "Aeropuerto Chilecito", ciudad, "0b369s");
		assertNotEquals(3, nuevo.getIdAeropuerto());
		assertNotEquals("Aeropuerto Nonogasta", nuevo.getNombre());
		assertNotEquals(ciudad2, nuevo.getCiudad());
		assertNotEquals("1b369s", nuevo.getCodigo());
	}
}
