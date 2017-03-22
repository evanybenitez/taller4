package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.ejemplo2017.dao.ClienteDAO;
import py.edu.facitec.ejemplo2017.dao.ProductoDAO;
import py.edu.facitec.ejemplo2017.model.Cliente;
import py.edu.facitec.ejemplo2017.model.Producto;

public class ProductoController {
	//Crea una intancia del objeto
		//para toda la aplicación
		//Inyección de dependencia
		@Autowired
		private ProductoDAO dao;
		
		
		@RequestMapping("/producto")// Convierte lo recibido por la url
									//en objeto Java cliente
		
								
		public String registrar(Producto producto){
			
			System.out.println("Ingrese al controller"+producto);
			
			dao.save(producto);
			
			return "view/producto/ok";
		}
		
		
		
		
}
