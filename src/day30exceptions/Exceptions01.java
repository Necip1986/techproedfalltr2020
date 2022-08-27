package day30exceptions;

public class Exceptions01 {//exceptions muhtemel problemler ihtimal dahilindeki problemler

	/*
	   1-FileNotFoundException ustunde calisilacak bir dosyaya ulasma ile alakali problemlerde kullanilir.
	     Bir dosyaya ulasmada iki temel problem olablir.:a-Path yanlis olabilir. b-Dosya silinmistir.
	 
	   2-IOException Input ve Output ile alakali tum problemlerde kullanilir.(Dosyaya ulasmak input ile alakali bir problem IO bunu 
	     da halleder FileNotFoundException gerek kalmadi. IOException, FileNotFoundException'in yaptigi tum isleri yapabilir. 
	     Bu yuzden IOException kullanildiginda FileNotFoundException'in kullanilmasina gerek yoktur.IOException FileNotFoundException 
	     class'inin parent class'idir.
	   
	   3-Kod yazarken Exception kullanmak zorunda kalirsak 2 yol vardir.
	     a-add throws decleration==> bu problem olustugunda consola teknik mesajlar iceren hata mesaji basar.
	     b-try-catch block ==> Buda problem olustugunda ekrana ne yazilacagina veya problemle alakali ne yapilacagina
	                           bizim karar vermemize olanak tanir.
	 
	   4-Try-catch kullandiginizda try bolumundeki kod hatasiz calisirsa catch bolumu calismaz. 
	     Catch bolumu try bolumundeki kod hataliyken devreye girer.
	   
	   5-Try block'tan sonra 1 veya daha fazla catch kullanilabilir.Olusan problem hangi catch ile 
	     alakali ise o calisir. Ayni anda 2 catch block calismaz. Ayni anda sadece 1 catch block calisabilir.
	   
	   6-Aralarinda parent-child iliskisi olan birden fazla catch-block kullanirsaniz child olan uste yazilmalidir
	     Aksi takdirde CTE aliriz. Parent-child iliskisi yoksa istedigimiz gibi siralayabiliriz.
	 
	   7-try block'tan sonra catch block en az 1 tane kullanilmalidir. Yoksa CTE verir java.
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
