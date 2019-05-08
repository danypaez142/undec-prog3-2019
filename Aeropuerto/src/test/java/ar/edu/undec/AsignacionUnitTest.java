package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsignacionUnitTest {

	@Test
	public void instanciarAsignacion_TodosLosAtributos_Correctos() {
		Pasajero nuevaPersona = new Pasajero(0, "20374929330","Paez", "Marcelo Daniel", "+5493825416602");
		Asiento asiento = new Asiento(3, "B3");
		Asignacion nueva = new Asignacion(nuevaPersona, asiento, "BNR396");
		assertEquals(nuevaPersona,nueva.getPasajero());
		assertEquals(asiento,nueva.getAsiento());
		assertEquals("BNR396",nueva.getCodigoAsignacion());
	}

}
