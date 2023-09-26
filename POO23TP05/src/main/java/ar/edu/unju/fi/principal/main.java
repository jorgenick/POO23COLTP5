package ar.edu.unju.fi.principal;

import java.time.LocalDate;

import org.apache.log4j.Logger;

import ar.edu.unju.fi.dominio.ClienteGrandesCompras;
import ar.edu.unju.fi.dominio.Compra;
import ar.edu.unju.fi.manager.ClienteManager;

public class main {

	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger(main.class);

		ClienteManager clienteManager = new ClienteManager();
		
//		System.out.println("col");
		
		logger.debug("mi primer logs jorge");

//		clienteManager.registrarCliente();

//		clienteManager.cargarClientes();

//		clienteManager.registrarCompras();
		
//		Compra compra1 = new Compra(2,LocalDate.of(2023, 9, 24),20000d);
//		
//		
//		ClienteGrandesCompras cliente1 = new ClienteGrandesCompras(11111,"Jorge Tolaba","jtolaba@gmail","PALPALA");	

		
//		clienteManager.agregarCienteNuevo();
		
		
		
	}

}
