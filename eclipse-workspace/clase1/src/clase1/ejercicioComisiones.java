package clase1; // declarar los paquetes 

import java.util.Scanner; //declaramos la importacion

public class ejercicioComisiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*@Darwin Tusarma Taba
		 * ejercicio calcular comision de un salario base
		 * instructor Arle*/
		
		Scanner scanner = new Scanner (System.in);
		
	    double salarioBase;
	    double comision;
	    double salarioTotal;
	    // constructores
	    //metodos
	    //fin de la clase
	    // Solicitud de datos al usuario
	    System.out.println("Este programa calcula el salario del trabajador contando salario y comisiones.");
	    System.out.print("Indica el salario base: ");
	      salarioBase = scanner.nextDouble();
	    // Realizamos Cálculos 
	    comision = 0.10 * (salarioBase);
	    salarioTotal = salarioBase + comision;
	    // Mostramos en pantalla
	    System.out.println("El sueldo total a recibir es "+salarioTotal + ". \nEquivalente al salario base: "+salarioBase + " y comisiones: "+comision);
	    
	  }
	}
