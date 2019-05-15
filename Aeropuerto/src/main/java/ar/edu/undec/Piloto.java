package ar.edu.undec;
import java.time.LocalDate;
import java.time.Period;
public class Piloto {
	private Integer idPiloto;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaNacimiento;

	public Piloto(Integer id, String apellido, String nombres, String documento, LocalDate fechaNacimiento) throws ExcepcionCampoIncorrecto {
		if(documento.isEmpty()) {
			throw new ExcepcionCampoIncorrecto("El documento no puede estar vacio");
		}else if( (Period.between(fechaNacimiento, LocalDate.now()).getYears()) < 18){
			throw new ExcepcionCampoIncorrecto("El Piloto debe ser mayor de Edad");			
		}else {
			this.idPiloto = id;
			this.apellido = apellido;
			this.nombres = nombres;
			this.documento = documento;
			this.fechaNacimiento = fechaNacimiento;
		}
		
	}

	public Piloto() {
		// TODO Auto-generated constructor stub
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

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
}
