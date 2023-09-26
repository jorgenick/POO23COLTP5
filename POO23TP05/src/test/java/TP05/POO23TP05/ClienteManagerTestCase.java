package TP05.POO23TP05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.dominio.Cliente;
import ar.edu.unju.fi.dominio.ClienteCuentaCorriente;
import ar.edu.unju.fi.dominio.ClienteGrandesCompras;
import ar.edu.unju.fi.dominio.Compra;
import ar.edu.unju.fi.exception.ClienteException;
import ar.edu.unju.fi.manager.ClienteManager;

class ClienteManagerTestCase {
	
	
	final static Logger logger = Logger.getLogger(ClienteManagerTestCase.class);	
	
	
	
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
			cliente3 = new ClienteGrandesCompras(33333,"diego Tolaba","jtolaba@gmail","PALPALA");
			cliente4 = new ClienteCuentaCorriente(44444,"diego Tolaba","jtolaba@gmail","PALPALA");
			cliente5 = new ClienteCuentaCorriente(44444,"diego Tolaba","jtolaba@gmail","PALPALA");
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
		
		try {
			
			clienteManager.agregarCienteNuevo(cliente1, listaClientes);
			logger.info("listCANTIDAD DE CLIENTES CARGADOS ="+listaClientes.size());
			clienteManager.agregarCienteNuevo(cliente2, listaClientes);
			logger.info("CANTIDAD DE CLIENTES CARGADOS ="+listaClientes.size());
			clienteManager.agregarCienteNuevo(cliente3, listaClientes);
			logger.info("CANTIDAD DE CLIENTES CARGADOS ="+listaClientes.size());
			clienteManager.agregarCienteNuevo(cliente4, listaClientes);
			logger.info("CANTIDAD DE CLIENTES CARGADOS ="+listaClientes.size());
			clienteManager.agregarCienteNuevo(cliente5, listaClientes);
			logger.info("CANTIDAD DE CLIENTES CARGADOS ="+listaClientes.size());
			
			System.out.println(listaClientes.get(0).getNombre());
			System.out.println(listaClientes.get(1).getNombre());
			
		} catch (ClienteException e){
			
			logger.error(e.getMessage());
			
		}
		

		
	}

	@Test
	@Disabled
	void cantidadComprassDeUnCliente() {
		cliente1.agregarCompra(compra1);
		cliente1.agregarCompra(compra1);
		cliente1.agregarCompra(compra1);
		assertEquals(3, cliente1.getListaDeCompras().size());
	}
	
	
	@Test
	@Disabled
	void registrarUnaCompra() {
		
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);
		
		clienteManager.registrarCompra(listaClientes);
		
	}
	
	
	@AfterEach
	void hacerDespues(){
		
		 cliente1  = null;
		 cliente2= null;
		 cliente3= null;
		 cliente4= null;
		 cliente5= null;
		
		 compra1= null;
		 compra2= null;
		 compra3= null;
		 compra4= null;
		 compra5= null;
		 compra6= null;
		 compra7= null;
				
	}

}
