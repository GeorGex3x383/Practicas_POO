package com.polimorfismo.practicacuatro;

public class Prisma extends FiguraGeometrica {
	
	private float AB, AH, b, h, l, AP;
	
	public Prisma(String nombre, float b, float h, float l, float AP) {
		super(nombre);
		this.b = b;
		this.h = h;
		this.l = l;
		this.AP = AP;
	}
	public float CalculaArea() {
		AB= ((5*l*AP)/2);
		AH = (b*h);
		return ((2*AB)+AH);
	}
	public float CalculaVolumen() {
		return (AB*h);
	}
	
	

}
