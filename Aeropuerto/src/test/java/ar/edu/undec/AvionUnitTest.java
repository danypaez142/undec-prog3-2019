package ar.edu.undec;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AvionUnitTest {

	@Test
	public void instanciarAvion_TodosLosAtributos_Correctos() throws ExcepcionCampoIncorrecto {
		List<Asiento> asientos = new ArrayList<>(); 
		for (int i = 0; i < 3; i++) {
			Asiento este = new Asiento(i, "A"+i);
			asientos.add(este);
		}
		Avion nuevo = new Avion(0, "Boeing 747", "B78TG9", asientos);
		assertEquals(0, nuevo.getId());
		assertEquals("Boeing 747", nuevo.getModelo());
		assertEquals("B78TG9", nuevo.getMatricula());
		assertEquals(asientos, nuevo.getAsientos());
		
	}
	@Test
	public void instanciarAvion_TodosLosAtributos_Incorrectos() throws ExcepcionCampoIncorrecto {
		List<Asiento> asientos = new ArrayList<>();
		List<Asiento> noAsientos = new ArrayList<>(); 
		for (int i = 0; i < 3; i++) {
			Asiento este = new Asiento(i, "A"+i);
			asientos.add(este);
			Asiento esteNo = new Asiento(i, "B"+i);
			noAsientos.add(esteNo);
		}
		Avion nuevo = new Avion(0, "Boeing 747", "B78TG9", asientos);
		assertNotEquals(3, nuevo.getId());
		assertNotEquals("Airbus A320", nuevo.getModelo());
		assertNotEquals("86LK4S", nuevo.getMatricula());
		assertNotEquals(noAsientos, nuevo.getAsientos());
		
	}

}
