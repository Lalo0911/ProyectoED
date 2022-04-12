package co.edu.unbosque.controller;
import co.edu.unbosque.model.ListaMatriz;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View vista;
	private ListaMatriz listaMatriz;
	
	public Controller() {
		
		vista = new View();
		
		vista.mostrarDato(""+InicializarLista(Integer.valueOf(vista.obtenerDato("Tma�o de la matriz")),vista.obtenerDato("Matriz")));
		vista.mostrarDato(listaMatriz.mostrarMatriz());
		
	}
	
	public boolean InicializarLista(int tama�o,String matriz) {
		listaMatriz = new ListaMatriz();
		return listaMatriz.rellenarMatriz(tama�o, matriz);
	}

}
