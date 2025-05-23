package spring.beans.anotaciones;

import org.springframework.stereotype.Component;

@Component("saludo")
public class ServicioSaludo {
    public void saludar() {
        System.out.println("¡Hola desde un bean de Spring!");
    }
}