package cl.caelchro.spring;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cl.caelchro.beans.Barcelona;
import cl.caelchro.beans.Jugador;
import cl.caelchro.beans.Juventus;

@SpringBootApplication
public class Ejercicio1Application 
{
	public static void main(String[] args)
	{
		//SpringApplication.run(Ejercicio1Application.class, args);

		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		Jugador j = (Jugador)appContext.getBean("jugador1");

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
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
