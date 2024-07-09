package datos;

import java.util.Set;
import java.util.HashSet;

///Clase Almacen:
public class Almacen extends Stock
{
	//Atributos:
	private int cantDeseable;
	private int cantMinima;
	private Set<Lote> lotes;
	
	//Constructores:
	public Almacen() {}
	
	public Almacen(Producto producto, int cantDeseable, int cantMinima) 
	{
		super(producto);
		this.cantDeseable = cantDeseable;
		this.cantMinima = cantMinima;
		this.lotes = new HashSet<Lote>();
	}

	//Getters:
	public int getCantDeseable() 
	{
		return cantDeseable;
	}

	public int getCantMinima()
	{
		return cantMinima;
	}

	public Set<Lote> getLotes() 
	{
		return lotes;
	}

	//Setters:
	public void setCantDeseable(int cantDeseable) 
	{
		this.cantDeseable = cantDeseable;
	}

	public void setCantMinima(int cantMinima)
	{
		this.cantMinima = cantMinima;
	}

	public void setLotes(Set<Lote> lotes)
	{
		this.lotes = lotes;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "\nAlmacen [" + super.toString() + ", cantDeseable=" + cantDeseable + ", cantMinima=" + cantMinima + ", lotes=" + lotes + "]\n";
	}
	
	//CU 3:
	public int cantProductosExistentes() 
	{
		int cantidad = 0;
		for(Lote lote: lotes) 
		{
			cantidad += lote.getCantExistente();
		}
		return cantidad;
	}
}
