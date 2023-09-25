package ar.edu.unju.fi.dominio;

import java.util.ArrayList;

import ar.edu.unju.fi.util.Constante;

public class ClienteGrandesCompras extends Cliente {
	/**
	 * tienen un determinado descuento
	 */
	private double porcentajeDescuento;
	
	public static Constante constante = new Constante();

	public ClienteGrandesCompras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteGrandesCompras(long dni, String nombre, String eMail, String localidad) {
		super(dni, nombre, eMail, localidad);

		this.porcentajeDescuento = constante.PORCENTAJE_DESCUENTO;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

}
