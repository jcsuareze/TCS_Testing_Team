package com.basico;

public class TiposDeDatos {

	public static void main(String[] args) {

		/**********
		 * TIPOS DE DATOS PRIMITIVOS*************
		 *  
		 * 
		 * Sus rangos estan directamente relacionados con los bits que ocupan
		 *
		 */
									// Tamaño en bits	|| Val min		|| 		Val Max		||
		boolean b = false;			//		1			||   N/A		||		N/A			||
		char c = 'Y';				//		16			|| 				||					||
		short s = 2;				//		16			||	-32768		||		32767		||
		int a = 10;					//		32			|| - 2147483648	||	2147483647		||
		long l = 5;					//		64			||			Muchos					||
		float f = 20;				//		32			||			Muchos mas				||
		double d = 20.5;			//		64			||			Muchisimo mas			||
		
		
		String stringS ="TCS Team";
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(stringS);
		
		
		
		

	}

}
