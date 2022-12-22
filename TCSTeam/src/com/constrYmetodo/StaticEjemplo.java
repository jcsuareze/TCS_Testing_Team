package com.constrYmetodo;

public class StaticEjemplo {
	
	static int a =10;
	int b = 20;
	
	static void m1() {
		
		System.out.println(a);
	}
	
	void m2() {
		
		System.out.println(a);
	}
	

	public static void main(String[] args) {

		
		System.out.println();
		
		StaticEjemplo objeto = new StaticEjemplo();
				objeto.m2();

	}

}
