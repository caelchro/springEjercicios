package cl.caelchro.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Serie 
{
	private int id;
	private String nombre;
	@Autowired
//	@Qualifier("nombreClase")
	Personaje personaje;
	@Autowired
	Streaming streaming;
	

	@Override
	public String toString() {
		return "Serie [id=" + id + ", nombre=" + nombre + ", personaje=" + personaje + ", streaming=" + streaming + "]";
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	@Value("The big band theory")
	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Streaming getStreaming() {
		return streaming;
	}

	public void setStreaming(Streaming streaming) {
		this.streaming = streaming;
	}
}
