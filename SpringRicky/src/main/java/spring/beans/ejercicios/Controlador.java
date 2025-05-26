package spring.beans.ejercicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("controlador1")
public class Controlador {

	private String operacion;
	@Autowired
	private CalculadoraService calculadora;
	
	public Controlador() {
		super();
	}

	public Controlador(String operacion) {
		super();
		this.operacion = operacion;
		
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public CalculadoraService getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(CalculadoraService calculadora) {
		this.calculadora = calculadora;
	}
	
	public void ejecutaOperacion(String operacion) {
		calculadora.operar(operacion);
	}



}
