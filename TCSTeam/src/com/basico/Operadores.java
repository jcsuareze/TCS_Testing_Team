package com.basico;

public class Operadores {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Operadores Aritmeticos --> + - * / %

		System.out.println("----------------------Operadores Aritmeticoss------------------");
		System.out.println("Suma de a y b es: " + (a + b));
		System.out.println("Resta de b menos a es: " + (b - a));
		System.out.println("Mul de a y b es: " + (a * b));
		System.out.println("Div de  b entre a es: " + (b / a));
		System.out.println("Modulo de a y b: " + (a % b));

		// Operadores relacionales (Operadores de comparacion) ---> == < > <= >= !=
		// Siempre regresan un valor boleano
		System.out.println("----------------------Operadores relacionales------------------");
		System.out.println(a == b); // false
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a >= b); // false
		System.out.println(a <= b); // true
		System.out.println(a != b); // true

		//Opeadores logicos && || !
		// funciona con 2 boleanos

		boolean x = true;
		boolean y = false;

		System.out.println("----------------------Operadores Logicos------------------");
		System.out.println(x && y); // false
		System.out.println(x || y); // false
		System.out.println(!x); // false
		System.out.println(!y); // true

		// Operadores de incremento++ /decremento --

		a = 10;
		a++; // a=a+1;
		System.out.println(a);

		b = 20;
		b--; // b = b-1;
		System.out.println(b);
	}
}
