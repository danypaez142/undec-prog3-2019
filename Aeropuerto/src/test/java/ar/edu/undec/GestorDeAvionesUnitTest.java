package ar.edu.undec;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestorDeAvionesUnitTest {
	GestorDeAviones gestor = new GestorDeAviones();

	@Test
	public void crearAvion_TodosLosAtributos_Correctos() {
		assertTrue(gestor.crearAvion("Boeing 747", "76MX94", 50));
	}
	
	@Test
	public void crearAvion_TodosLosAtributos_MatriculaVacia() {
		assertFalse(gestor.crearAvion("Boeing 747", "", 50));
	}
	
	@Test
	public void consultarAvion_EnviarMatricula_ConfirmarExistencia() {
		assertTrue(gestor.crearAvion("Boeing 747", "76MX94", 50));
		assertTrue(gestor.consultarExistenciaAvion("76MX94"));
	}
	
	@Test
	public void consultarAvion_EnviarMatricula_NegarExistencia() {
		assertFalse(gestor.consultarExistenciaAvion("76MX94"));
	}
	
	@Test
	public void eliminarAvion_EnviarMatricula_AfirmarEliminacion() {
		assertTrue(gestor.crearAvion("Boeing 747", "76MX94", 50));
		assertTrue(gestor.eliminarAvion("76MX94"));
	}
	
	@Test
	public void eliminarAvion_EnviarMatricula_NegarEliminacionPorAvionInexistente() {
		assertFalse(gestor.eliminarAvion("76MX94"));
	}
}
