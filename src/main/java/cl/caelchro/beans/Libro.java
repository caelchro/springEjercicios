package cl.caelchro.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Libro 
{
	@Value("101")
	private int id;
	@Value("Papelucho")
	private String nombre;
	@Autowired
	private Autor autor;

	@Autowired
	private Tema tema;

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", tema=" + tema + "]";
	}

}
