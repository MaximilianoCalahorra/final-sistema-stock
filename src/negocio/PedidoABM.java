package negocio;

import dao.PedidoDao;
import datos.NotaPedido;
import datos.Pedido;
import datos.Producto;

///Clase PedidoABM:
public class PedidoABM
{
	//Atributo:
	private static PedidoABM instancia = null;
	
	//Constructor:
	protected PedidoABM() {}
	
	//Obtener instancia:
	public static PedidoABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PedidoABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 4:
	public Pedido traerPedido(Producto producto) 
	{
		return PedidoDao.getInstance().traerPedido(producto);
	}
	
	//Calcular:
	//CU 5:
	public int calcularCantidadAPedir(Producto producto) 
	{
		int cantidad = 0;
		Pedido pedido = traerPedido(producto);
		for(NotaPedido notaPedido: pedido.getNotasPedidos()) 
		{
			if(!(notaPedido.isEntregado())) 
			{
				cantidad += notaPedido.getCantidad();
			}
		}
		return cantidad;
	}
}
