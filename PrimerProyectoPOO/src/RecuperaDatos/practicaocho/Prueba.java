package com.RecuperaDatos.practicaocho;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.regresionlineal.practicasiete.RegresionLineal;

//C:/Users/jemil/Desktop/EjemploArchivoCSV2.csv

//C:/Users/jemil/Desktop/DatosNatalidadAlumnos.csv
//C:/Users/jemil/Desktop/DatosNatalidadAlumnos2.csv

public class Prueba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> listaDatos = new ArrayList<String>();
		String[] listax = listaDatos.toArray(new String[1]);
		String[] listay = listaDatos.toArray(new String[1]);
		double numero1 = 0;
		
		System.out.print("Ingresa la ruta del archivo de datos: ");
		String rutaArchivo = scan.nextLine();
		
		RecuperaDatos delArchivo = new RecuperaDatos(rutaArchivo);
		listaDatos = delArchivo.recuperaDeArchivo();
		
		String[][] arreglo = delArchivo.guardarDatos();
		
		listax = delArchivo.obtenerColumnasN(listaDatos, 0);
		listay = delArchivo.obtenerColumnasN(listaDatos, 1);
		
		System.out.println("ValoresX\tValoresY");
		for(int x=0; x<listax.length; x++)
			System.out.println(listax[x]+"\t\t "+listay[x]);
		
		double[] valoresx = Arrays.stream(listax).mapToDouble(Double::parseDouble).toArray();
		double[] valoresy = Arrays.stream(listay).mapToDouble(Double::parseDouble).toArray();
		
		//RegresionLineal r1 = new RegresionLineal (valoresx, valoresy, 0.0 , 0.0 , 0.0, 0.0, 0.0, 0.0);
		
		//r1.promediox();
		//r1.promedioy();
		OrdenadayPendiente dato1 = new  OrdenadayPendiente(valoresx,valoresy,numero1);
		
		//System.out.println("El modelo de regresion lineal es: y = "+ r1.calcularB1() +"x + "+ r1.calcularB());
		System.out.println("El modelo de regesion lineal es: "+ dato1.hacerPendiente()+ "x + "+ dato1.hacerOrdenada());
		
		System.out.println("Escriba la x que quiere encontrar:  ");
		numero1= scan.nextDouble();
		
		System.out.println("La taza de natalidad del dato "+ dato1.getPobrezaP()+" es: "+dato1.tazaNat());
		System.out.println("El porcentaje de error es de : "+ dato1.porcentajeError());

	}

}
