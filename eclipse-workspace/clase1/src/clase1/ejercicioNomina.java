package clase1;

import java.util.Scanner;

public class ejercicioNomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*@Darwin Tusarma Taba
		 * Ejercicio calcular la nomina de un empleado*/
		Scanner scanner = new Scanner(System.in);
		double nominaNeta;
		double bonificacion;
		double descuentoSeguridad = 12.5;
		double seguroFunerario = 35000;
		double resultado;
		double totalDescuentos;
		double totalPagar;
		
		System.out.println("Bienvenidos al sistema de nomina de ADSI");
		System.out.println("Por favor ingrese el salario del empleado: ");
		nominaNeta = scanner.nextDouble();
		System.out.println("Por favor ingrese valor de bonificacion: ");
		bonificacion = scanner.nextDouble();
		resultado = nominaNeta + bonificacion;
		totalDescuentos = (descuentoSeguridad * nominaNeta) /100;
		totalPagar = nominaNeta - totalDescuentos - seguroFunerario;
		System.out.print("El valor de su nomina sin descuentos es:\n " + resultado);
		System.out.println(" \nTotal nomina pagar con descuentos es:\n " + totalPagar);
		System.out.println(" \nTotal descuentos de parafiscales es:\n " + totalDescuentos + "descuento de seguro funerario es: " + seguroFunerario );
		
		

	}

}
