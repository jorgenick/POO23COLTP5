package TP05.POO23TP05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dominio.Cliente;
import ar.edu.unju.fi.dominio.ClienteCuentaCorriente;
import ar.edu.unju.fi.dominio.ClienteGrandesCompras;
import ar.edu.unju.fi.dominio.Compra;
import ar.edu.unju.fi.manager.ClienteManager;

class ClienteManagerTestCase {
	
	ClienteGrandesCompras cliente1;
	ClienteGrandesCompras cliente2;
	ClienteGrandesCompras cliente3;
	ClienteCuentaCorriente cliente4;
	ClienteCuentaCorriente cliente5;
	
	Compra compra1;
	Compra compra2;
	Compra compra3;
	Compra compra4;
	Compra compra5;
	Compra compra6;
	Compra compra7;
	
	ClienteManager clienteManager;
	
	ArrayList<Compra> listaDeCompras;
	ArrayList<Cliente> listaClientes;
	
	@BeforeEach
	void hacerAntes() {
	compra1 = new Compra(2,LocalDate.of(2023, 9, 24),20000d);
		try {
			cliente1 = new ClienteGrandesCompras(11111,"Jorge Tolaba","jtolaba@gmail","PALPALA");	
			cliente2 = new ClienteGrandesCompras(2222,"franco Tolaba","jtolaba@gmail","PALPALA");
			cliente3 = new ClienteGrandesCompras(11111,"diego Tolaba","jtolaba@gmail","PALPALA");
			listaClientes = new ArrayList<Cliente>();
		}
		catch (NullPointerException e){
			System.out.println("HUBO UN ERROR");
		}
		
		finally {
			System.out.println("pasa de todas formas a final");
		}

	}
	
	@Test
	void registrarCliente() {
		
		clienteManager.agregarCienteNuevo(cliente1, listaClientes);
		System.out.println("lista ="+listaClientes.size());
		clienteManager.agregarCienteNuevo(cliente2, listaClientes);
		System.out.println("lista ="+listaClientes.size());
		clienteManager.agregarCienteNuevo(cliente1, listaClientes);
		System.out.println("lista ="+listaClientes.size());
		
		System.out.println(listaClientes.get(0).getNombre());
		System.out.println(listaClientes.get(1).getNombre());
		
	}

	@Test
	void cantidadComprassDeUnCliente() {
		cliente1.agregarCompra(compra1);
		cliente1.agregarCompra(compra1);
		cliente1.agregarCompra(compra1);
		assertEquals(3, cliente1.getListaDeCompras().size());
	}
	
	
	@AfterEach
	void hacerDespues(){
		
		
	}

}
