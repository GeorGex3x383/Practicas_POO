package com.TextoParaLimpiar.practicanueve;

public class LimpiarPalabras {
	
	private String nuevoTexto;

	public LimpiarPalabras(String nuevoTexto){
		this.nuevoTexto = nuevoTexto;
	}
	
	public String limpiarTexto(){
		nuevoTexto = nuevoTexto.replaceAll("�", "a");
		nuevoTexto = nuevoTexto.replaceAll("�", "e");
		nuevoTexto = nuevoTexto.replaceAll("�", "i");
		nuevoTexto = nuevoTexto.replaceAll("�", "o");
		nuevoTexto = nuevoTexto.replaceAll("�", "u");
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
