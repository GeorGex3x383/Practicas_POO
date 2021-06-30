package com.particulas.practicacinco;

public class Micro extends Particulas {
	private double c;
	
	public Micro(double m, double p, double c) {
		super(m,p);
		this.c = c;
	}
	
	public double calculaEnegia() {
		return (((Math.cos(m))*(4/3)*(Math.pow(p, 2)))*c);
	}

}
