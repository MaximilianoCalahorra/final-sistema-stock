package dao;

import datos.Pedido;
import datos.Producto;
import datos.NotaPedido;
import org.hibernate.Hibernate;

public class PedidoDao extends Dao<Pedido>
{
	//Atributo:
	private static PedidoDao instancia = null;
	
	//Constructor:
	protected PedidoDao() {}
	
	//Obtener instancia:
	public static PedidoDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PedidoDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 4:
	public Pedido traerPedido(Producto producto) 
	{
		Pedido pedido = null;
		try 
		{
			iniciaOperacion();
			String hql = "FROM Pedido p INNER JOIN FETCH p.producto pr WHERE pr.idProducto = :idProducto";
			pedido = (Pedido)session.createQuery(hql).setParameter("idProducto", producto.getIdProducto()).uniqueResult();
			Hibernate.initialize(pedido.getNotasPedidos());
			for(NotaPedido notaPedido: pedido.getNotasPedidos()) 
			{
				Hibernate.initialize(notaPedido.getCliente());
			}
		}
		finally 
		{
			session.close();
		}
		return pedido;
	}
}
