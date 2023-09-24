package ar.edu.unju.fi.dominio;

public class ClienteCuentaCorriente extends Cliente {
	/**
	 * tienen la posibilidad de retirar materiales a cuenta con un tope de dinero
	 */

	public long montoMensualAFavor = 5000;

	public ClienteCuentaCorriente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteCuentaCorriente(long dni, String nombre, String eMail, String localidad) {
		super(dni, nombre, eMail, localidad);

		this.montoMensualAFavor = montoMensualAFavor;
	}

	public long getMontoMensualAFavor() {
		return montoMensualAFavor;
	}

	public void setMontoMensualAFavor(long montoMensualAFavor) {
		this.montoMensualAFavor = montoMensualAFavor;
	}

}
