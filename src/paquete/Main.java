package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<10; i++)
		{
			System.out.println((i + 1) +" Alejandro");
		}
		System.out.println();



		do
		{
		System.out.println("Introduce un número, se parará cuando se introduzca uno negativo.");
		num1 = sc.nextInt();
		
		}while(num1 > 0);
		
		Coche renault = new Coche("Renault Clio", "Azul");
		Coche ferrari = new Coche("Ferrari f40", "Rojo Torino");

		Alumno alumno1 = new Alumno("Andres", 6.7);
		Alumno alumno2 = new Alumno("Paco", 8.9);

		System.out.println();


		if (alumno1.getNota() < alumno2.getNota()) 
		{
			System.out.println(alumno2.getNombre() + " ha sido recompensado con " + ferrari.getMarca() + " de color " + ferrari.getColor());
			System.out.println(alumno1.getNombre() + " ha sido recompensado con " + renault.getMarca() + " de color " + renault.getColor());
		}

		else
		{
			System.out.println(alumno1.getNombre() + "Ha sido recompensado con un " + ferrari.getMarca() + " de color " + ferrari.getColor());
			System.out.println(alumno2.getNombre() + "Ha sido recompensado con un " + renault.getMarca() + " de color " + renault.getColor());
		}

		System.out.println();
		System.out.println();
		System.out.println(GestionFecha.getRandomDate());
		System.out.println();
		System.out.println();

		
	}



}
