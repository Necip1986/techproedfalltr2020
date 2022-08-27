package day16constructors;

public class Animal { //bu class'in 4 parametresi var

	int age;
	String name;
	int numOfLegs;
	Boolean isMammal;
	private int a=12;
	
	//istedigimiz kadar constructor olusturabiliriz. Burda 4 constructor urettik
	
	public Animal() {
		System.out.println("Parametresiz");
		a=15;
		System.out.println(a);
	}
	public Animal(String name) {
		this(); //bu constrctor cagir demek 4 parametre var burda parametresiz constructor'a cagirir
		System.out.println("Name parametreli");
	}
	public Animal(int age) {
		System.out.println("Yas parametreli");
	}
	public Animal(String name, int age) {
		System.out.println("Name ve age parametreli");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Animal a1 = new Animal("Cat");//ekranda this'den dolayi parametresiz ve name parametreli yazdirir. This i kullanarak constructorlari 
		                              //baska constructorlar  icinde zincirleme kullanmamiza olanak saglar

	}

}
