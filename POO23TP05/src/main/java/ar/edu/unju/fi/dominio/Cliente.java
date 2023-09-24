package ar.edu.unju.fi.dominio;

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
	private String jot;
	private int di;

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

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", eMail=" + eMail + ", localidad="
				+ localidad + "]";
	}

}
