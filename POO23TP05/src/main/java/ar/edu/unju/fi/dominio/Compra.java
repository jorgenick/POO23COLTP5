package ar.edu.unju.fi.dominio;

import java.time.LocalDate;

public class Compra {

	private int id;
	private LocalDate fecha;
	private double importe;

	public Compra() {
		super();
	}
	
	public Compra( double importe) {
		this.importe=importe;
	}

	public Compra(int id, LocalDate fecha, double importe) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", fecha=" + fecha + ", importe=" + importe + "]";
	}

}
