package day28inheritanceconstructorcall;

public class Cat extends Mammal {
	
	//super() Constructor icinde sadece ilk satirda kullanilabilir. Diger satirlarda CTE verir
	//this de ayni sekilde kullanilirdi
	
	public int c=2;
	public int d=5;
	
	public Cat() {
		super(); //gorunmez zaten vardi gorunur yaptim. Ancak bir fark yok olmasa da ayni sey
		System.out.println("Parametresiz Cat");
		//super(); //alt satira konursa CTE verir. ustte olmali
	}
	
	public Cat(String s) {
		this();
		/*
		   Parent class'tan variable veya method secmek icin super (parantezsiz kullanim) keyword'unu kullanabilirsiniz
		 */
		System.out.println(super.c); //c'y 4 olarak kullanma hakki oluyor ama syso icine almayilim super key word'u ile parenttaki variable ulasirim
		System.out.println("Parametreli Cat");
	}
	
	public void mC() {
		System.out.println("Cat");
	}
}
