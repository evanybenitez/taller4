package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.ejemplo2017.dao.ClienteDAO;
import py.edu.facitec.ejemplo2017.model.Cliente;

@Controller
@Transactional
public class ClienteController {

	//Crea una intancia del objeto
	//para toda la aplicación
	//Inyección de dependencia
	@Autowired
	private ClienteDAO dao;
	
	
	@RequestMapping("/clientes")// Convierte lo recibido por la url
								//en objeto Java cliente
	
							
	public String registrar(Cliente cliente){
		
		System.out.println("Ingrese al controller"+cliente);
		
		dao.save(cliente);
		
		return "view/cliente/ok";
	}
	
	
	
	
}





