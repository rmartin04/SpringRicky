package spring.beans.ejercicios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainNumeros {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	   Controlador contexto = context.getBean("controlador1", Controlador.class);
	   Numeros nums = context.getBean(Numeros.class);
	   nums.setNumero1((int) (Math.random() * 100));
	   nums.setNumero2((int) (Math.random() * 100));
	   contexto.ejecutaOperacion("division");
	   
	    
	}
}
