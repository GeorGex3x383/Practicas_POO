package com.TextoParaLimpiar.practicanueve;

public class PruebaTexto {

	public static void main(String[] args) {
		
		String TextoParaLimpiar = "La clase String tiene\t m�todos para*manipulaci�n de cadenas,\n";
		TextoParaLimpiar += " sin embargo se+pueden implemen7tar m�todos para tare4as espec�ficas.\n";
		TextoParaLimpiar += "Se muestran eje34mplos? de adecuaci�n\t de datos en la materia POO\n";
		TextoParaLimpiar += "Saludos a todos los estudia456ntes.\n";
		
		LimpiarTexto textoLimpio = new LimpiarTexto(TextoParaLimpiar);
		
		System.out.println( textoLimpio.limpiarTexto() );

	}

}
