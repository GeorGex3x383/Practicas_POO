package com.herencia.practicatres;

public class Cliente extends Persona {
	
	private String mDireccion;
	private int mMontoPago;
	
	Cliente(String nNombre, String mDireccion, int mMontoPago ) {
		super(nNombre);
		this.mDireccion = mDireccion;
		this.mMontoPago = mMontoPago;
	}
	
	public String getmDireccion() {
		return mDireccion;
	}
	
	public int getmMontoPago() {
		return mMontoPago;
	}
	
	public void Compra () {
		System.out.println("Se realizo la compra");
	}

}
