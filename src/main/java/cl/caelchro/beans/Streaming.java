package cl.caelchro.beans;

import org.springframework.stereotype.Component;

@Component
public class Streaming 
{
	private int id;
	private String nombre;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	@Override
	public String toString() 
	{
		return "Streaming [id=" + id + ", nombre=" + nombre + "]";
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
}
