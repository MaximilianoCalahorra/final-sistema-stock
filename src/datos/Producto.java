package datos;

///Clase Producto:
public class Producto 
{
	//Atributos:
	private int idProducto;
	private String codigo;
	private String producto;
	private double precio;
	
	//Constructores:
	public Producto() {}
	
	public Producto(String codigo, String producto, double precio) 
	{
		this.codigo = codigo;
		this.producto = producto;
		this.precio = precio;
	}

	//Getters:
	public int getIdProducto()
	{
		return idProducto;
	}

	public String getCodigo() 
	{
		return codigo;
	}

	public String getProducto()
	{
		return producto;
	}

	public double getPrecio() 
	{
		return precio;
	}

	//Setters:
	protected void setIdProducto(int idProducto)
	{
		this.idProducto = idProducto;
	}

	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	public void setProducto(String producto) 
	{
		this.producto = producto;
	}

	public void setPrecio(double precio) 
	{
		this.precio = precio;
	}

	//To String:
	@Override
	public String toString()
	{
		return "Producto [idProducto=#" + idProducto + ", codigo=#" + codigo + ", producto=" + producto + ", precio=$" + precio + "]";
	}
}
