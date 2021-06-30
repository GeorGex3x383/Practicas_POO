package com.particulas.practicacinco;

public class Prueba {
	public static double total;

	public static void main(String[] args) {
		
		Nano nano1 = new Nano (2, 6, 7, 3.1416);
		System.out.println("El valor de la particula Nano es: " + nano1.calculaEnegia());
		Micro micro1 = new Micro (9, 3, 6);
		System.out.println("El valor de la particula Micro es: " + micro1.calculaEnegia());
		Kilo kilo1 = new Kilo (5, 7, 2, 3.1416);
		System.out.println("El valor de la particula Kilo es: " + kilo1.calculaEnegia());
		Tera tera1 = new Tera(4, 5, 8);
		System.out.println("El valor de la particula Tera es: " + tera1.calculaEnegia());
		total = nano1.calculaEnegia() + micro1.calculaEnegia() + kilo1.calculaEnegia() + tera1.calculaEnegia();
		System.out.println("La enegia total de todas las particulas es igual a: " + total);
	}

}
