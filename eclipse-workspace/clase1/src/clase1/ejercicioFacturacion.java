package clase1;

import javax.swing.JOptionPane;

public class ejercicioFacturacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*@Darwin Tusarma 
		 * ejercicio calcular precio hamburguesa*/
		JOptionPane.showMessageDialog(null, "Escoja que tipo de Hamburguesa quiere: [1]-doble carne, [2]-mixta, [3]-sencilla");
		int tipoHamburguesa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la hamburguesa que deseas: "));
		if(tipoHamburguesa == 1) {
			JOptionPane.showMessageDialog(null, "El precio de la doble carne es de: $15.000 pesos");
			
		}
		
		else {
			if(tipoHamburguesa == 2) {
			JOptionPane.showMessageDialog(null, "El precio de la Hamburguesa mixta es de:  $ 22.000 pesos");
			
		}
		else {
			if(tipoHamburguesa == 3) {
			JOptionPane.showMessageDialog(null, "El precio de la Hamburguesa sencilla es: $9.000 pesos");
			}
			else {
				if(tipoHamburguesa > 3);
				JOptionPane.showMessageDialog(null, "El producto seleccionado no existe");
			}
		}

	}

}
}
