package clase1;

import javax.swing.JOptionPane;

public class ejercicioBuzon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*@Darwin Tusarma taba
		 * ejercicio buzon de mensaje o sugerencias*/
		JOptionPane.showMessageDialog(null, "Bienvenido al buzon de sugerencias ADSI");
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		String mensaje = JOptionPane.showInputDialog(null, "Ingresa tu mensaje en el buzon");
		JOptionPane.showMessageDialog(null, "Gracias por tu mensaje: " + mensaje);
		
		

	}

}
