package com.MicroProyecto2.limpiartexto;
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaMicroProyecto {

	public static void main(String[] args) {
		//C:\Users\jemil\Downloads\vaccination_tweets_ClasePOOLimpiarFinal.csv
		//C:\Users\jemil\Downloads\textoProyecto.txt
		
		ArrayList<String> listaTexto = new ArrayList<String>();
		ArrayList<String> listaPalabras = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
        System.out.print("Path con nombre del archivo con el texto: ");
		String rutaTexto = input.nextLine();
		
		
		Scanner input2 = new Scanner(System.in);
        System.out.print("Path con nombre del archivo con las palabras a Buscar: ");
		String rutaPalabras = input2.nextLine();
		
		LectorArchivo archivoTexto = new LectorArchivo(rutaTexto);
		LectorArchivo archivoPalabras = new LectorArchivo(rutaPalabras);
		
		listaTexto = archivoTexto.recuperaDeArchivo();
		listaPalabras = archivoPalabras.recuperaDeArchivo();
		
		
		System.out.println("Texto del archivo: "+ listaTexto);
		System.out.println("Palabras del archivo: "+ listaPalabras);
		
		String[] arregloTexto = listaTexto.toArray(new String[1]);
		String[] arregloPalabras = listaPalabras.toArray(new String[1]);
		
		LimpiarTexto LP = new LimpiarTexto();
		
		for(int i=0; i<arregloTexto.length; i++) {
			arregloTexto[i] = LP.limpiarTexto(arregloTexto[i]);
		}
		
		for(int i=0; i<arregloPalabras.length; i++) {
			arregloPalabras[i] = LP.limpiarTexto(arregloPalabras[i]);
		}
		
		int[] arregloContador = new int[arregloPalabras.length];
		for(int i=0; i<arregloPalabras.length; i++) {
			arregloContador[i] = 0;
		}
		
		for(int i=0; i<arregloPalabras.length; i++) {
			for(int j=0; j<arregloTexto.length; j++) {
				//System.out.println("Texto :" + arregloTemporalTexto[i] + " Palabra:" + arregloTemporalPalabras[j]);
				if(arregloTexto[j].contains(arregloPalabras[i])) {
					arregloContador[i] += 1;
					//System.out.println("Texto :" + arregloTemporalTexto[j] + " Palabra:" + arregloTemporalPalabras[i]);
				}
			}
		}
		
		System.out.println("\n");
		for(int j=0; j<arregloPalabras.length; j++) {
			System.out.println("Se encontro la palabra \"" + arregloPalabras[j]+ "\" " + arregloContador[j] + " veces");
		}
		
		input.close();
		input2.close();
	}
	

}

