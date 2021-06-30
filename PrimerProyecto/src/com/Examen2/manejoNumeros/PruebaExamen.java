package com.Examen2.manejoNumeros;

import java.util.ArrayList;

public class PruebaExamen {

	public static void main(String[] args) {
		//C:\Users\jemil\Downloads\vaccination_tweets_ClasePOOLimpiarFinal (1).csv
		
		//Se usa este arraylist para leer el archivo
		ArrayList<String> listaExamen = new ArrayList<String>();
		
		//Se declara la clase del lector archivo
		LectorArchivoExamen archivoExamen = new LectorArchivoExamen(); 
		
		//Se manda a guardar el archivo en este Array
		listaExamen = archivoExamen.recuperaDeArchivo();
		System.out.println("Texto del Examen: "+ listaExamen);
		
		//Se crea el arraylist en el que se guardaran los numeros
		String[] Jorge = listaExamen.toArray(new String[1]);
		
		//Se llama la clase que separa los numeros
		SepararNumeros SN = new SepararNumeros();
		
		for(int i=0; i<Jorge.length; i++) {
			Jorge[i] = SN.separarNumeros(Jorge[i]);
		}
		
		System.out.println("--------------------------------");
		System.out.println("El array a manipular es: ");
		int k = 1;
		for(int j=0; j<Jorge.length; j++) {
			if(Jorge[j]!="")
			System.out.println("Numeros: " + Jorge[j] + " en la linea: " + k);
			k++;
		}
		System.out.println("Tamaño del arraylist a manipular es: " + Jorge.length);
		
		//Se crea el arraylist en el que se guardaran los numeros
		int[] Garcia = new int[Jorge.length];
		
		//Se filtran los numeros con el rango deseado
		System.out.println("--------------------------------");
		System.out.println("El array ya filtrado: ");
		//Esta es la clase que filtra los numeros
		FiltrarNumeros FN = new FiltrarNumeros();
		for(int i=0; i<Garcia.length; i++) {
			if(Jorge[i]!="")
			Garcia[i] = Garcia[i] + FN.filtrarNumero(Jorge[i]);
			if(Garcia[i] != 0)
			System.out.println(Garcia[i]);
		}
		System.out.println("Tamaño del arraylist a manipular es: " + Garcia.length);
		
		//Con esta variable llevamos la suma de los numeros filtrados
		int sumaNum = 0;
		//Con esta variable aseguramos el tamaño correcto para el promedio
		int tam = 0;
		
		//Con este for realizamos la suma de los numeros filtrados
		for(int l=0; l<Garcia.length; l++) {
			if(Garcia[l] != 0) {
				Garcia[l] = Garcia[l];
				sumaNum = sumaNum + Garcia[l];
				tam++;
			}
		}
		
		//Se imprime en pantalla el promedio
		System.out.println("--------------------------------");
		System.out.println("La suma total es de: " + sumaNum);
		System.out.println("El promedio es de: " + sumaNum/tam);
		
		
	}
	
	
	

}
