package clase1;

public class ejercicioNumeroMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@Darwin Tusarma Taba
		//Vamos a identificar cual es el numero mayor entre 3 valores
		int num1 = 2, num2 = 4, num3 = 3;
		System.out.println("Vamos a comparar cual de los 3 numeros es mayor: " + num1 + "," + num2 + "," + num3);
		if(num1 > num2 && num1 > num3) {
		System.out.println("El numero 1 es mayor que el numero 2 y que numero 3" + num1 + "," + num2 + "," + num3);
		} else {
			if(num2 > num1 && num2 > num3) {
				System.out.println("El numero 2 es mayor que el numero 1 y el numero 3" + num1 + "," + num2 + "," + num3);
				} else {
				if(num3 > num2 && num3 > num1) {
					System.out.println("El numero 3 es mayor que el numero 1 y el numero 2" + num1 + "," + num2 + "," + num3);
			}
		}
		}
	}
}
		

	


