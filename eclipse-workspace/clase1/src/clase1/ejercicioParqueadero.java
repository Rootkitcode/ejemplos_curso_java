package clase1;

import java.util.Scanner;

public class ejercicioParqueadero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*@Darwin Tusarma Taba
		 *Elabore una aplicación básica, que calcule el costo que paga un usuario de un parqueadero
         *teniendo en cuenta:
         *Si el parqueadero es privado paga 60000 pesos mensuales si es por horas, cada hora tiene un
         *costo de $500 para moto y $1500 para otro tipo de vehículo. */
		Scanner scanner = new Scanner(System.in);
		
		double precioHora;
		double horas;
		double mensualidad = 60000;
		
		System.out.println("Bienvenidos al parqueadero de ADSI mensualidad es de 60.000 pesos");
		
		System.out.println("ingrese la cantidad de horas: ");
		horas = scanner.nextDouble();
		System.out.println("Ingrese el valor por hora: ");
		precioHora = scanner.nextDouble();
		if (precioHora == 500) {
			System.out.print("Usted esta pagando por una moto y el total es: " + precioHora  *  horas + "/n ó la menusalidad tiene un costo de: " + mensualidad);
		}
		else {
			if (precioHora == 1500) {
				System.out.print("Usted esta pagando por un vehiculo y el costo es de: " + precioHora * horas + "/n ó la menusalidad tiene un costo de: " + mensualidad);
			}
		}
		
		
		
		
		

	}

}
