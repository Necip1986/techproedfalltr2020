package day01variables;

public class Variables02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Variable oluşturma
		//1)Data Type 2)Variable ismi 3)"=" 4)Variable a bir değer ataması yapın 5)";" koy

		//1. Yol: makbul (recommended)
		int age = 23;
		int salary = 5000;
		System.out.println(age);
		System.out.println(salary);
		
		//2. yol
		int lenght; //variable oluşturuldu ===>Decleration
		lenght = 12; //Variable değer ataması yapıldı ==>Assignment
		System.out.println(lenght);
		
		//3. yol
		//int widht = 22;
		//int height = 32;
		//int money = 42;
		
		int widht = 22, height = 32, money = 42;
		System.out.println(widht + height + money);
		
		/*
		 Javada temelde 2 farklı data tip vardır
		 1)primitive (ilkel) data type: 8 tanedir.
		 a)boolean: true false durumlarında kullanılır. Sadece iki farklı değer aldığı için memory de az yer kaplar
		            1 boolean variable memory de 1 bit lik yer kaplar.
		 b)char :Tek karakterli (her sembole karakter denir) ifadeler icin char data type kullanilir. S, ?, a, *==>char olur
		        1 char memoryde 16 bit yer kaplar.char data type de variable olustururken deger mutlaka tek tirnak icinekonur
		        char larla mathematiksel islemler yaparsaniz charlarin ASCII table daki degerleri kullanir.
		 c)byte :-128 den +127'e kadar tum tam sayilari icerir.Byte lar memory den 8 bit lik yer kaplar.
		 d)short : -32768'den 32767'e kadar tum tam sayilari icerir.short memory de 16 bit yer kaplar.
		 e)int: -2,147,483,648'den 2,147,483,647 e kadar tum sayilar. intler memory de 32 bit yer kaplar.
		 f)long: -9,223,372,036,854,755,808 den 9,223,372,036,854,755,807 e kadar tum tam sayilar.long memoryde 64 bit kaplar 
		 g)float: ondalikli sayilar icin kullanilan data type lardir.float memory de 32 bit kullanir.ondalik kisimlarda enfazla 7rakam barindiri.
		         bir ondalikli sayinin float oldugunu belirlemek icin en sona 'f' veya 'F'yazmak gerekir. 2.23f veya 2.23F yazmaliyiz. Sonuna f
		         veya F yazilmayan                            
		 h)double: ondalikli sayilar icin kullanilan data type lardir.double memoryde 64 bit kullanir.ondalik kisimlarda enfazla 16rakam barindiri
		 
		 2)non-primitive data type:
		        String: cift tirnak arasina yazilan sifir veya daha fazla karakterlerden olusur.hic birsey yazilmasa da olur
		 */
		
		//memory nin en küçük yapı taşına bit denir.8 bit 1 byte olarak adlandırılır.
		boolean emekli = false;
		boolean engelli = true;
		System.out.println(emekli);
		System.out.println(engelli);
		
		char initial = 'S';
		char ch1 = '?';
		char ch2 = 'a';
		char ch3 = ' '; //space karakterdir ve char da kullanilabilir
		//char ch4 =''; char olustururken tek tirnak arasinda mutlaka 1 karakter olmalidir. 
		//sifir karakter veya 1 den fazla character kabul edilmez.
		char ch5 = 'A';
		
		// a ==>97 dir.==>0 ve 1 lere ceviririz.ASCII Table
		System.out.println(initial); //S
		System.out.println(ch1 + ch2); //63+97=160  matematiksel islem olunca + gibi sayi degeri kullaniyor
		System.out.println(ch5 > ch2); //karsilastirma islemlerinin sonucu ya true yada false olur.A 65 a 97 boolean kullandi 
		                               //buyuk harflerin ASCII degerleri kucuk harflerden kucuktur.
		
		//herhangi bir char in ASCII degerini kod yazarak bulmak.
		System.out.println(ch3 + 0); //space degeri 32 dir.
		
		byte b1 = 12;
		byte b2 = -125;
		System.out.println(b1 * b2); //-1500
		
		float f1 = 2.23f; //f konmazsa java double kabul eder
		float f2 = 0.1234F;
		
		double d1 = 2.23; //d konur ama gerek yok
		
		//Primitive data type buyukten kucuge siralayalim. 
		//byte < short < int < long < float < double ***onemli
		
		String str1 = ""; // ilk harf buyuk olmak zorunda
		String str2 = "A";
		String str3 = "Ali Can okula gitti. Eve daha gelmedi.";
		/*
		 Primitive data type ile Non-primitive data type arasindaki farklar?
		 1)  primitive data type isimlerinde tum harfler kucuk olmali. Non-primitive data type da ilk harf buyuk yazilir.
		 2) primitive data type lerini java olusturmustur, biz primitive data type olusturamayiz 8tanedir. Non primitive data type lar java ve   
		   java programcilari tarafinda istenildigi kadar olusturulabilir.
		 3) primitive data type larda memory de kapladigi yer data type gore degisir.non primitive memory de her zaman ayni yer kaplar degismez
		 4) Primitive data type larinin memory'de ayirdigi alanda sadece o primitive datanin degeri vardir.ama non primitive lerin memory de
		    ayirdigi alanda o non-primitive data nin degeri yaninda kullanima hazir cok faydali onlarca method vardir. 
		    
		    
		 */
		        //1.odev
				int animalName;               int number;
				animalName = 12;              number = 5;
				System.out.println(animalName - number);
				//2.odev
				char meter = 'n';
				char school = 'e';
				System.out.print(meter);
				System.out.println(school);
		
				
				
		
		
	}

}
