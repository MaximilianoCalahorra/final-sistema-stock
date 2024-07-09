package datos;

///Clase Cliente:
public class Cliente 
{
	//Atributos:
	private int idCliente;
	private String apellido;
	private String nombre;
	private String email;
	
	//Constructores:
	public Cliente() {}
	
	public Cliente(String apellido, String nombre, String email) 
	{
		this.apellido = apellido;
		this.nombre = nombre;
		this.email = email;
	}

	//Getters:
	public int getIdCliente() 
	{
		return idCliente;
	}

	public String getApellido()
	{
		return apellido;
	}

	public String getNombre()
	{
		return nombre;
	}

	public String getEmail() 
	{
		return email;
	}
	
	//Setters:
	protected void setIdCliente(int idCliente) 
	{
		this.idCliente = idCliente;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	//To String:
	@Override
	public String toString() 
	{
		return "Cliente [idCliente=#" + idCliente + ", apellido=" + apellido + ", nombre=" + nombre + ", email=" + email + "]";
	}	
}
