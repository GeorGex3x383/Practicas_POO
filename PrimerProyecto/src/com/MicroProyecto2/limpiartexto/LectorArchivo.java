package com.MicroProyecto2.limpiartexto;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivo {
	
	String rutaArchivo;
	ArrayList<String> listaDatos = new ArrayList<String>();
	
	LectorArchivo(String rutaArchivo){
		this.rutaArchivo = rutaArchivo;
	}
	
	public ArrayList<String> recuperaDeArchivo() {
		try {
			Scanner Archivo = new Scanner(new File(rutaArchivo),"UTF-8");
			
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