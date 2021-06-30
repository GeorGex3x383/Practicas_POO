package com.encapsulamiento.practicados;

public class PruebaPerro {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		Perro perro2 = new Perro();
		
		perro1.setNombre("Firulais");
		perro1.setAltura((float)30.5);
		perro1.setRaza("Golden Retriever");
		System.out.print("El nombre del perro1 es: ");
		System.out.println(perro1.getNombre());
		System.out.print("Altura del perro1 es: ");
		System.out.println(perro1.getAltura());
		System.out.print("La raza del perro1 es: ");
		System.out.println(perro1.getRaza());
		perro1.ladrido();
		
		System.out.println("----------------");
		perro2.setNombre("Congo");
		perro2.setAltura((float)60.7);
		perro2.setRaza("Pug");
		System.out.print("El nombre del perro2 es: ");
		System.out.println(perro2.getNombre());
		System.out.print("Altura del perro2 es: ");
		System.out.println(perro2.getAltura());
		System.out.print("La raza del perro2 es: ");
		System.out.println(perro2.getRaza());
		perro2.ladrido();

	}

}


