package cl.caelchro.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Personaje 
{
	@Value("11")
	private int id;
	@Value("Sheldom Couper")
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
		return "Personaje [id=" + id + ", nombre=" + nombre + "]";
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
