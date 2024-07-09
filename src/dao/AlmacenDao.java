package dao;

import datos.Almacen;
import datos.Producto;
import org.hibernate.Hibernate;

///Clase AlmacenDao:
public class AlmacenDao extends Dao<Almacen>
{
	//Atributo:
	private static AlmacenDao instancia = null;
	
	//Constructor:
	protected AlmacenDao() {}
	
	//Obtener instancia:
	public static AlmacenDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new AlmacenDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 2:
	public Almacen traerAlmacen(Producto p) 
	{
		Almacen almacen = null;
		try 
		{
			iniciaOperacion();
			String hql = "FROM Almacen a INNER JOIN FETCH a.producto p WHERE p.idProducto = :idProducto";
			almacen = (Almacen)session.createQuery(hql).setParameter("idProducto", p.getIdProducto()).uniqueResult();
			Hibernate.initialize(almacen.getLotes());
		}
		finally 
		{
			session.close();
		}
		return almacen;
	}
}
