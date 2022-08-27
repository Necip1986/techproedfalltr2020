package day28inheritanceconstructorcall;

public class Animal {

	//private int z=15;
	public int a;
	public int m=3;
	
	public Animal() {
		super();
		System.out.println("Parametresiz Animal");
	}
	
	public Animal(int i) {
		System.out.println("Parametreli Animal");
	}
	
	public void mA() {
		System.out.println("Animal");
	}
	
	public void mM() {
		System.out.println("Mammal+Animal");
	}
	
}
