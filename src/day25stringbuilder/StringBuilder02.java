package day25stringbuilder;

public abstract class StringBuilder02 {

	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		//StringBuilder class'i kullanarak String uretmek

		//1.yol
		StringBuilder sb1 = new StringBuilder(); //new kelimesinden sonra constructor kullanilir. StringBuilder olusturulacagi zaman 
		                                         //java heap memory de 16 karakterlik bir yer uretir.
		                                         //Bos bir string olusturdugumuzda java memory'de 16 karakterlik yer ayirir ama bostur.
	
		sb1.append("Java");                 //list'teki add metodu gibi isler
		System.out.println(sb1); //sb1 bostu java eklemis olduk
		
		sb1.append(" guzeldir");
		System.out.println(sb1); //java guzeldir oldu orjinal deger yine degisti.
		
		sb1.append(". Ama").append(" calismak gerekir");
		System.out.println(sb1); //metod chain yapilabilir.
		System.out.println(sb1.capacity()); //capasity 70 verir. 2 katini asinca
		                                    //2 tane 16 veriyor +2
		//not:16'yi asinca +16 yapiyor, 32'yi asinca 2.32+2 ekliyor
		//32'yi astik buyuzden 32+32+2+4 tane de fazla kalmisti 3.16 dan sonraki 4 oylr 70 etti.
		
		System.out.println(sb1.capacity());
		System.out.println(sb1.length()); //length'i sifir'dir. length ile capacity farki. otobus kapasitesi 45 ama yolcu yok gibi
		                                  //length() metodu var olan karakter sayisini verir
		//2.yol //biz javaya 16 yer ayirma bize 11 yeter diyebiliriz
		StringBuilder sb2 = new StringBuilder(11); //kapasitesi 11 olan bos bir string olusturdu java. busayi degistirilebilir
		System.out.println(sb2.capacity()); //11
		System.out.println(sb2.length());//yine 0'dir.
		
		sb2.append("AliAliAli");
		System.out.println(sb2.capacity());//11+9 yapiyor.
		
		//3.yol belli bir string uretmek icin kullanilir
		StringBuilder sb3 = new StringBuilder("Java"); //belli bir 
		System.out.println(sb3.capacity()); // 4+16 yapar yani 16'ya ekler
		System.out.println(sb3.length()); //4'tur. girilen karakter sayisidir.

		StringBuilder sb4 = new StringBuilder("JavaJavaJavaJavaJava");
		System.out.println(sb4.capacity()); //36 olur 16 limiti asilinca bir limit daha veriyor
		                                    //limiti 11 yaparsam bu sefer 11 11 ekleme yapar
	
		//fazladan ayrilan capacity'i azaltmak 
		sb4.trimToSize(); //bos kapasiteyi siliyor. String'in size ne kadar ise o hale getiriyor.
		System.out.println(sb4.capacity());//20 verir
	
		//Istenen bir karakteri index'ine gore almak. 
		sb4.charAt(5); //index'i verilen karakteri getirir
		System.out.println(sb4.charAt(5));//string'lerdeki kullanimi ile ayni
		
		//Belli araliktaki karakter'leri alma subString metodu
		sb4.substring(4, 11);
		System.out.println(sb4.substring(4, 11));//JavaJav verir aynen stringlerde oldugu gibi kullanilir
		
		System.out.println("=========");
		//6. karakterden sonraki tum karakterleri gormek istiyorum
		sb4.substring(5);
		System.out.println(sb4.substring(5));//avaJavaJavaJava gorurum
		System.out.println(sb4);
		
		//Belli bir karakterdeki character'i silme
		sb4.deleteCharAt(5);
		System.out.println(sb4); //a gitti
		
		//Index 4(dahil)'ten index 6(dahil)'ya kadar tum karakterleri siliniz
		sb4.delete(4, 7); //subString'te oldugu gibi 7 dahil degildir //
		System.out.println(sb4);//JavaJavaJavaJava
		
		//Istenen index'e istenen character veya character'leri eklemek
		//insert medotu araya eleman eklemek arayi acar isteneni ekler
		sb4.insert(4, "X"); //char 'X' eklersek veya boolean da eklenesek eklenir calisir farkli type'larla
		System.out.println(sb4);//JavaXJavaJavaJava araya x ekledi
		
		//Istenen index'teki karakteri degistirmek// ilk java dan sonra bosluk olsun
		sb4.setCharAt(4, ' ');
		System.out.println(sb4);//Java JavaJavaJava olur
		
		//Istenen index'teki character'in yerine 1'den fazla character eklemek
		
		sb4.replace(9, 13, " ");
		System.out.println(sb4); //Java Java Java olur. yerine space koydu
		
		//Interview sorusu= 1 tane string olusturun bu stringi loop kullanarak tersten yazdirin
		
		String str = "Hastane";
		
		for (int i = str.length()-1; i >=0;  i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	//2. yol
	StringBuilder s = new StringBuilder("Hastane");
	s.reverse();
	System.out.println(s);
	
	//s.to //stringBuilder'dan gelenler orjinal degeri degistirir.
	
	//String ile StringBuilder Karsilastirmasi
	String s01 = "Java";
	StringBuilder sb01 = new StringBuilder("Java");
	
	//**System.out.println(s01==sb01);//sikayet eder farkli tipler oldugundan 
	                              //biri string classinin objesi digeri string builder class'inin objesi
	                              //farkli data tipleri == sembolu ile karsilastirilirsa CTE verir.
	
	System.out.println(s01.equals(sb01)); //equals metodu sadece degerlere bakar CTE vermez ama esit kabul etmez false verir
	//bu nasil tamir edebiliriz
	System.out.println(s01.equals(sb01.toString())); //toString StringBuilder'i string'e donusturur.
	
	StringBuilder y=new StringBuilder("ali");
	System.out.println(y.capacity());
	y.append("javaJava6");
	System.out.println(y.capacity());
	
	char []c= {'a','b','h'};
	y.append(c);
	System.out.println(y);
	
	}
}
