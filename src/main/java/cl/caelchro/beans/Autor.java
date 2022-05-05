package cl.caelchro.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Autor 
{
	private int id;
	private String nombre;
	@Autowired
	private Pais pais;

	public Autor(int id, String nombre) 
	{
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", pais=" + pais + "]";
	}
}
