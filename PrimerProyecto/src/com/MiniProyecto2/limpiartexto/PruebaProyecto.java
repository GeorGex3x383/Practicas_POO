package com.MiniProyecto2.limpiartexto;

import java.util.Scanner;

import com.LimpiandoTexto.practicadiez.Archivo;

public class PruebaProyecto {

	public static void main(String[] args) {
		//String Fpalabras="C:\\Users\\jemil\\Downloads\\palbrasElimina.txt";
		//String Ftexto="C:\\Users\\jemil\\Downloads\\textoPrueba.txt";
		//C:\Users\jemil\Downloads\vaccination_tweets_ClasePOOLimpiarFinal.csv
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        System.out.print("Path y nombre del archivo con el texto: ");
		String rutaTexto = input.nextLine();
		
		@SuppressWarnings({ "resource" })
		Scanner input2 = new Scanner(System.in);
        System.out.print("Path y nombre del archivo con las palabras a Eliminar: ");
		String rutaPalabra = input2.nextLine();

		Archivo ar=new Archivo(rutaPalabra,rutaTexto);
		
		String texto=ar.quitarPalabras();
		
		//System.out.println("Texto con palabras eliminadas: "+texto);
		
		
	}

}