package spring.beans.ejercicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ControladorBean")
public class Controlador {
	@Autowired
	private String operacion;
	private CalculadoraService calculadoraService;
	
	public Controlador() {
		super();
	}

	public void ejecutarOperacion(String operacion) {
        int resultado = calculadoraService.operar(operacion);
        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }

}
