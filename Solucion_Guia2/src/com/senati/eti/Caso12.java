package com.senati.eti;
import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("        DATOS DEL ALUMNO");
	    System.out.println("---------------------------------");
		System.out.print("NOMBRE ...............:");
		String nombre = sc.nextLine();
		System.out.print("NIVEL[1-4] ...........: ");
		int nivel = sc.nextInt();
		System.out.print("Ingrese sueldo........: ");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch (nivel){
		case 1:
			incremento = 0.045f;
			break;
		case 2:
			incremento = 0.06f;
			break;
		case 3:
			incremento = 0.085f;
			break;
		case 4:
			incremento = 0.11f;
		}
		
		System.out.println("           RESULTADOS");
	    System.out.println("---------------------------------");
		System.out.println("EMPLEADO .............:"  + nombre);
		System.out.println("NIVEL ................:"  + nivel);
		System.out.println("SUELDO ...............:"  + sueldo);
		System.out.println("INCREMENTO ...........:"  + incremento*100+"%");
		System.out.println("NUEVO SUELDO .........:"  + (sueldo+sueldo*incremento));
		

	}

}
