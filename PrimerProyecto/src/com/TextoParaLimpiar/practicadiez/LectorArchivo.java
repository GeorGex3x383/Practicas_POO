package com.TextoParaLimpiar.practicadiez;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivo {
	
	String rutaArchivo;
	ArrayList<String> listaDatos = new ArrayList<String>();
	
	public LectorArchivo(String rutaArchivo){
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
	
}



