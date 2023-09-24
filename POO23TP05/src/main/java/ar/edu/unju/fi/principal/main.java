package ar.edu.unju.fi.principal;

import ar.edu.unju.fi.manager.ClienteManager;

public class main {

	public static void main(String[] args) {

		ClienteManager clienteManager = new ClienteManager();

//		clienteManager.registrarCliente();

		clienteManager.cargarClientes();

		clienteManager.registrarCompras();

	}

}
