package datos;

import java.util.Set;
import java.util.HashSet;

///Clase Pedido:
public class Pedido extends Stock
{
	//Atributo:
	private Set<NotaPedido> notasPedidos;

	//Constructores:
	public Pedido() {}
	
	public Pedido(Producto producto) 
	{
		super(producto);
		this.notasPedidos = new HashSet<NotaPedido>();
	}
	
	//Getter:
	public Set<NotaPedido> getNotasPedidos() {
		return notasPedidos;
	}

	//Setter:
	public void setNotasPedidos(Set<NotaPedido> notasPedidos)
	{
		this.notasPedidos = notasPedidos;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "\nPedido [" + super.toString() + ", notasPedidos=" + notasPedidos + "]\n";
	}
}
