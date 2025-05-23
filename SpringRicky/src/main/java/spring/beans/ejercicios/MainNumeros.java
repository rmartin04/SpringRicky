package spring.beans.ejercicios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.beans.autowired.AppConfig;

public class MainNumeros {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	
		Controlador controlador = (Controlador) context.getBean("ControladorBean");
		controlador.ejecutarOperacion("suma");
	
		
		
	}

}
