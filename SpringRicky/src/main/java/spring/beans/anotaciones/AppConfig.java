package spring.beans.anotaciones;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring.beans")
public class AppConfig {
	
}
