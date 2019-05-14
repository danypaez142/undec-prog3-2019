package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class VueloUnitTest {

	@Test
	public void instanciarVuelo_TodosLosAtributos_Correctos() throws ExcepcionCampoIncorrecto {
		Ciudad ciudadSalida = new Ciudad(1, "Chilecito", "5360");
		Ciudad ciudadArribo = new Ciudad(2, "Gran Buenos Aires", "5300");
		Aeropuerto salida = new Aeropuerto(1, "San Creyente del Tuyu", ciudadSalida, "0b369s");
		Aeropuerto arribo = new Aeropuerto(2, "Saint To Panchito", ciudadArribo, "0c369s");
		LocalDate fechaHoraSalida = LocalDate.of(2019, 5, 7);
		LocalDate fechaHoraArribo = LocalDate.of(2019, 5, 8);
		Aerolinea aerolinea = new Aerolinea(3, "San Rafael");
		List<Piloto> pilotos = new ArrayList<>();
		List<Asiento> asientos = new ArrayList<>();
		List<Pasajero> pasajeros = new ArrayList<>();
		Piloto piloto = new Piloto(0, "Paez", "Norberto", "23312078", LocalDate.of(1987, 3, 12));
		Piloto coPiloto = new Piloto(1, "Luna", "Juan Alberto", "38555694", LocalDate.of(1976, 12, 31));
		pilotos.add(piloto);
		pilotos.add(coPiloto);
		for (int i = 0; i < 2; i++) {
			Asiento este = new Asiento(i, "A"+i);
			asientos.add(este);
		}
		Pasajero pasajero = new Pasajero(0, "20-36987412-8", "Leiva", "Jose Alberto", "+11258963471");
		Pasajero pasajero2 = new Pasajero(1, "20-37987412-4", "Leiva", "Juan Roberto", "+11255963471");
		pasajeros.add(pasajero);
		pasajeros.add(pasajero2);
		Avion avion = new Avion(0, "Drakar 252", "G0T3-4", asientos);
		Vuelo vuelo = new Vuelo("38SSA3", salida, fechaHoraSalida, arribo, fechaHoraArribo, aerolinea, pilotos, avion, pasajeros);
		assertEquals("38SSA3",vuelo.getCodigoVuelo());
		assertEquals(salida, vuelo.getSalida());
		assertEquals(fechaHoraSalida, vuelo.getFechaHoraSalida());
		assertEquals(arribo, vuelo.getArribo());
		assertEquals(fechaHoraArribo, vuelo.getFechaHoraArribo());
		assertEquals(aerolinea, vuelo.getAerolinea());
		assertEquals(pilotos, vuelo.getPilotos());
		assertEquals(avion, vuelo.getAvion());
		assertEquals(pasajeros, vuelo.getPasajeros());
	}

}
