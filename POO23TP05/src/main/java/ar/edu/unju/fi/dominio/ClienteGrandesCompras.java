package ar.edu.unju.fi.dominio;

public class ClienteGrandesCompras extends Cliente {
	/**
	 * tienen un determinado descuento
	 */
	double porcentajeDescuento = 0.5;

	public ClienteGrandesCompras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteGrandesCompras(long dni, String nombre, String eMail, String localidad) {
		super(dni, nombre, eMail, localidad);

		this.porcentajeDescuento = porcentajeDescuento;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

}
