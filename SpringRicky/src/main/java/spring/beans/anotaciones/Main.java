package spring.beans.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Antes del objeto");
        ServicioSaludo saludo = (ServicioSaludo)context.getBean("saludoservice");
        // ServicioSaludo saludo = context.getBean(ServicioSaludo.class);
        saludo.saludar();
    }
}