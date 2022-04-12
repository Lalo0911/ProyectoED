package co.edu.unbosque.model;

public class ListaMatriz {
	
	private String matrizNumeros[][];
	
	public boolean rellenarMatriz(int numero,String contenido) {
		
		String lista[]=contenido.split(" ");
		matrizNumeros = new String[numero][numero];
		
		if(lista.length!=matrizNumeros.length*numero) {
			return false;
		}
		
		int contador=0;
		
		for(int x=0;x<numero;x++) {
			for(int i=0;i<numero;i++) {
				matrizNumeros[x][i] = lista[contador];
				contador++;
			}
		}
		return true;
	}
	
	public String mostrarMatriz() {
		String mensaje="";
		for(int x=0;x<matrizNumeros.length;x++) {
			mensaje+="\n";
			for(int i=0;i<matrizNumeros.length;i++) {
				mensaje+= matrizNumeros[x][i];
			}
		}
		return mensaje;
	}

	public String[][] getMatrizNumeros() {
		return matrizNumeros;	
	}

	public void setMatrizNumeros(String[][] matrizNumeros) {
		this.matrizNumeros = matrizNumeros;
	}
	
}
