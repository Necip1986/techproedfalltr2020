package day26encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj1 = new E01();  //private olanlara ulasamam age gorunmez ancak get kullanirsak age'in degerini aliriz
		obj1.getAge();
		System.out.println(obj1.getAge()); //age'i private yaparak kapsul icine aldik. degeri gormek icin getter kullandik 25 goruruz
		
		obj1.getName();
		System.out.println(obj1.getName()); //Ali gorunur ekranda getter ile getirttik
		
		//yasi 33 yapabilir miyiz? setter kullanalim
		
		obj1.setAge(33);
		System.out.println(obj1.getAge()); //age 33 oldu bu class'ta age 33 olarak kullanilabilir ancak orjinal class'inda degismez 25'tir yas
		
		obj1.setName("Ayse");//bu class'ta name Ayse oldu ancak orjinal degismedi E01 class'inda name Ali'dir.

		//bu class'ta age 33 olarak kullanilabilir yani istedigim degeri atayabilirim. Bu esneklik demektir.
		
		//E03'ten obje olusturuyoruz
		
		E03 obj3 = new E03();
		//num'i 38 yap ve ekrana yazdir
		obj3.setNum(38);
		System.out.println(obj3.getNum());
		
		//name'i ekrana yazdirin
		System.out.println(obj3.getName());//emine verir consolda
		
		//Initial variable'ini degistirilemez hale getirin
		//E03 class'ina gidip setInitial methodu kaldiririz.
		
		//Initial variable'ini okunamaz hale getirin
		//E03 class'ina gidip getInitial metodu kaldirilir. 
		//Initial o class ta gomulu oldu.
		
		//E03 class'i immutable degildir. Cunlu bazi variable'lar icin set metodu kullanilmistir. Initial variable'i haric
		
		
	}

}
