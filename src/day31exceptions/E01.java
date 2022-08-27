package day31exceptions;

public class E01 {

	/*
	   1-ArithmeticException class'i, java da matematiksel islemler yapilirken olusabilecek hatalarda kullanilir.
	     Mesela 12'yi 0'a bolersek java Exception throw eder. Bu Exception ArithmeticException kullanilarak 
	     halledilebilir (handle edilir). Run time exception'dir
	     
	   NOTE: Java'da 2 tip exception vardir. Brisi siz kod yazarken CTE verir. digeri kirmizi alt cizgi vermez
	         CTE veren Exception'lara "Compile Tme Exception" veya "Checked Exception" denir.
	         CTE vermeyen Exception'lara "Run Time Exception" veya "Un-checked Exception" denir.
	 
	   NOTE:"Compile Time Exception'larda" ya "throws" veya "try-catch" kullanmalisiniz. Aksi takdirde code calismaz
	        Ama "run Time Exception'larda" isterseniz "throws" isterseniz "try-catch" veya isterseniz
	        hicbirsey kullanmayabilirsiniz.
	        
	        Yani Compile Time Exception'lar handle edilmelidirler. Ama "Run Time Exception'lar handle edilmese de olur.
	   
	   2-NullPointerException class'i ornegin null atamasi yapilan bir String'de length() kullanildiginda olusur.
	     Run Time Exception'dir.
	     
	   3-ArrayIndexOutOfBoundsException class'i Array'lerde olmayan bir index ile islem yapmaya calisirsak devreye girer.
	     Bunun icinde genellikle try-catch kullanilir. Run Time exceptionlarda try-cathc kullanilir genelde
	   
	   4-NumberFormatException class'i sayi formatinda olmayan bir String'i parseInt() methodu kullanarak Integer'a cevirmek 
	     istediginizde devreye girer. Bu da run time Exception'dir.
	   
	   5-ClassCastException class'i birbirine donusturulemeyen data type'lar birbirine donusturulmek istenirse devreye girer.
	     Ornegin object data type'i String data Type'ina donusturulemez. Java'ya illa donustur diye israr edersek 
	     ClassCastException aliriz. Bu da run time Exception'dir.
	   
	   6-illegalArgumentException class'i kullanilmasini istemedigimiz degerlerde programimizin hata vermesini istiyorsak devreye girer
	     mesela yas icin negatif sayilarin kullanilmasi dogru degildir. Kullanici yas icin negatif 
	     sayi kullandiginda program hata vermelidir. Bunu throw new illegalArgumentException();" kodunu yazarak temin ederiz 
	     bu da run time exception'dir.
	   
	   SORU:"throw" ile "throws" arasindaki farklar.
	        1-throws method parantezinin kapanis parantezi ile method body'nin acilis parantezi arasinda kullanilir.
	          "throw" method body'nin icinde kullanilir.
	        2-"throws" keyword'unden sonra birden fazla Exception yazilabilir.
	           fakat throw keyword'unden sonra sadece 1 tane exception yazilabilir.
	        3-throws keyword'unden sonra sadece Exception class'inin ismini yazariz. 
	          Fakat throw keyword'unden sonra Exception class'indan obje olustururuz
	        4-throws keyword'u method'un ilk satirinda sadece sadece 1 kere kullanilabilir.
	          ama throw keyword'u method body'i icinde nerede Exception atmak istersek orada istedigimiz kadar kullanabiliriz
	     
	   NOTE: catch block'lardan sonra finally block kullanilabilir. finally block'in ozelligi Exception olussa da olusmasa da calismasidir.
	         finally block cloud'da yapilan islemlerden sonra cloud ile connection'i kesmek icin kullanilir.
	         cloud ile connection yazdigimiz kod basarili bir sekilde calisirsa isimiz bittigi icin kesilmelidir. Yazdigimiz kod
	         exception atarsa cloud ile connection yine kesilmeli kod tamir edilmelidir. 
	         cloud ile connection kesilmezse fatura pahali olabilir     
	        
	   
	   
	   
	     
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
