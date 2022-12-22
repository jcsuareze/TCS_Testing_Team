package com.ciclos;

public class DoWhile {

	public static void main(String[] args) {
		
		//Se inicializa el contador
		int doWhile = 1;
		
		//Se pone la acción a realizar por el do while
		do {
			System.out.println(doWhile);
			
			//Se incrementa el contador
			doWhile++;
		
		//Se pone la condición a cumplir	
		}while(doWhile<=5);
	}
}
