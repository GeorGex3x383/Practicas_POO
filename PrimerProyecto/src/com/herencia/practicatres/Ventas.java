package com.herencia.practicatres;

public class Ventas extends Empleados {
	
	private float mComision;
	
	Ventas(String nNombre, String mNumEmpleado, float mSalario, float mComision) {
		super(nNombre,mNumEmpleado, mSalario);
		this.mComision = mComision;
	}
	
	public float getmComision() {
		return mComision;
	}
	
	public void tomarOrden () {
		System.out.println("Se tomo la orden");
	}
	
	public float getPago() {
		return (mComision + getmSalario());
	}

}