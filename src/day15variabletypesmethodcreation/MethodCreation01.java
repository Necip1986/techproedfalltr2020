package day15variabletypesmethodcreation;

public class MethodCreation01 {

	/*
	 * Static method'un icinde kullanilan hersey static olmalidir.
	 */ 
	 
	/* 
	 * method olusturuken ayni method isimlerini kullanabilirsiniz ama parametreler farkli olmalidir.
	 * Parametreleri farkli yapmanin 3 yontemi var
	 * 1-Parametre sayilarini farkli yapabilirsiniz
	 * 2-Parametrelerin data tiplerini degistirebilirsiniz. Parametrelerin isimlerini degistirmek yetmez (a ve b'yi x y yapmak yetmez)
	 * 3-Data type'lari farkli ise parametrelerin yerlerini degistirebilirsiniz
	 */
	
	
	public static void main(String[] args) {
	//java mumkun oldugunca main methodun basit tutulmasini ister. Kodlari main method disinda olusturcaz. main method icine cagircaz	
 
		toplama(3,5); //main method static oldugu icin hata veriyor.methodlar static olmali
		toplama(6.3,1.2); //a+b islemini yapar
		
		carpma(7,8);//carpma methodu olusturdum oradan cagirdim/ 7 ve 8 e argument denir. 
		            //java en uygun methodu kullanilir java az is yapmayi sever. Sadece 56 verir int int en uygun oldugu icin en az is bunda
		carpma(2.3, 3.4);
		carpma(2,3.5); //4 farkli opsiyon var. Parametre sayisi ile 3 parametreli iptal oldu
		               //parametre tipi (int int) olan elenir
		               //kalan ikisi icerisinde en uygun (int, double) bunu kullanir.
		carpma(4, 5, 5); //iki carpma methodu var java hangisini sececek. isimden secemeyince 3 parametreli oldugu icin secimini yapabilir.
			
	}
	
	public static void toplama(double a, double b) {
		System.out.println(a+b); //yemek hazirladik simdi cagiriyoruz. Burda static yok. Static yoksa static icinde kullanamayiz
		                         //o zaman public yanina static yazariz
		                         //toplama islemi a'ya gelen 6.3 ve b'ye gelen 1.2'yi pass eder
		                         //koskoca toplama kodunu main method disinda olusturduk ve main method icinde basit olarak kullanildi	
	}
	
	//2 double' carpan carpma methodu create edin. Bu methodu main method icinden cagirarak calistirin
	
	public static void carpma(double a, double b) { //double a ve double b parametre'dir. Bu parametreler pass yapar. 
		System.out.println(a*b);                    //method parantezi icindekilere parametre denir
	}
	
	public static void carpma(int a, double b) {  
		System.out.println(a*b);                   
	}
	//3 double carpan bir carpma methodu olusturun. ve bu methodu main method icinden cagirarak calistirin
	
	public static void carpma(int a, int b) {
		System.out.println(a*b);
		//method olusturuken ayni isimler kullanilabilir ama parametreler farkli olmali. her ikisi ayni olunca compile time error verir
	}
	public static void carpma(double a, double b, double c) {
		System.out.println(a*b*c);
		
	}
}
