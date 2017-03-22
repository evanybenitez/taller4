package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	
	@Id	//id de utilza solo cuando es string
	private String login;
	
	
	//columna con restriccion unica
	@Column(unique=true)
	private String name;
	private String password;
	
	
	@OneToMany(mappedBy="usuario")
	private List<Pedido>pedidos;
	
	
	@ManyToOne
	private Departamento departamento;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", name=" + name + ", password=" + password + ", pedidos=" + pedidos
				+ ", departamento=" + departamento + "]";
	}
	
	
	
}
