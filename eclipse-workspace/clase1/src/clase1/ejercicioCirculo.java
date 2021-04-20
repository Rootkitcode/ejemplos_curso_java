package clase1;

import java.util.Scanner;

public class ejercicioCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* @Darwin Tusarma Taba 
		 * ejercicio hallar el area de un circulo*/
		java.util.Scanner valor = new java.util.Scanner(System.in);
		double radio, area;
		System.out.print("Ingrese el radio del circulo: ");
		radio = valor.nextInt();
		area = 3.14 * (radio * radio);
		System.out.printf("El area del circulo es: %f", area);
		valor.close();
		
	}
	}