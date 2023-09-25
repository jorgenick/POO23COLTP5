package ar.edu.unju.fi.dominio;

import java.util.ArrayList;

import ar.edu.unju.fi.util.Constante;

public class ClienteCuentaCorriente extends Cliente {
	/**
	 * tienen la posibilidad de retirar materiales a cuenta con un tope de dinero
	 */

	public double montoMensualAFavor;
	
	public static Constante constate = new Constante();

	public ClienteCuentaCorriente() {
		super();
	}

	public ClienteCuentaCorriente(long dni, String nombre, String eMail, String localidad) {
		super(dni, nombre, eMail, localidad);

		this.montoMensualAFavor = constate.MONTO_TOPE;
	}

	public double getMontoMensualAFavor() {
		return montoMensualAFavor;
	}

	public void setMontoMensualAFavor(long montoMensualAFavor) {
		this.montoMensualAFavor = montoMensualAFavor;
	}

}
