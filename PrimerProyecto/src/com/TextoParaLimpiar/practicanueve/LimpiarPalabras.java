package com.TextoParaLimpiar.practicanueve;

public class LimpiarPalabras {
	
	private String nuevoTexto;

	public LimpiarPalabras(String nuevoTexto){
		this.nuevoTexto = nuevoTexto;
	}
	
	public String limpiarTexto(){
		nuevoTexto = nuevoTexto.replaceAll("á", "a");
		nuevoTexto = nuevoTexto.replaceAll("é", "e");
		nuevoTexto = nuevoTexto.replaceAll("í", "i");
		nuevoTexto = nuevoTexto.replaceAll("ó", "o");
		nuevoTexto = nuevoTexto.replaceAll("ú", "u");
		nuevoTexto = nuevoTexto.replaceAll("\\d", "");
		nuevoTexto = nuevoTexto.replaceAll("\t", " ");
		nuevoTexto = nuevoTexto.toLowerCase();
		nuevoTexto = nuevoTexto.replaceAll("[^\\w\\s]", " ");
		nuevoTexto = nuevoTexto.trim();
		while(nuevoTexto.contains("  ")) {
			nuevoTexto = nuevoTexto.replace("  ", " ");
		}
		return nuevoTexto;
	}


}
