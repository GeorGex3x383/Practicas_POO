package com.Examen2.manejoNumeros;

//Con esta clase separamos todos los numeros del archivo base
public class SepararNumeros {
	
	public String separarNumeros(String Jorge){
		
		//Con estos parametros limpiamos el archivo para que solo queden los numeros
		Jorge = Jorge.replaceAll("[a-z]", "");
		Jorge = Jorge.replaceAll("[A-Z]", "");
		Jorge = Jorge.replaceAll("\t", "");
		Jorge = Jorge.replaceAll("[^\\w\\s]", "");
		Jorge = Jorge.replaceAll("_", "");
		while(Jorge.contains(" ")) {
			Jorge = Jorge.replace(" ", "");
		}
		
		return Jorge;
	}
}