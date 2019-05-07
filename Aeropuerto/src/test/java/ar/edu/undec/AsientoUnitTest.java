package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsientoUnitTest {

	@Test
	public void instanciarAsiento_TodoslosAtributos_Correctos() {
		Asiento nuevo = new Asiento(0, "B5");
		assertEquals(0, nuevo.getIdAsiento());
		assertEquals("B5", nuevo.getNumero());
	}

	@Test
	public void instanciarAsiento_TodoslosAtributos_Incorrectos() {
		Asiento nuevo = new Asiento(0, "B5");
		assertNotEquals(3, nuevo.getIdAsiento());
		assertNotEquals("C32", nuevo.getNumero());
	}
}
