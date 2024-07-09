package dao;

import datos.Producto;

///Clase ProductoDao:
public class ProductoDao extends Dao<Producto>
{
	//Atributo:
	private static ProductoDao instancia = null;
	
	//Constructor:
	protected ProductoDao() {}
	
	//Obtener instancia:
	public static ProductoDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new ProductoDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 1:
	public Producto traerProducto(String codigo) 
	{
		Producto producto = null;
		try 
		{
			iniciaOperacion();
			producto = (Producto)session.createQuery("FROM Producto p WHERE p.codigo = :codigo").setParameter("codigo", codigo).uniqueResult();
		}
		finally
		{
			session.close();
		}
		return producto;
	}
}
