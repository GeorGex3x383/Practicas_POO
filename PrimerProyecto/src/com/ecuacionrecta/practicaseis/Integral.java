package com.ecuacionrecta.practicaseis;

public class Integral {
	private double limI;
	private double limS;
	private double deltaX;
	private double area;
	private double m;
	private double b;
	private double y=0;
	
	
	public Integral(double limI, double limS, double deltaX, double m, double b) {
		this.deltaX = deltaX;
		this.limI = limI;
		this.limS = limS;
		this.m = m;
		this.b = b;
	}
	

	public double calculaArea() {
		for(double i = limI; i<= limS; i+= deltaX) {
			y =(m*i) + b;
			area = area +(deltaX*y);
		}
		return area;
	}
	
}

