package cl.caelchro.beans;

import cl.caelchro.interfaces.IEquipo;

//@Component
public class Juventus implements IEquipo 
{
	private int id = 2;
	private String nombre = "Juventus";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String mostrar() 
	{
		return this.id + " " + this.nombre;
	}
}
