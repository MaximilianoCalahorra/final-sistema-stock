package negocio;

import dao.AlmacenDao;
import datos.Almacen;
import datos.Producto;

///Clase AlmacenABM:
public class AlmacenABM 
{
	//Atributo:
	private static AlmacenABM instancia = null;
	
	//Constructor:
	protected AlmacenABM() {}
	
	//Obtener instancia:
	public static AlmacenABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new AlmacenABM();
		}
		return instancia;
	}
	
	//Traer:
	//CU 2:
	public Almacen traerAlmacen(Producto p) 
	{
		return AlmacenDao.getInstance().traerAlmacen(p);
	}
}
