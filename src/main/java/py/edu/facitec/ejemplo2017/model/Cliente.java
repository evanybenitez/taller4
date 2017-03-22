package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//Paquete javax.persistence 
//Indicamos que se trata de una tabla Cliente por la anotación
@Entity           
public class Cliente {
	
	//Indicamos que se trata de una clave primaria
	@Id
	@GeneratedValue //Para generación automatica de id
	private Integer id;
	private String nombre;
	private String correo;
	
	//aplicacion de asociacion bidireccional
	//mappedBy solo se usa donde hay onetomany
	@OneToMany(mappedBy="cliente")
	private List<Pedido>pedidos;
	
	
	

	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getCorreo() {
		return correo;
	}





	public void setCorreo(String correo) {
		this.correo = correo;
	}





	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	
}
