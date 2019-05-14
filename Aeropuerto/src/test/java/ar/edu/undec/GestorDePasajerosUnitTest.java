package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestorDePasajerosUnitTest {
	GestorDePasajeros gestor = new GestorDePasajeros();
	
	@Test
	public void registrarPasajero_TodosLosAtribiutos_CuilInexistente() throws ExcepcionCampoIncorrecto {
		//Registra un pasajero con todos sus atributos y el cuil no existe en el sistema
		assertTrue(gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
	}
	
	@Test
	public void registrarPasajero_TodosLosAtributos_CuilExistente() throws ExcepcionCampoIncorrecto {
		//Registra un pasajero con todos sus atributos y el cuil existe en el sistema
		gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602");
		assertFalse(gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
	}
	
	@Test
	public void registrarPasajero_TodosLosAtributos_CuilIncorrecto() throws ExcepcionCampoIncorrecto {
		//Registra un pasajero con todos sus atributos y el cuil es mal ingresado en el sistema
		assertFalse(gestor.crearPasajero("", "Zalazar", "Kevin Nicolas", "+5493825416602"));
	}
	
	@Test
	public void consultarPasajero_EnviarCuil_Correcto() throws ExcepcionCampoIncorrecto {
		//Consulta en la lista si un pasajero existe a travez de su cuil
		assertTrue(gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		Pasajero comparar  = gestor.consultarPasajero("25-23302555-7");
		assertEquals(1, comparar.getIdPasajero());
		assertEquals("25-23302555-7", comparar.getCuil());
		assertEquals("Zalazar", comparar.getApellido());
		assertEquals("Kevin Nicolas", comparar.getNombres());
		assertEquals("+5493825416602", comparar.getTelefono());
	}
	
	@Test
	public void consultarPasajero_EnviarCuil_Incorrecto() throws ExcepcionCampoIncorrecto {
		//Consulta en la lista si un pasajero existe a travez de su cuil, el cual es incorrecto
		assertTrue(gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		Pasajero comparar  = gestor.consultarPasajero("23-23302555-7");
		assertNull(comparar.getNombres());
		
	}
	
	@Test
	public void actualizarPasajero_ModificarNombreYTelefono_CuilCorrecto() throws ExcepcionCampoIncorrecto{
		//Consulta en la lista la existencia de un pasajero y modifica sus campos de nombre y telefono cuando existe
		assertTrue(gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertTrue(gestor.actualizarPasajero("25-23302555-7", "Kevin Manuel", "+5493825434455"));
	}
	
	@Test
	public void eliminarPasajero_PasajeroExistente_CuilCorrecto() throws ExcepcionCampoIncorrecto {
		//Consulta en la lista si un pasajero existe a travez de su cuil, y lo elimina de la lista
		assertTrue(gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertTrue(gestor.eliminarPasajero("25-23302555-7"));
	}
	
	@Test
	public void eliminarPasajero_PasajeroExistente_CuilIncorrecto() throws ExcepcionCampoIncorrecto {
		//Consulta en la lista si un pasajero existe a travez de su cuil, y devuelve false al no encontrarlo
		assertTrue(gestor.crearPasajero("25-23302555-7", "Zalazar", "Kevin Nicolas", "+5493825416602"));
		assertFalse(gestor.eliminarPasajero("28-23302555-7"));
	}
}
