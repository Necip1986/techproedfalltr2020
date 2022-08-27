package day29overriding;

public class Animal {

	public void ses() { //overridden method //private override edilemezler
		System.out.println("Hayvanlar Ses cikarir");
	}
	
	protected int add() {
		return 3+4;
	}
	
	public int multiply() {
		return 3*4;
	}
	
	public Integer multiple() {
		return 3*4;
	}
	
	public Animal create() { //Return type olarak Animal Class'i kullandim
		return new Animal(); //bir Animal objesi return eder new Animal. methodun urettigi class'in objesi olmali 
	}
	
	public static void eat() {
		System.out.println("Yerler");
	}
	
	public final void eaty() {
		System.out.println("Yerler");
	}
	
}