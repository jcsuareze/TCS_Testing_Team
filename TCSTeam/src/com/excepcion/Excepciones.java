package com.excepcion;

public class Excepciones {

	public static void main(String[] args) {

		System.out.println("El programa ha empezado");
		int a = 100;

		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {

			//e.printStackTrace();
		} // fin de catch

		String s = null;

		try {
			System.out.println(s.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

		System.out.println("El programa ha finalizado");

	}
}
