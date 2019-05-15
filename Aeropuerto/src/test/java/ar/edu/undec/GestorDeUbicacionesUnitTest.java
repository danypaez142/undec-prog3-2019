package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestorDeUbicacionesUnitTest {
	GestorDeUbicaciones gestor = new GestorDeUbicaciones();

	@Test
	public void crearCiudad_TodosSusAtributos_Correctos() {
		/*Se dara de alta una nueva ciudad, asegurando de que su codigo postal no haya sido 
		 *registrado en el sistema*/
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
	}
	
	@Test
	public void crearCiudad_TodosSusAtributos_CodigoPostalIncorrectos() {
		/*Se dara de alta una nueva ciudad, en este caso el codigo postal es vacio*/
		assertFalse(gestor.crearCiudad("Chilecito", ""));
	}
	
	@Test
	public void crearCiudad_TodosSusAtributos_NombreIncorrectos() {
		/*Se dara de alta una nueva ciudad, en este caso el nombre es vacio*/
		assertFalse(gestor.crearCiudad("", "5360"));
	}

	@Test
	public void crearCiudad_TodosSusAtributos_CodigoPostalYNombreIncorrectos() {
		/*Se dara de alta una nueva ciudad, en este caso el nombre y el codigo postal estan vacios*/
		assertFalse(gestor.crearCiudad("", ""));
	}
	
	@Test
	public void crearCiudad_TodosSusAtributos_CodigoPostalExistente() {
		/*Se dara de alta una nueva ciudad, en este caso el nombre y el codigo postal estan vacios*/
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		assertFalse(gestor.crearCiudad("Pereira", "5360"));
	}
	
	@Test
	public void consultarCiudad_EnviarCodigoPostal_AfirmarExistencia() {
		/*Se le consultara al sistema si existe una ciudad cargada, devolviendo true*/
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		assertTrue(gestor.consultarExistenciaCiudad("5360"));
	}
	
	@Test
	public void consultarCiudad_EnviarCodigoPostal_NegarExistencia() {
		/*Se le consultara al sistema si existe una ciudad cargada, devolviendo false*/
		assertFalse(gestor.consultarExistenciaCiudad("5000"));
	}
	
	@Test
	public void consultarCiudad_EnviarCodigoPostal_DevolverCiudadExistente() {
		/*Se le consultara al sistema si existe una ciudad cargada, en caso verdadero devolver
		 * el objeto ciudad buscado*/ 
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad comparar = gestor.consultarCiudad("5360");
		assertEquals(1, comparar.getIdCiudad());
		assertEquals("Chilecito", comparar.getNombre());
		assertEquals("5360", comparar.getCodigoPostal());
	}
	
	@Test
	public void consultarCiudad_EnviarCodigoPostal_DevolverCiudadInexistente() {
		Ciudad comparar = gestor.consultarCiudad("5000");
		assertNull(comparar.getNombre());
	}
	
	@Test
	public void actualizarCiudad_EnviarCodigoPostalYNombre_AfirmarCambioPorCiudadExistente() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		assertTrue(gestor.actualizarCiudad("5360", "Chile Cito"));
	}
	
	@Test
	public void actualizarCiudad_EnviarCodigoPostalYNombre_NegarCambioPorCiudadInexistente() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		assertFalse(gestor.actualizarCiudad("5860", "Chile Cito"));
	}
	
	@Test
	public void eliminarCiudad_EnviarCodigoPostal_AfirmarEliminacion() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		assertTrue(gestor.eliminarCiudad("5360"));
	}
	
	@Test
	public void eliminarCiudad_EnviarCodigoPostal_NegarEliminacionPorCiudadInexistente() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		assertFalse(gestor.eliminarCiudad("5860"));
	}
	
	@Test
	public void crearAeropuerto_TodosLosAtributos_Correctos() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.consultarCiudad("5360");
		assertTrue(gestor.crearAeropuerto("San Buena Aventura", almacenar, "25FG14"));
	}
	
	@Test
	public void crearAeropuerto_TodosLosAtributos_CodigoVacio() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.consultarCiudad("5360");
		assertFalse(gestor.crearAeropuerto("San Buena Aventura", almacenar, ""));
	}
	
	@Test
	public void consultarAeropuerto_EnviarNombre_AfirmarExistencia() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.consultarCiudad("5360");
		assertTrue(gestor.crearAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertTrue(gestor.consultarExistenciaAeropuerto("25FG14"));
	}
	
	@Test
	public void consultarAeropuerto_EnviarNombre_NegarExistencia() {
		assertFalse(gestor.consultarExistenciaAeropuerto("25GF41"));
	}
	
	@Test
	public void actualizarAeropuerto_EnviarCodigoYNombre_AfirmarCambioPorAeropuertoExistente() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.consultarCiudad("5360");
		assertTrue(gestor.crearAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertTrue(gestor.actualizarAeropuerto("25FG14", "San Juan Pedegrin"));
	}
	
	@Test
	public void actualizarAeropuerto_EnviarCodigoYNombre_NegarCambioPorAeropuertoExistente() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.consultarCiudad("5360");
		assertTrue(gestor.crearAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertFalse(gestor.actualizarAeropuerto("28FG14", "San Juan Pedegrin"));
	}
	
	@Test
	public void eliminarAeropuerto_EnviarCodigo_AfirmarEliminacion() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.consultarCiudad("5360");
		assertTrue(gestor.crearAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertTrue(gestor.eliminarAeropuerto("25FG14"));
	}
	
	@Test
	public void eliminarAeropuerto_EnviarCodigo_NegarEliminacionPorAeropuertoInexistente() {
		assertTrue(gestor.crearCiudad("Chilecito", "5360"));
		Ciudad almacenar = gestor.consultarCiudad("5360");
		assertTrue(gestor.crearAeropuerto("San Buena Aventura", almacenar, "25FG14"));
		assertFalse(gestor.eliminarAeropuerto("28FG14"));
	}
}
