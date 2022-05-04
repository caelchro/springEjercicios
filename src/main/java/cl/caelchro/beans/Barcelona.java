package cl.caelchro.beans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cl.caelchro.interfaces.IEquipo;

@Component	//generico
@Service	//consume datos
@Repository	//datos
@Controller	//MVC
public class Barcelona implements IEquipo 
{
	private int id = 1;
	private String nombre = "Barcelona";
	
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
