package day24varargsaccessmodifiers;

public class Vrgs01 {
	/*
	   1-Method parantezi icinde 1'den fazla parametre varsa, varargs her zaman en sonuncu parametre olmalidir. 
	   2-Method parantezi icinde 1'den fazla varargs kullanilamaz. 1. madde ile celisir. en az birisi en sonda olacak oda olmaz
	 */

	public static void main(String[] args) {
		
		add(3,5); //ekrana 8 yazdiracak
		
		add(3,5,7); //diger methodlar olmasa bile vararg ile bu iki deger ekranda yazdirilabilir
		
		add(3,4,5,6,7,8,9);
		
		add();
		add(3);  //ister hic argument olmasin isterse 1 isterse sonsuz olsun calisir method
		         //varargs bir objedir. burada varargs'in ismi a'dir 
		         //varargs her data tipinde calisir. Array oldugu icin
		
		concat("A","l", "i", " Kahraman");
		
		yazdir("Isim:", "A","l","i");

	}
	//2 sayiyi toplayacak ve ekrana yazdiracak bir method olusturuyoruz
	//public static void add(int a, int b) {
		//System.out.println(a+b);
	//}
	//3 tane integer'i toplayan bir metod olusturuyoruz
	//public static void add(int a, int b, int c) {
		//System.out.println(a+b+c);
	//}

	//surekli sayi artikca yeni method olusturmak gerekiyor. 
	//VARARGS BU isi cozuyor. list gibi davranan bir array'dir.
	public static void add(int...a) {  //JAVA varargs kullanarak esnek davraniyor bu method'a istedigimiz kadar parametre ekleyebiliriz
		                               //varargs arkada array'leri kullanir
		int sum=0;
		for(int w:a) {
			sum=sum+w;
		}
		System.out.println(sum);
	}
	//varargs kullanarak verilen Stringleri birlestiren concat isimli bir method olusturunuz
	public static void concat(String... s) {
		String result="";
		
		for(String w:s) {
			result=result+w;
		}
		System.out.println(result);
	}
	//varargs argument kullanmada bize esneklik kazandiriyor
	
	public static void yazdir(String a, String...s) { //java ilk argumenti birinci parametreye koyar digerleri varargs olur
		                                              //vararrg basa gelirse diger string calismaz varargs yer hepsini
		                                              //java varargs basa konursa CTE verir. Varargs en sona konmali
		System.out.println(a);
		for(String w:s) {
			System.out.print(w+" ");
		}
	}
}
