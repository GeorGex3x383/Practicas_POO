package com.TextoParaLimpiar.practicadiez;

public class LimpiarTexto {
	private String nuevoTexto;

	public LimpiarTexto(String nuevoTexto){
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
		while(nuevoTexto.contains("  ")) {
			nuevoTexto = nuevoTexto.replace("  ", " ");
		}
		return nuevoTexto;
	}
}
