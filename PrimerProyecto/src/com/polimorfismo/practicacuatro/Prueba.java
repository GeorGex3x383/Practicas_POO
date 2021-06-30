package com.polimorfismo.practicacuatro;

public class Prueba {

	public static void main(String[] args) {
		
		Cubo cubo1 = new Cubo ("Cubo", 3);
		System.out.println("El area del " + cubo1.getnombre() + " es: " + cubo1.CalculaArea());
		System.out.println("El volumen del " + cubo1.getnombre() + " es: " + cubo1.CalculaVolumen());
		System.out.println("----------------------------");
		Paralelepipedo para1 = new Paralelepipedo ("Paralelepipedo", 2, 3, 4);
		System.out.println("El area del " + para1.getnombre() + " es: " + para1.CalculaArea());
		System.out.println("El volumen del " + para1.getnombre() + " es: " + para1.CalculaVolumen());
		System.out.println("----------------------------");
		Prisma prisma1 = new Prisma ("Prisma", 3, 5, 2, 5);
		System.out.println("El area del " + prisma1.getnombre() + " es: " + prisma1.CalculaArea());
		System.out.println("El volumen del " + prisma1.getnombre() + " es: " + prisma1.CalculaVolumen());
		System.out.println("----------------------------");
		Cilindro cili1 = new Cilindro ("Cilindro", 5, 7, (float) 3.14);
		System.out.println("El area del " + cili1.getnombre() + " es: " + cili1.CalculaArea());
		System.out.println("El volumen del " + cili1.getnombre() + " es: " + cili1.CalculaVolumen());
		System.out.println("----------------------------");
		Esfera esfera1 = new Esfera ("Esfera", 5, (float) 3.14);
		System.out.println("El area del " + esfera1.getnombre() + " es: " + esfera1.CalcularArea());
		System.out.println("El volumen del " + esfera1.getnombre() + " es: " + esfera1.CalculaVolumen());
		System.out.println("----------------------------");	
	}
}
