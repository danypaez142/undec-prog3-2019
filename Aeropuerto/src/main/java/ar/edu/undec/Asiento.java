package ar.edu.undec;

public class Asiento {
	private Integer idAsiento;
	private String numero;

	public Asiento(Integer id, String numero) {
		this.idAsiento = id;
		this.numero = numero;
	}

	public int getIdAsiento() {
		return this.idAsiento.intValue();
	}

	public String getNumero() {
		return this.numero;
	}

}
