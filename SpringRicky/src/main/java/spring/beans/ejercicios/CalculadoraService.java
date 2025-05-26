package spring.beans.ejercicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
	@Autowired
	private Numeros numeros;

	public CalculadoraService() {
		super();
	}

	public CalculadoraService(Numeros numeros) {
		super();
		this.numeros = numeros;
	}

	public Numeros getNumeros() {
		return numeros;
	}

	public void setNumeros(Numeros numeros) {
		this.numeros = numeros;
	}

	public void operar(String operacion) {
		int resultado = 0;
		switch (operacion) {
		case "suma":
			resultado = numeros.getNumero1() + numeros.getNumero2();
			break;
		case "resta":
			resultado = numeros.getNumero1() - numeros.getNumero2();
			break;
		case "multiplicacion":
			resultado = numeros.getNumero1() * numeros.getNumero2();
			break;
		case "division":
			if (numeros.getNumero2() != 0) {
				resultado = numeros.getNumero1() / numeros.getNumero2();
			} else {
				System.out.println("No se puede dividir por cero");
				
			}
			break;
		default:
			System.out.println("Operación no válida");
			break;
			
		}
		
		System.out.println("El resultado de la " + operacion + " entre "+numeros.getNumero1()+" y "
		+ numeros.getNumero2()+ " es: " + resultado);
		
		
		
		
	}

}
