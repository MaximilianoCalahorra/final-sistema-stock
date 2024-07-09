package datos;

import java.time.LocalDate;

///Clase NotaPedido:
public class NotaPedido
{
	//Atributos:
	private int idNotaPedido;
	private LocalDate fecha;
	private int cantidad;
	private Cliente cliente;
	private boolean entregado;
	
	//Constructores:
	public NotaPedido() {}
	
	public NotaPedido(LocalDate fecha, int cantidad, Cliente cliente, boolean entregado) 
	{
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.cliente = cliente;
		this.entregado = entregado;
	}

	//Getters:
	public int getIdNotaPedido() 
	{
		return idNotaPedido;
	}

	public LocalDate getFecha() 
	{
		return fecha;
	}

	public int getCantidad() 
	{
		return cantidad;
	}

	public Cliente getCliente() 
	{
		return cliente;
	}

	public boolean isEntregado() 
	{
		return entregado;
	}

	//Setters:
	protected void setIdNotaPedido(int idNotaPedido) 
	{
		this.idNotaPedido = idNotaPedido;
	}

	public void setFecha(LocalDate fecha)
	{
		this.fecha = fecha;
	}

	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}

	public void setCliente(Cliente cliente) 
	{
		this.cliente = cliente;
	}

	public void setEntregado(boolean entregado)
	{
		this.entregado = entregado;
	}
	
	//To String:
	@Override
	public String toString() 
	{
		return "NotaPedido [idNotaPedido=#" + idNotaPedido + ", fecha=" + fecha + ", cantidad=" + cantidad + ", cliente="
				+ cliente + ", entregado=" + entregado + "]";
	}
}