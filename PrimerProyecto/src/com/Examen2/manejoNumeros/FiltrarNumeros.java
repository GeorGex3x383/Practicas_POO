package com.Examen2.manejoNumeros;

//En esta clase se filtran los numeros entre los valores dados
public class FiltrarNumeros {
	
public int filtrarNumero(String Jorge){
		
	int num = 0;
		//Con estos parametros limpiamos el archivo para que solo queden los numeros
		num = Integer.parseInt(Jorge);
		if(num>=100 && num<= 20000) {
			//System.out.println(num);
			return num;
		}

		return 0;
	}
}
