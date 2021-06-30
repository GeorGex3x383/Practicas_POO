package com.polimorfismo.practicacuatro;

public class Paralelepipedo extends FiguraGeometrica{
	
	private float a,b,c;
	
	public Paralelepipedo (String nombre, float a, float b, float c) {
		super(nombre);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public float CalculaArea() {
		return (2*(a*b+a*c+b*c));
	}
	
	public float CalculaVolumen() {
		return(a*b*c);
	}

}
