package com.MiniProyecto2.limpiartexto;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivo {
	private String archivoTexto,archivoPalabras;
	
	LectorArchivo(String FilP, String FilT){
		this.archivoPalabras=FilP;
		this.archivoTexto=FilT;
	}
	
	public String quitarPalabras() {
		String texto="";
		
		ArrayList<String> palabras= new ArrayList<String>();
		try {
			Scanner Archivo =new Scanner(new File(this.archivoPalabras));
			while(Archivo.hasNext())
				palabras.add(Archivo.nextLine());
		Archivo.close();	
		}catch (FileNotFoundException e1) {
			e1.toString();
			System.out.println("Archivo no encontrado");
			System.exit(1);
		}
		try {
			Scanner ArchivoT =new Scanner(new File(this.archivoTexto));
			while(ArchivoT.hasNext())
				texto=ArchivoT.nextLine();
		ArchivoT.close();	
		}catch (FileNotFoundException e1) {
			e1.toString();
			System.out.println("Archivo no encontrado");
			System.exit(1);
		}
		//texto=texto.replaceAll("[0-9]", "");
		//texto=texto.replaceAll(",,",",");
		texto=texto.toLowerCase();
		//for(int i=0; i<palabras.size();i++) {
		//	System.out.println("Texto: "+ texto);
		//	System.out.println("Palabra a eliminar: "+ palabras.get(i));
			//texto=texto.replaceAll(palabras.get(i),"");
		//}
		
		return texto;
	}

}