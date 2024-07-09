package datos;

///Clase Stock:
public abstract class Stock
{
	//Atributos:
	private int idStock;
	private Producto producto;
	
	//Constructores:
	public Stock() {}
	
	public Stock(Producto producto) 
	{
		this.producto = producto;
	}

	//Getters:
	public int getIdStock() 
	{
		return idStock;
	}

	public Producto getProducto()
	{
		return producto;
	}

	//Setters:
	protected void setIdStock(int idStock) 
	{
		this.idStock = idStock;
	}

	public void setProducto(Producto producto)
	{
		this.producto = producto;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "idStock=#" + idStock + ", producto=" + producto;
	}	
}
