package py.edu.facitec.ejemplo2017.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Producto;
@Repository
public class ProductoDAO {
	//Gestionar el estado y persistencia de
		//las entidades
		
		@PersistenceContext
		private EntityManager manager;
		
		
		public void save(Producto producto){
			
			
			//Genera el sql para insertar el objeto producto
			manager.persist(producto);
			
		}
		
		

}
