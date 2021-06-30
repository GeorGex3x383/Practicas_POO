package com.encapsulamiento.practicados;

public class Perro {
	private float altura;
	private String nombre;
	private String raza;
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		if(altura<55) {
			this.altura = altura;
		}else {
			this.altura = -1;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza (String raza) {
		this.raza = raza;
	}
	
	void ladrido() {
		System.out.println("Guau Guau");
	}
}
