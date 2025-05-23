package spring.beans.ejercicios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.beans.autowired.Person;


	@Configuration
	@ComponentScan(basePackages = "spring.beans.ejercicios")
	public class AppConfig {
		
//		@Bean(name = "CustomerBean")
//	    public ServicioSaludo saludo() {
//	        return new ServicioSaludo();
//	    }
		
		@Bean(name = "NumeroBean")
	    public Numeros numeros() {
	        return new Numeros(250,25);
	    }

//	    @Bean(name = "PersonBean1")
//	    public Person persona1() {
//	        return new Person("Marta",46);
//	    }

}
