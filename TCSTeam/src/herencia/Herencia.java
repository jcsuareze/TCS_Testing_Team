package herencia;

class Parent {

	int a;

	void display() {

		System.out.println(a);
	}
}// fin de la clase Parent

class Child1 extends Parent {

	int y;

	void show1() {
		System.out.println(y);
	}

}

class Child2 extends Parent{
	
	int y;
	void show2() {
		System.out.println(y);
	}
}

public class Herencia {

	public static void main(String[] args) {
		
		Child1 objetoChild1 = new Child1();
		objetoChild1.a = 10;
		objetoChild1.display();
		objetoChild1.y = 200;
		objetoChild1.show1();
		
		Child2 objetoChild2 = new Child2();
		objetoChild2.a = 50;
		objetoChild2.display();
		objetoChild2.y = 300;
		objetoChild2.show2();
		
	}
}
