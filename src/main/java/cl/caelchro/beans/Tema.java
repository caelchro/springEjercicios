package cl.caelchro.beans;

public class Tema 
{
	private int id;
	private String nombre;

	public Tema(int id, String nombre) 
	{
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Tema [id=" + id + ", nombre=" + nombre + "]";
	}
}
