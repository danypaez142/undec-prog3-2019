package ar.edu.undec;
import java.time.LocalDate;

import org.omg.PortableInterceptor.ServerRequestInfo;

public class Piloto {
	private Integer idPiloto;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaNacimiento;

	public Piloto(Integer id, String apellido, String nombres, String documento, LocalDate fechaNacimiento) {
		this.idPiloto = id;
		this.apellido = apellido;
		this.nombres = nombres;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdPiloto() {
		return this.idPiloto.intValue();
	}

	public String getApellido() {
		return this.apellido;
	}

	public String getNombres() {
		return this.nombres;
	}

	public String getDocumento() {
		return this.documento;
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

}
