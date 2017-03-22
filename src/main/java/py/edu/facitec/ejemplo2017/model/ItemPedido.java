package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue
	private Integer id;
	private int camtidadProducto;
	private double subTotal;
	
	@ManyToOne
	private Pedido pedido;
	
	
	@ManyToOne
	private Producto producto;
	
	
	@OneToMany(mappedBy="departamento")
	
	private List<Usuario>usuarios;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getCamtidadProducto() {
		return camtidadProducto;
	}


	public void setCamtidadProducto(int camtidadProducto) {
		this.camtidadProducto = camtidadProducto;
	}


	public double getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	@Override
	public String toString() {
		return "ItemPedido [id=" + id + ", camtidadProducto=" + camtidadProducto + ", subTotal=" + subTotal
				+ ", pedido=" + pedido + ", producto=" + producto + "]";
	}
	
	
	
}
