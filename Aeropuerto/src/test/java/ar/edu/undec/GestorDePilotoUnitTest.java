package ar.edu.undec;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class GestorDePilotoUnitTest {
	GestorDePilotos gestor = new GestorDePilotos();

	@Test
	public void registrarPiloto_TodosLosCampos_Correctos() {
		//Se registrara un piloto con todos sus atributos, su documento correcto y mayor de edad
		LocalDate fechaNacimiento = LocalDate.of(1989, 3, 25);
		assertTrue(gestor.crearPiloto("Lopez", "Mario Fernando", "24500000", fechaNacimiento));
	}
	
	@Test
	public void registrarPiloto_TodosLosCampos_DocumentoExistente() {
		//Se registrara un piloto con todos sus atributos, su documento esta registrado en el sistema
		LocalDate fechaNacimientoLuna = LocalDate.of(1989, 3, 25);
		LocalDate fechaNacimientoPerea = LocalDate.of(1989, 5, 12);
		assertTrue(gestor.crearPiloto("Luna", "Mario Fernando", "24500000", fechaNacimientoLuna));
		assertFalse(gestor.crearPiloto("Perea", "Mariano Fernando", "24500000", fechaNacimientoPerea));
	}
	
	@Test
	public void registrarPiloto_TodosLosCampos_DocumentoVacio() {
		//Se registrara un piloto con todos sus atributos, su documento en vacio
		LocalDate fechaNacimiento = LocalDate.of(1989, 3, 25);
		assertFalse(gestor.crearPiloto("Luna", "Mario Fernando", "", fechaNacimiento));
	}
	
	@Test
	public void registrarPiloto_TodosLosCampos_MenorDeEdad() {
		//Se registrara un piloto con todos sus atributos, su documento correcto y menor de edad
		LocalDate fechaNacimiento = LocalDate.of(2003, 3, 25);
		assertFalse(gestor.crearPiloto("Perea", "Mariano Fernando", "24500000", fechaNacimiento));
	}
	
	@Test
	public void consultarPiloto_EnviarDocumento_DocumentoCorrecto() {
		/*Se solicitara la existencia de un piloto registrado en el	sistema mediante el ingreso 
		 * correcto de su documento, y se compara si los datos son correctos*/
		LocalDate fechaNacimiento = LocalDate.of(1989, 3, 25);
		assertTrue(gestor.crearPiloto("Luna", "Mario Fernando", "24500000", fechaNacimiento));
		Piloto consultar = gestor.consultarPiloto("24500000");
		assertEquals(1, consultar.getIdPiloto());
		assertEquals("Luna", consultar.getApellido());
		assertEquals("Mario Fernando", consultar.getNombres());
		assertEquals(fechaNacimiento, consultar.getFechaNacimiento());
	}
	
	@Test
	public void consultarPiloto_EnviarDocumento_DocumentoIncorrecto(){
		/*Se solicitara la existencia de un piloto registrado en el	sistema mediante el ingreso 
		 * incorrecto de su documento, y se compara si los datos son correctos*/
		LocalDate fechaNacimiento = LocalDate.of(1989, 3, 25);
		assertTrue(gestor.crearPiloto("Luna", "Mario Fernando", "24500000", fechaNacimiento));
		Piloto consultar = gestor.consultarPiloto("22200000");
		assertNull(consultar.getApellido());		
	}
	
	@Test
	public void actualizarPiloto_ModificarApellidoYNombre_Correctos() {
	/*Se solicitara la existencia de un piloto registrado en el	sistema mediante el ingreso 
	 * incorrecto de su documento, y se compara si los datos son correctos*/
	LocalDate fechaNacimiento = LocalDate.of(1989, 3, 25);
	assertTrue(gestor.crearPiloto("Luna", "Mario Fernando", "24500000", fechaNacimiento));	
	assertTrue(gestor.actualizarPiloto("24500000","Perea", "Mariano Fernando"));
	}
	
	@Test
	public void eliminarPiloto_PilotoExistente_DocumentoCorrecto() {
		/*Se dara de baja a un piloto registrado, mediante la busqueda de su documento*/
		LocalDate fechaNacimiento = LocalDate.of(1989, 3, 25);
		assertTrue(gestor.crearPiloto("Luna", "Mario Fernando", "24500000", fechaNacimiento));
		assertTrue(gestor.eliminarPiloto("24500000"));
	}
	
	@Test
	public void eliminarPiloto_PilotoExistente_DocumentoIncorrecto() {
		/*Se dara de baja a un piloto registrado, mediante la busqueda de su documento, el cual 
		 * esta incorrecto*/
		LocalDate fechaNacimiento = LocalDate.of(1989, 3, 25);
		assertTrue(gestor.crearPiloto("Luna", "Mario Fernando", "24500000", fechaNacimiento));
		assertFalse(gestor.eliminarPiloto("22500000"));
	}
}
