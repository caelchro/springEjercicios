package cl.caelchro.beans;

public class Pais 
{
	private int id;
	private String nombre;

	public Pais(int id, String nombre) 
	{
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + "]";
	}
}
