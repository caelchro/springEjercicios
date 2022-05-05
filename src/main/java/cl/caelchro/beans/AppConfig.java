package cl.caelchro.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
	@Bean
	public Libro libro()
	{
		return new Libro();
	}

	@Bean
	public Autor autor()
	{
		return new Autor(47, "Marcela Paz");
	}

	@Bean
	public Pais pais()
	{
		return new Pais(34, "Chile");
	}

	@Bean
	public Tema tema()
	{
		return new Tema(55, "Infantil");
	}
}
