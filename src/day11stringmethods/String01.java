package day11stringmethods;

public class String01 {

	public static void main(String[] args) {
		/*
		 * 15. Method:substring onemlidir. cok kullanilir
		 */

		String s1="Java OOP language oldugu icin populerdir";
		s1.substring(3); //java 3'u baslangic index i olarak gorur kalan kismi ekrana yazdirir.
		System.out.println(s1.substring(3));
		
		System.out.println(s1.substring(5));
		System.out.println(s1); //tamamini ekrana yazdirmak icin
		System.out.println(s1.substring(0)); 
		
		System.out.println(s1.substring(s1.length()-1)); //son karakteri ekrana yazdirir. length yazmak dinamik kod yazmaktir. 19. karakter deseydik degisirdi
		
		s1.substring(9, 17);
		System.out.println(s1.substring(9, 17)); //ifadesinde index 9 dahil index 17 harictir.
		
		s1.substring(0, 1);
		System.out.println(s1.substring(0, 1)); //substring(0,1) ve charAt() ilk harfi verir
		                                        //substring(0,1) == charAt() olmaz esit degildir. birinin data tipi char digeri string'dir.
		                                        //substring(0,1) String return eder ama charAt() char return eder.
		s1.substring(5, 5);
		System.out.println(s1.substring(5, 5)); //index ler esit ise hicbirsey alirsiniz 5 dahil 5 haric. java son soyleneni yapar 
		
		
		//ONEMLI
		//s1.substring(5, 2);
		//System.out.println(s1.substring(5, 2)); //araligin disinda run time error verir
		                                        //substring metodunda baslangic index i bitis indexinden buyuk olamaz
		
		/*
		 * 16.Method: trim metosu==kirpmak tras etmek saclarin uclari duzeltme rtusleme gibi anlamlara gelir. Bu method da cok kullanilir.
		 * bir string in bas ve sonundaki space leri siler. String in icindeki space leri silmez
		 */
		
		String s2="      Java ogrenen diger dilleri cabucak ogrenir";
		s2.trim();//a dama soyle denir ismini gir adam ALI yazmasi gerekir adam bosluk birakip ....ALI... yazar java spaceleri karakter olarak gorur
		            //biz adamin hatalasinin onune gecmek icin kullanilir. Yani ismin onundeki ve sonundaki space leri iptal eder. Sadece spaceleri iptal eder
		System.out.println("Trim kullanmadan once: "+s2);
		System.out.println("Trim kullandiktan sonra: "+s2.trim());
		
		
		
		
		
	}

}
