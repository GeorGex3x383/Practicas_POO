package com.ecuacionrecta.practicaseis;

public class DatosRecta {
	public double x1;
	public double x2;
	public double y1;
	public double y2;
	public double m;
	public double b;
	
	public DatosRecta(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public double getx1(){
		return x1;
	}
	
	public double getx2(){
		return x2;
	}
	
	public double getm() {
		return m;
	}
	
	public double getb() {
		return b;
	}
	
	public double calculaPendiente() throws Exception{
		if((x2-x1)==0) {
			throw new ArithmeticException("Error calculaPendiente");
		}else {
		m = ((y2-y1)/(x2-x1));
		}
		return m;
	}
	
	public double calculaOrdenada() {
		b = y1 - (m*x1);
		return b;
	}

}
