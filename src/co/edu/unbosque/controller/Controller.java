package co.edu.unbosque.controller;
import co.edu.unbosque.model.ListaMatriz;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View vista;
	private ListaMatriz listaMatriz;
	
	public Controller() {
		
		vista = new View();
		
		vista.mostrarDato(""+InicializarLista(Integer.valueOf(vista.obtenerDato("Tmaño de la matriz")),vista.obtenerDato("Matriz")));
		vista.mostrarDato(listaMatriz.mostrarMatriz());
		
	}
	
	public boolean InicializarLista(int tamaño,String matriz) {
		listaMatriz = new ListaMatriz();
		return listaMatriz.rellenarMatriz(tamaño, matriz);
	}

}
