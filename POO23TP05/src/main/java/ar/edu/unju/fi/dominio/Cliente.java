package ar.edu.unju.fi.dominio;

import java.util.ArrayList;

public abstract class Cliente {
	// JORGE
/**
 * sdfsdfd
 * 
 * sfsdfsdfsdfSDFSD
 */
	private int id;
	private long dni;
	private String nombre;
	private String eMail;
	private String localidad;
	
	
	private Compra compra = new Compra();
	
	private ArrayList<Compra> listaDeCompras = new ArrayList<Compra>();
	
	private static int next_Id = 1;
	

	public Cliente() {

	}

	public Cliente(long dni, String nombre, String eMail, String localidad) {

		this.id = id + next_Id;
		next_Id++;
		this.dni = dni;
		this.nombre = nombre;
		this.eMail = eMail;
		this.localidad = localidad;
//		this.compra = compra;
////		this.listaDeCompras = listaDeCompras;
//		listaDeCompras.add(compra);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public static int getNext_Id() {
		return next_Id;
	}

	public static void setNext_Id(int next_Id) {
		Cliente.next_Id = next_Id;
	}

	
	public ArrayList<Compra> getListaDeCompras() {
		return listaDeCompras;
	}

	public void setListaDeCompras(ArrayList<Compra> listaDeCompras) {
		this.listaDeCompras = listaDeCompras;
	}
	
	
	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public void agregarCompra(Compra compra) {
		listaDeCompras.add(compra);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", eMail=" + eMail + ", localidad="
				+ localidad + "]";
	}

}
