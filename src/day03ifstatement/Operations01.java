package day03ifstatement;

public class Operations01 {

	public static void main(String[] args) {
		
		//charlari int data type da bir variable ye atarsak java o degerin ASCII degerini variablenin icine koyar.
		int harf = 'a';
		System.out.println(harf);
		
		int unlem = '!';
		System.out.println(unlem); //class in icinde 1 tane unlem kullanilir
		
		byte trt = '!';
		System.out.println(trt); //degeri byte nin sinirlari icinde olursa byte char yerine kullanilabilir.
		
		//java matematikteki tum islemleri dogru olarak yapabilir.
		int a = 10;
		int b = 11;
		int c = 47;
		System.out.println(a+b); //21 yazar ekrana
		
		//int i int boldugunuz zaman int cikar java yuvarlama islemi yapmaz sonucun tam kismini bolme isleminin sonucu olarak ekrana yazar.
		//ornegin 47/10 islemiin sonucu 4.7 dir ama java da 4 tur.
		System.out.println(c / a); //4 olur. java 4.7 yi 4 olarak yani tam sayi olan kismi esas alir yuvarlama yapmaz.
		
		/*
		 islem onceligi
		 1) parantez ici islemler once yapilir
		 2) carpma ve bolme yapilir
		 3) toplama ve cikarmalar yapilir
		 */
		System.out.println(b+a*c); //481
		System.out.println(b + (c-2*b)/2);
		
		System.out.println(c-a/(b-c)+a*b);
		
		//farkli data type leri ile matematiksel islemler yaparsaniz sonuc buyuk data type'inde verilir
		//byte < short < int < long < float < double. double int i kapsar. butun islemlerde buyuk olan a gore sonuc olur
		int d = 12;
		double e = 4;
		float f = 4f;
		
		System.out.println(d/e);
		System.out.println(d+e);
		System.out.println(e/d); //0,3333333333333333  16 rakam
		System.out.println(f/d); //0,3333334 7 rakam
		
		//modulus islemi: iki ondalik olamayan sayi birbirine bolundugunde kalani verir. (mod islemi) 12/5=kalan 2 olur
		//java modulus islemi sembolu % isaretidir. toplama cikarmadan daha fazla kullanilir java da
		System.out.println(13 % 5);
		System.out.println(245 % 3);
		
		//cift sayi (even): 2'ye bolundugunde 0 kalanini veren sayilar.
		//tek sayi (odd): 2'ye bolundugunde 1 kalanini veren sayilardir.
		
		System.out.println(12345657 % 2); //sonucu 1 ise tek o ise cift sayidir.
		
		//concatenation:String'leri birlestirmek icin kullanilir. sembolu "+" isaretidir.
		String s1 = "java";
		String s2 = "kolaydir"; //3 turlu bosluk birakilir. 
		System.out.println(s1 + s2);  //System.out.println(s1 + " "+ s2)
		
		int g = 2;
		int h = 3;
		String i = "java";
		
		System.out.println(i + g + h);  //java + 2 +3 : java soldan saga calisir. "java2"+3 olur yine string var ve concatenation yapar "java23"
		System.out.println(i + (g + h)); //java5 cikar sonuc. "java"+5=java5
		System.out.println(g + h + i); //5+"java"= concatination yapar 5java olur
		
		//g h ve i variablearini kullanarak 61java-1 yazdirin
		 System.out.print(g * h);
		 System.out.print(h - g);
		 System.out.print(i);
		 System.out.println(g - h);
		 
		 System.out.println((g*h) + "" + (h-g) + i + (g-h));
		 
		
		
		
		

	}

}
