package co.edu.unbosque.view;
import javax.swing.JOptionPane;

public class View {

	public void mostrarDato(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public String obtenerDato(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}

}
