package com.TextoParaLimpiar.practicanueve;

public class PruebaTexto {

	public static void main(String[] args) {
		
		String TextoParaLimpiar = "La clase String tiene\t métodos para*manipulación de cadenas,\n";
		TextoParaLimpiar += " sin embargo se+pueden implemen7tar métodos para tare4as específicas.\n";
		TextoParaLimpiar += "Se muestran eje34mplos? de adecuación\t de datos en la materia POO\n";
		TextoParaLimpiar += "Saludos a todos los estudia456ntes.\n";
		
		LimpiarTexto textoLimpio = new LimpiarTexto(TextoParaLimpiar);
		
		System.out.println( textoLimpio.limpiarTexto() );

	}

}
