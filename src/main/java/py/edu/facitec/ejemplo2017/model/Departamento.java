package py.edu.facitec.ejemplo2017.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import antlr.collections.List;



@Entity
public class Departamento {

	
	@Id
	@GeneratedValue
	
	private Integer id;
	private String descripcion;
	
	
	
	@OneToMany(mappedBy="departamento")
	private java.util.List<Usuario>usuarios;
	
	//Aplicacion de asociacion bidireccional
			//mappedBy = a nombre del Dpto en la clase Gerente
			//solo en una de las clases se utiliza la propiedad mappedBy
	
	
	@OneToOne(mappedBy="departamento") //Relacion de uno a uno
	private Gerente gerente;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public java.util.List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(java.util.List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", descripcion=" + descripcion + ", usuarios=" + usuarios + ", gerente="
				+ gerente + "]";
	}
	
	
	
	
}
