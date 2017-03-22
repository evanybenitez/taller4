package py.edu.facitec.ejemplo2017.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Gerente {
 
	@Id
	@GeneratedValue
	
	//cuando es id el tipo String no se puede generar
	private Integer id;
	private String ci;
	private String nombre;
	
	
	//Aplicacion bidireccional de one to one
	@OneToOne
	private Departamento departamento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	@Override
	public String toString() {
		return "Gerente [id=" + id + ", ci=" + ci + ", nombre=" + nombre + "]";
	}
	
	
}
