package com.arreglos;

public class ArregloUnidimensional {

	public static void main(String[] args) {
		/*
		 * int a[] = new int[5]; // indice 4
		 * 
		 * a[0] = 100; a[1] = 200; a[2] = 300; a[3] = 400; a[4]= 500;
		 */

		int a[] = { 100, 200, 300, 400, 500 };

		System.out.println("El tamano del arreglo es: " + a.length);
		System.out.println("El valor del arreglo en el indice 3 es: " + a[3]);

		// Ciclo For Clasico
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}

		// Ciclo For Mejorado
		// Lee los valores de a y los almacena en savedValue
		// for( valor del arreglo y donde se almacena : arreglo)

		for (int savedValue : a) {
			// for(var savedValue : a) {

			System.out.println(savedValue);
		}

	}

}
