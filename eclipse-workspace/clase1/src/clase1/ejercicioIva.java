package clase1;
import javax.swing.JOptionPane;

public class ejercicioIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*@Drawin Tusarma Taba
		 * ejercicio calcular el iva*/
		JOptionPane.showMessageDialog(null, "Bienvenido vamos a calcular el iva de losproductos");
		boolean producto = false;

		JOptionPane.showMessageDialog(null, "Ingresa el nombre de un producto: " );
		JOptionPane.showInputDialog(null, "Ingrese producto: ");
		if(producto == true) {
			JOptionPane.showMessageDialog(null, "Este producto tiene iva del 19%");
			int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese precio: "));
			JOptionPane.showMessageDialog(null, "El precio mas iva es: " + precio + " " + (precio * 0.19 / 100));
			
			
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Este producto no tiene iva");
			int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese precio: "));
			JOptionPane.showMessageDialog(null, "El precio si iva es: " + precio);
			
		}
		

	}

}
