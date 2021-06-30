package com.regresionlineal.practicasiete;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] valoresx = {20.1,7.1,16.1,14.9,16.7,8.8,9.7,10.3,22,16.2,12.1,10.3,14.5,12.4,9.6,12.2,10.8,14.7,19.7,11.2};
		double[] valoresy = {31.5,18.9,35,31.6,22.6,26.2,14.1,24.7,44.8,23.2,31.4,17.7,18.4,23.4,22.6,16.4,21.4,26.5,31.7,11.9};
		
		
		RegresionLineal r1 = new RegresionLineal (valoresx, valoresy, 0.0 , 0.0 , 0.0, 0.0, 0.0, 0.0);
		
		System.out.print("Ingresa el porcentaje de pobreza: ");
		r1.porcentajePobreza = scan.nextDouble();
	
		r1.promediox();
		r1.promedioy();
		
		System.out.println("La tasa de natalidad para un porcentaje de pobreza de : "+ r1.porcentajePobreza + " es: " + r1.calcularTasaNatalidad());
		
		System.out.println("El modelo de regresion lineal es: y = "+ r1.calcularB1() +"x + "+ r1.calcularB());
		System.out.println("Con un porcentaje de error de : "+ r1.calcularPorcentajeError());

	}

}
