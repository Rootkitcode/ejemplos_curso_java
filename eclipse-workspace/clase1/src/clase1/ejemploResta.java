package clase1;
/*@Darwin Tusarma
 * taller practico java
 * Ejercicio 1 del taller
 * instructor Arle*/
import java.util.Scanner;

public class ejemploResta {
	public static void main(String[]args) {
	Scanner reader = new Scanner(System.in);
	System.out.println("Ingrese el primer valor: ");
	int num1 = reader.nextInt();
	System.out.println("ingresa el segundo valor: ");
	int num2 = reader.nextInt();
	
	Object resultado = num1 - num2;
	
	System.out.println("El resultado de la resta es: " + num1 + " - " + num2 + " = " + resultado);
	
	
}
}
