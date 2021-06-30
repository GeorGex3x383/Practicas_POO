package com.herencia.practicatres;

public class Gerente extends Empleados {
	
	private float mBono;
	
	Gerente(String nNombre, String mNumEmpleado, float mSalario, float mBono) {
		super(nNombre,mNumEmpleado, mSalario);
		this.mBono = mBono;
	}
	
	public float getmBono() {
		return mBono;
	}
	
	public float getPago() {
		return (mBono + getmSalario());
	}

}

