package modelo;

import java.util.ArrayList;

//En esta clase se tiene el constructor y los getters de los datos que se mandan a graficar
public class DatosGrafica {
	
	ArrayList<String> listaArchivo = new ArrayList<String>();
	String[] arregloArchivo = listaArchivo.toArray(new String[1]);
	
	ArrayList<String> listaPalabras = new ArrayList<String>();
	String[] arregloPalabras = listaPalabras.toArray(new String[1]);
	
	int[] arregloContador = new int[arregloPalabras.length];
	
	public ArrayList<String> getListaArchivo() {
		return listaArchivo;
	}
	
	public ArrayList<String> getListaPalabras() {
		return listaPalabras;
	}
	
	public String[] getArregloArchivo() {
		return arregloArchivo;
	}
	
	public String[] getArregloPalabras() {
		return arregloPalabras;
	}
	
	public int[] getArregloContador() {
		return arregloContador;
	}
	
	public DatosGrafica(ArrayList<String> listaArchivo, ArrayList<String> listaPalabras, String[] arregloArchivo, String[] arregloPalabras, int[] arregloContador) {
		this.listaArchivo = listaArchivo;
		this.listaPalabras = listaPalabras;
		this.arregloArchivo = arregloArchivo;
		this.arregloPalabras = arregloPalabras;
		this.arregloContador = arregloContador;
	}
	
	public static ArrayList<DatosGrafica> agregarDatos(ArrayList<String> listaArchivo, ArrayList<String> listaPalabras, String[] arregloArchivo, String[] arregloPalabras, int[] arregloContador){
		ArrayList<DatosGrafica> ArListGrafica = new ArrayList<DatosGrafica>();
		ArListGrafica.add(new DatosGrafica(listaArchivo, listaPalabras, arregloArchivo, arregloPalabras, arregloContador));
		return ArListGrafica;
	}

}
