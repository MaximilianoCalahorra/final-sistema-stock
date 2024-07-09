package negocio;

import dao.ProductoDao;
import datos.Producto;

///Clase ProductoABM:
public class ProductoABM
{
	//Atributo:
	private static ProductoABM instancia = null;
	
	//Constructor:
	protected ProductoABM() {}
	
	//Obtener instancia:
	public static ProductoABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new ProductoABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 1:
	public Producto traerProducto(String codigo) 
	{
		return ProductoDao.getInstance().traerProducto(codigo);
	}
}