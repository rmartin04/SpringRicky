package spring.beans.ejercicios;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Numeros {
	//@Value("250")
	private int numero1;
	//@Value("25")
	private int numero2;

	public Numeros() {
		super();
		
	}

	public Numeros(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Numeros [numero1=");
		builder.append(numero1);
		builder.append(", numero2=");
		builder.append(numero2);
		builder.append("]");
		return builder.toString();
	}
	

}
