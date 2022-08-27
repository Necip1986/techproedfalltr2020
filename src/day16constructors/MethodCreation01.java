package day16constructors;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		add(3,5); //eger syso kullanmazsak consolda birsey goremeyiz. add methodunu cagirmak istiyorsak syso icine koymaliyiz. 
		          //add methodu altina yazabiliriz ama orda void kullanilmadigindan tercih edilmez
        
		System.out.println(add(3,5));
		System.out.println(concatenate("Merhaba ", "Dunya"));
	}
	/*
	 * Method olustururken void disinda bir return type kullanirsaniz method body'si icinde en son satirda return 
	 * keyword kullanmalisiniz. Aksi taktirde cte verir.
	 * 
	 * "void" disinda kullanilabilecek return type'ler tum primitive ve tum non-primitive'lerdir.
	 * void disinda bir return type kullanildiginda en son satirda return kelimesi kullanilmalidir.
	 */
	public static int add(int a, int b) { //return type int olunca add methodu calistiginda int verecek denir
		// void disinda da return type konabilir
		return a+b;
		//System.out.println("Ali"); //java ulasilmaz kod verir okumaz return kullanildiktan sonra baska kod kullanilmaz.
	}
	/*SORU
	 * 2 stringi concatinate eden ve String return eden bir method olusturunuz. 
	 * Bu methodu main method icinden cagirip Stringi ekrana yazdiriniz
	 */
	public static String concatenate(String s, String t) {
		return s.concat(t);
	}

}
