package herencia;

interface interfaceA {
	int x = 100;
	
	void show();

}

interface interfaceB {
	
	int y = 200;
	
	void show();
}

public class HerenciaMultiple implements interfaceA, interfaceB{

	@Override
	public void show() {
		
		
	}

}
