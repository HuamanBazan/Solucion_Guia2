package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer numero:  ");
		int num1 = sc.nextInt();
		System.out.print("Segundo numero:  ");
		int num2 = sc.nextInt();
		
		String resultado = "";
		
		if (num1 == num2)
			resultado = "Los numeros son iguales";
		else if (num1 > num2)
			resultado = "El primer numero es mayor";
		else
			resultado = "El segundo numero es mayor";
		System.out.println(" \nResultados");
		System.out.println("-------------------------");
	    System.out.println("RESPUESTA : " + resultado);
	    

	}

}
