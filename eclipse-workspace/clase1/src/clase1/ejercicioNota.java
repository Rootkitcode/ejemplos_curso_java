package clase1;

import java.util.Scanner;

public class ejercicioNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*@Darwin Tusarma Taba
		 * ejercicio calcular nota de un alumno
		 * instructor Arle*/
		Scanner scanner = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double promedio;
		double notaDefinitiva;
		boolean matriculado = false;
		System.out.println("Este programa va a calcular la nota de un alumno de Adsi");
		if (matriculado == true) {
		//Solicitamos las notas del alumno
		System.out.print("Ingrese la primera nota: ");
		nota1 = scanner.nextDouble();
		System.out.print("Ingrese la segunda nota: ");
		nota2 = scanner.nextDouble();
		System.out.print("Ingrese la Tercera nota: ");
		nota3 = scanner.nextDouble();
		System.out.print("Ingrese la cuarta nota: ");
		nota4 = scanner.nextDouble();
		promedio = nota1 + nota2 + nota3 + nota4;
		System.out.print("El promedio de las notas es: " + promedio+"\n");
		notaDefinitiva = promedio /4;
		System.out.print("La definitiva es: " + notaDefinitiva);
		}else {
			System.out.print("El alumno debe de estar matriculado para generarle una nota");
		}
	

	}

}

