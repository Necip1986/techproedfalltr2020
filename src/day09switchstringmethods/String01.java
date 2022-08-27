package day09switchstringmethods;

public class String01 {

	public static void main(String[] args) {
		/*
		 * String'in icindeki faydali methodlar
		 * 1.Method: CharAt() methodu
		 */
		String s1="Study hard stay humble";
		s1.charAt(0); //char demek karakter at ise "de da" eki. yani index 0'daki karakter
		System.out.println(s1.charAt(0));
	
		//6. harfi ekrana yazdiriniz
		s1.charAt(6);
		System.out.println(s1.charAt(6));
		
		//son harfi ekrana yazdiriniz
		System.out.println(s1.charAt(21));
		
	   //soyle de yapilabilir. harf sayisi -1=indextir. son karakterin indexi= karakter sayisi-1 olur
		//karakter sayisini veren method=s1.length()
		System.out.println(s1.charAt(s1.length()-1));
		
		//dinamik karakter= length dinamik karakterdir. surekli degisebilir
		//ortadaki karakteri ekrana yazdiriniz
		if(s1.length()%2!=0) {
		System.out.println(s1.charAt((s1.length()-1)/2));
		
	  }else {
		  System.out.println("orta karakter yok");
	  }
		
		//System.out.println(s1.charAt(38)); //hata verir. 38 karakter yok ki java uyari verir. Index 38 yok der. Run time error. 
		                                   //consol da 34. satirda hata yaptigimi soyler java
		
		//charAt() methodunda olmayan bir index kullanildiginda programi calistirdiktan sonra ekranda kirmizi hata mesaji alirsiniz
		//java bazi hatalari programi calistirdiktan sonra anlar. Bunlara "Run time error" denir. 
		
		/*
		 * Java da temelde 2 tur hata vardir
		 * 1=Compile time error: kod yazarken alinan kirmizi alt cizgiler
		 * 2=Run Time Error: Yazilan kod calistirdiktan sonra consolde gozuken kirmizi mesajlar.
		 *                   Java run time error gordugunde sonraki kodlar calistirilmaz. Yani 34. satirdan sonraki calismaz gibi.
		 *                   Kod calistirmaya "execution" denir
		 */
		
		
		/*
		 * 2. Method:concat metodu (concatination)
		 */
		String s2 = "Ogreten ogrenir";   //"Ali"+"Can"=AliCan==>burada + yerine concat yazilir
		//String methodlari gecici degisiklik yapar orjinal string degiismez.
	   
	    System.out.println(s2.concat(" tamam mi?"));
	    		
	    /*
	     * 3.Method:contains metodu
	     * contains() methodu boolean(true/false) return eder.  char ile calismaz
	    */
		String s3="Java ogren zengin ol";
		System.out.println(s3.contains("J")); //s3 j'yi iceriyor mu anlamindadir. Java true veya false return eder
	    System.out.println(s3.contains("Zengin")); //false verir buyuk kucuk harf duyarli
	    System.out.println(s3.contains("")); //true der.g ve r'nin arasinda hicbir sey var java hicbir sey var kabul eder true verir.
	                                         //hicbirsey string de bir karakterdir
	    System.out.println(s3.contains(" "));//space vardir o zaman true der
	    
	 
	}

}
