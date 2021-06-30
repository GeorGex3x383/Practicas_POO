package com.particulas.practicacinco;

public class Tera extends Particulas {
	public double a;
	
	public Tera(double m, double p, double a) {
		super(m,p);
		this.a = a;
	}
	
	public double calculaEnegia() {
		return ((Math.tan((Math.pow(a, 6)*m)))*(Math.sqrt(p/4)));
	}

}
