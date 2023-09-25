package ar.edu.unju.fi.principal;

import java.time.LocalDate;

import ar.edu.unju.fi.dominio.ClienteGrandesCompras;
import ar.edu.unju.fi.dominio.Compra;
import ar.edu.unju.fi.manager.ClienteManager;

public class main {

	public static void main(String[] args) {

		ClienteManager clienteManager = new ClienteManager();

//		clienteManager.registrarCliente();

//		clienteManager.cargarClientes();

//		clienteManager.registrarCompras();
		
		Compra compra1 = new Compra(2,LocalDate.of(2023, 9, 24),20000d);
		
		
		ClienteGrandesCompras cliente1 = new ClienteGrandesCompras(11111,"Jorge Tolaba","jtolaba@gmail","PALPALA");	

	}

}
