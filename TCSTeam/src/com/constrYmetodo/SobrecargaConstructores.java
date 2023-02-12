package com.constrYmetodo;

public class SobrecargaConstructores {

	SobrecargaConstructores (int a, int b){
		
		System.out.println("Invoca a constructor int -  int "+a+b);
	}
	SobrecargaConstructores (int a, double b){
		
		System.out.println("Invoca a constructor int -  double "+a+b);
	}
	SobrecargaConstructores (double a, int b){
		
		System.out.println("Invoca a constructor double -  int "+a+b);
	}
	SobrecargaConstructores (int a, int b, int c){
		
		System.out.println("Invoca a constructor int -  int  - int "+a+b+c);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		SobrecargaConstructores objeto = new SobrecargaConstructores(86.5,8);
		
		
	}

}
