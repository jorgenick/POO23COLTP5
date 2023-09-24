package ar.edu.unju.fi.manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.dominio.Cliente;
import ar.edu.unju.fi.dominio.ClienteCuentaCorriente;
import ar.edu.unju.fi.dominio.ClienteGrandesCompras;
import ar.edu.unju.fi.dominio.Compra;

public class ClienteManager {

	private static List<Cliente> listaClientes = new ArrayList<Cliente>();
	private static List<Compra> listaCompras = new ArrayList<Compra>();

	public void cargarClientes() {

		ClienteCuentaCorriente cliente1 = new ClienteCuentaCorriente(111, "jorge tolaba", "jtolaba@gmail", "palpala");
		listaClientes.add(cliente1);
		ClienteGrandesCompras cliente2 = new ClienteGrandesCompras(dninumeroEncontradoRepetido(), "franco tolaba",
				eMailEncontradorepetido(), "palpala");
		listaClientes.add(cliente2);
		ClienteCuentaCorriente cliente3 = new ClienteCuentaCorriente(333, "diego tolaba", "jtolaba@gmail", "palpala");
		listaClientes.add(cliente3);
		ClienteGrandesCompras cliente4 = new ClienteGrandesCompras(444, "juan murillo", "jtolaba@gmail", "palpala");
		listaClientes.add(cliente4);
		ClienteGrandesCompras cliente5 = new ClienteGrandesCompras(dninumeroEncontradoRepetido(), "mario tolaba",
				"jtolaba@gmail", "palpala");
		listaClientes.add(cliente5);

		for (Cliente cliente : listaClientes)
			System.out.println(cliente);
	}

	public void registrarCompras() {

		Compra compra1 = new Compra(ingresarIDCorrecto(), LocalDate.of(2023, 9, 20), 456465d);
		listaCompras.add(compra1);
		Compra compra2 = new Compra(ingresarIDCorrecto(), LocalDate.of(2023, 9, 20), 456465d);
		listaCompras.add(compra2);
		Compra compra3 = new Compra(ingresarIDCorrecto(), LocalDate.of(2023, 9, 20), 333d);
		listaCompras.add(compra3);
		Compra compra4 = new Compra(ingresarIDCorrecto(), LocalDate.of(2023, 9, 20), 555d);
		listaCompras.add(compra4);
		Compra compra5 = new Compra(ingresarIDCorrecto(), LocalDate.of(2023, 9, 20), 2221212d);
		listaCompras.add(compra5);

		System.out.println("COMPRAS REALIZADAS");
		for (Compra compra : listaCompras) {
			System.out.println(compra);
		}
		contarCantidadDeComprasCliente();

	}

	public void contarCantidadDeComprasCliente() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("INGRESE ID DE CLIENTE para saber cantidad de compras realizadas");
		int idCompras = scanner.nextInt();

		int cantCompras = 0;

		for (Compra compra : listaCompras) {
			if (compra.getId() == idCompras) {
				System.out.println("contado" + compra.getId());
				cantCompras++;
			}
		}
		System.out.println(
				"El cliente " + listaClientes.get(idCompras).getNombre() + " realizo " + cantCompras + " compras");
	}

	public int ingresarIDCorrecto() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("INGRESE ID de cliente");
		int idCorrecto = scanner.nextInt();

		while (BuscarClientePorID(idCorrecto) == false) {
			System.out.println("el ID no se ecuetra en la base de datos, ingrese nuevamente");
			idCorrecto = scanner.nextInt();
		}

		return idCorrecto;
	}

	public boolean BuscarClientePorID(int id) {
		boolean clienteEncontrado = false;

		for (Cliente cliente : listaClientes)
			if (cliente.getId() == id) {
				clienteEncontrado = true;
			}

		if (clienteEncontrado == true) {
			System.out.println("Cliente encontrado");
		} else {
			System.out.println("Cliente NO encontrado");
		}

		return clienteEncontrado;
	}

	public long dninumeroEncontradoRepetido() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese DNI");
		long dni = scanner.nextLong();

		boolean hayRepetidos = false;
		boolean numeroEncontrado = false;

		while (numeroEncontrado == false) {
			for (Cliente cliente : listaClientes)
				if (cliente.getDni() == dni)
					hayRepetidos = true;

			if (hayRepetidos == false) {
				System.out.println("dni cargado exitosamente!");
				numeroEncontrado = true;
				return dni;
			} else {
				System.out.println("El dni ya existe en la base de datos ingrese otro numero de DNI");
				dni = scanner.nextLong();
				hayRepetidos = false;
			}
		}
		return dni;
	}

	public String eMailEncontradorepetido() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese email");
		String eMail = scanner.nextLine();

		boolean hayRepetidos = false;
		boolean cadenaEncontrada = false;

		while (cadenaEncontrada == false) {
			for (Cliente cliente : listaClientes)
				if (cliente.geteMail().equals(eMail))
					hayRepetidos = true;

			if (hayRepetidos == false) {
				System.out.println("eMail cargado exitosamente!");
				cadenaEncontrada = true;
				return eMail;
			} else {
				System.out.println("La cadena ya existe en la base de datos ingrese otro EMAIL");
				eMail = scanner.nextLine();
				hayRepetidos = false;
			}
		}
		return eMail;

	}

	public Cliente registrarCliente() {

		long dni;
		String nombre;
		String email;
		String localidad;

		System.out.println("-------SELECCIONE TIPO DE CLIENTE----------");
		System.out.println("1- CLIENTES CUENTA CORRIENTE");
		System.out.println("2- CLIENTE GRANDES COMPRAS ");

		Scanner scanner = new Scanner(System.in);
		int tipoCliente = scanner.nextInt();

		switch (tipoCliente) {
		case 1:

			System.out.println("ud ha seleccionado CLIENTE cuenta corriente");
			System.out.println("ingrese dni");

			System.out.println("ingrese nombre");

			System.out.println("ingrese eMail");

			System.out.println("ingrese Localidad");

			break;

		case 2:
			System.out.println("ud ha selccionado cliente grandes compras");

			break;

		default:
			System.out.println("no corresponde a ningun tipo de cliente");
			break;
		}

		return null;

	}

}
