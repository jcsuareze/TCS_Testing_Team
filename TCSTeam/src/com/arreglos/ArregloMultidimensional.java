package com.arreglos;

public class ArregloMultidimensional {

	public static void main(String[] args) {

		// [Filas][Columnas]
		/*
		 * int a[][] = new int[3][2];
		 * 
		 * a[0][0] = 100; a[0][1] = 200; a[1][0] = 300; a[1][1] = 400; a[2][0] = 500;
		 * a[2][1] = 600;
		 */

		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		System.out.println("Numero de filas " + a.length);
		System.out.println("Numero de columnas " + a[0].length);

		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Forma Clasica " + a[i][j]);
			}

		for (int r[] : a) {
			for (int i : r) {
				
				System.out.println("Forma Mejorada "+i);
			}
		}

	}

}
