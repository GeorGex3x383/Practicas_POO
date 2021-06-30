package com.Examen2.manejoNumeros;

import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Con esta clase se lee el archivo que contiene los tweets
public class LectorArchivoExamen {
	
	String rutaArchivo;
	ArrayList<String> listaDatos = new ArrayList<String>();
	
	
	public ArrayList<String> recuperaDeArchivo() {
		try {
			//En esta linea se lee el archivo
			Scanner Archivo = new Scanner(new File("C:\\Users\\jemil\\Downloads\\vaccination_tweets_ClasePOOLimpiarFinal (1).csv"),"UTF-8");
			
			//En este while se añaden celda por celda al Arraylist
			while (Archivo.hasNext()) {
				listaDatos.add(Archivo.nextLine());
			}
			Archivo.close();
		} catch (FileNotFoundException ex) {
			ex.toString();
			System.out.println("No se encontró el archivo");
			System.exit(0);
		}
		return listaDatos;
	}
}
