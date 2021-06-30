package com.numeros.practica;
import java.util.Scanner;

public class PruebaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		SumaNumeros s1 = new SumaNumeros(0,0);
		int resultado;
		
		System.out.print("Escribe el primer entero: ");
		s1.numero1 = entrada.nextInt();
		
		System.out.print("Escribe el primer entero: ");
		s1.numero2 = entrada.nextInt();
		
		resultado = s1.suma();
		
		System.out.println(resultado);

	}

}
