package day27inheritance;

public class Runner { //runner calistiran class 

	public static void main(String[] args) { //bir projede bir tane main metod olur o butun sistemi calistirir.


		Animal a1 = new Animal(); //bu constructor default constructor'dir.
		a1.hareket();             //bu obje ile yeme, icme ve hareket metodlarina ulasabilirim
		a1.yeme();
		a1.icme();
		
		System.out.println("=============");
		
		Mammal m1 = new Mammal(); //mammal objesi ile animalin metodlarina ve kendi icinde olusturulan metodlara ulasabilirim.
		m1.dogum();               //mammal da hareket yeme ve icme yoktu ama parent'tan miras aldi inheritance
		m1.sutIleBesle();
		m1.icme();
		m1.yeme();
		m1.hareket();
		
		System.out.println("==========");
		
		Cat c1 = new Cat();  //Cat class'inda olusturulan metodlara ek olarak mammal ve animal dan gelen miraslar var
		c1.dogum();
		c1.sutIleBesle();
		c1.miyav();
		c1.hareket();
		c1.yeme();
		c1.icme();
		
		System.out.println("=============");
		
		Dog d1 = new Dog();
		d1.hareket();
		d1.yeme();
		d1.icme();
		d1.sutIleBesle();
		d1.dogum();
		d1.havla();
		
		System.out.println("=============");
		
		Fish f1 = new Fish();
		f1.hareket();
		f1.icme();
		f1.icme();
		f1.yumurtla();
		
	}

}
