package datos;

import java.time.LocalDate;

///Clase Lote:
public class Lote 
{
	//Atributos:
	private int idLote;
	private LocalDate fecha;
	private int cantInicial;
	private int cantExistente;
	
	//Constructores:
	public Lote() {}
	
	public Lote(LocalDate fecha, int cantInicial, int cantExistente) 
	{
		this.fecha = fecha;
		this.cantInicial = cantInicial;
		this.cantExistente = cantExistente;
	}

	//Getters:
	public int getIdLote()
	{
		return idLote;
	}

	public LocalDate getFecha() 
	{
		return fecha;
	}

	public int getCantInicial()
	{
		return cantInicial;
	}

	public int getCantExistente() 
	{
		return cantExistente;
	}

	//Setters:
	protected void setIdLote(int idLote) 
	{
		this.idLote = idLote;
	}

	public void setFecha(LocalDate fecha) 
	{
		this.fecha = fecha;
	}

	public void setCantInicial(int cantInicial) 
	{
		this.cantInicial = cantInicial;
	}

	public void setCantExistente(int cantExistente)
	{
		this.cantExistente = cantExistente;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "Lote [idLote=#" + idLote + ", fecha=" + fecha + ", cantInicial=" + cantInicial + ", cantExistente=" + cantExistente + "]";
	}
}