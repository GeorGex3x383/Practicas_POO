package com.RecuperaDatos.practicaocho;

public class OrdenadayPendiente extends RegresionLineal2{
	private double pobrezaP;
	
	OrdenadayPendiente(double[] valx, double[] valy,double pobrezaP){
		
		super(valx,valy);
		this.pobrezaP=pobrezaP;
	}
	
	public double getPobrezaP() {
		return pobrezaP;
	}
	

	public double hacerPendiente() {
		
		return hacerCovarianza()/hacerVarianza();
	}
	
	public double hacerOrdenada() {
		
		return (promedioy()-(hacerPendiente()*promediox()));
	}
	
	
	public double tazaNat() {
		
		return ((hacerPendiente()*pobrezaP)+hacerOrdenada());
	}
}
