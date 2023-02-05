package com.constrYmetodo;

public class DemoConstructor {
	
	int x;
	int y;
	
	DemoConstructor(){
		
		x = 40;
		y = 50;
		
	}
	
	DemoConstructor(int a, int b){
		
		this.x = a;
		this.y = b;
		
	}
	
	void display() {
		
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
		DemoConstructor objeto = new DemoConstructor();
		DemoConstructor objeto2 = new DemoConstructor(300, 500);
		
		objeto.display();
		objeto2.display();
		
	}

}
