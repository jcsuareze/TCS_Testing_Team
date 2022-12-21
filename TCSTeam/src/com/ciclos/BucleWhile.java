package com.ciclos;

public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 // Se inicializa el contador
		int numWhile=1;
		 
        //Se define las veces que se recorrera el bucle
        while (numWhile<=20){
            System.out.println(numWhile);
            //Se incrementa el contador
            numWhile++;
        }
		
        
        for (int numFor=1;numFor<=20;numFor++){
            System.out.println(numFor);
        }
	}

}
