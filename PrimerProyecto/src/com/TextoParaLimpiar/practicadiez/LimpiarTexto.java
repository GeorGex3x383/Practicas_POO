package com.TextoParaLimpiar.practicadiez;

public class LimpiarTexto {
	private String nuevoTexto;

	public LimpiarTexto(String nuevoTexto){
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
		while(nuevoTexto.contains("  ")) {
			nuevoTexto = nuevoTexto.replace("  ", " ");
		}
		return nuevoTexto;
	}
}
