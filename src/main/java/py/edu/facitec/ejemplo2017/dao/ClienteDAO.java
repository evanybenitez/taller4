package py.edu.facitec.ejemplo2017.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Cliente;

//Indicamos a Spring que se trata de una clase
//que manipulara datos 
@Repository
public class ClienteDAO {
	
	//Gestionar el estado y persistencia de
	//las entidades
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public void save(Cliente cliente){
		
		
		//Genera el sql para insertar el objeto cliente
		manager.persist(cliente);
		
	}
	
	

}
