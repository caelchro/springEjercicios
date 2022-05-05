package cl.caelchro.spring;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.caelchro.beans.AppConfig;
import cl.caelchro.beans.Barcelona;
import cl.caelchro.beans.Jugador;
import cl.caelchro.beans.Juventus;
import cl.caelchro.beans.Libro;
import cl.caelchro.beans.Serie;

@SpringBootApplication
public class Ejercicio1Application 
{
	public static void main(String[] args)
	{
		//SpringApplication.run(Ejercicio1Application.class, args);

		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Jugador j = (Jugador)appContext.getBean("jugador1");

//		modelo 1
		Scanner scan = new Scanner(System.in);
		System.out.println("Opciones: \n\t1.- Barcelona \n\t2.- Juvetus");
		int resp = scan.nextInt();
		scan.close();
		switch (resp) 
		{
			case 1:
				j.setEquipo(new Barcelona());
				break;
			case 2:
				j.setEquipo(new Juventus());
				break;
	
			default:
				break;
		}
		System.out.println("saludo:" + j.toString());

//		modelo 2
		Serie serie = (Serie)appContext.getBean("serie");
		System.out.println("serie:" + serie.toString());

//		modelo 3
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
		Libro libro = (Libro)appContext2.getBean("libro");
		System.out.println("serie:" + libro.toString());

		((ConfigurableApplicationContext)appContext).close();
		((ConfigurableApplicationContext)appContext2).close();
	}

}
