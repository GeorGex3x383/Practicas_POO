package com.RecuperaDatos.practicaocho;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecuperaDatos {
	String rutaArchivo;
	ArrayList<String> listaDatos = new ArrayList<String>();
	
	RecuperaDatos(String rutaArchivo){
		this.rutaArchivo = rutaArchivo;
	}
	
	public ArrayList<String> recuperaDeArchivo() {
		try {
			Scanner ArchivoCVS = new Scanner(new File(rutaArchivo));
			
			while (ArchivoCVS.hasNext()) {
				listaDatos.add(ArchivoCVS.nextLine());
			}
			ArchivoCVS.close();
		} catch (FileNotFoundException ex) {
			ex.toString();
			System.out.println("No se encontró el archivo");
		}
		return listaDatos;
	}
	
	public String[][] guardarDatos() {
		String[] arregloTemporal = listaDatos.toArray(new String[1]);
		String [][] separarFilas = new String[arregloTemporal.length][];
		
		//System.out.println("Se imprime el contenido del arreglo");
		//for(int i=0; i<arregloTemporal.length; i++) {
		//	System.out.println(arregloTemporal[i]);
		//}
		
		for(int i=0; i<arregloTemporal.length;i++) {
			separarFilas[i] = arregloTemporal[i].split(",");
		}
		//System.out.println("\nImprimir el contenido de separarFilas[][]");
		
		//for(int x=0; x<separarFilas.length; x++) {
		//	for(int y=0; y<separarFilas[x].length; y++) {
		//		System.out.println(separarFilas[x][y]);
		//	}
		//	System.out.println("---");
		//}
		return separarFilas;
	}

	public String[] obtenerColumnasN(ArrayList<String> listaDatos2, int numColumnas) {
		// TODO Auto-generated method stub
		String[] arregloTemporal = listaDatos2.toArray(new String[1]);
		String [][] separarFilas = guardarDatos();
		String[] lista = listaDatos.toArray(new String[1]);
		
		//System.out.println("\nImprimir el contenido de lista x");
		for(int x=0; x<arregloTemporal.length; x++) {
			lista[x] = separarFilas[x][numColumnas];
			//System.out.println(lista[x]);
		}
		return lista;
	}
	
	
}
