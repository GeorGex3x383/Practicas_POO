package com.TextoParaLimpiar.practicanueve;
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
		
		
		for(int i=0; i<arregloTemporal.length;i++) {
			separarFilas[i] = arregloTemporal[i].split(",");
		}
		return separarFilas;
	}
	
}


