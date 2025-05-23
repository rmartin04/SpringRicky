package spring.beans.anotaciones;

import org.springframework.stereotype.Service;

//@Component("saludo")
//@Scope(scopeName = "prototype")
@Service("saludoservice")
public class ServicioSaludo {
	
	
	
    public ServicioSaludo() {
		super();
		System.out.println("Creando el objeto");
	}

	public void saludar() {
        System.out.println("¡Hola desde un bean de Spring!");
    }
}