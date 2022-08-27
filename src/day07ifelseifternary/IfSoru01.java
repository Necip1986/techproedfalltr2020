package day07ifelseifternary;

import java.util.Scanner;

public class IfSoru01 {

	public static void main(String[] args) {
		/*
		 * 3.SORU
		 * Kullanicidan bir gun alin eger gun"Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin
		 * "Cumartesi ise ekrana "Yahudiler icin kutsal gun". "Pazar" ise ekrana "Hiristiyanlar icin kutsal gun"
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir gun ismi giriniz");
		String day=scan.next();
		
		//primitive data type lerde "==" kullanilabilir karsilastirmalarda
		//Stringlerde "==" kullanilmiyor. Onun yerine method kullaniyoruz.Stringin ismini yazin noktaya tiklayin birsuru method cikar
		//equals methodu iki stringi karsilatirir. Stringler ayni ise True farkli ise false return eder.
		//Stringlerde karsilastirmalarda equals veya equalsIgnoreCase methodlari kullanilabilr
		
		if(day.equalsIgnoreCase("Cuma")) { //java icin buyuk harf kucuk harf onemlidir. java CUMA cuma veya Cuma olarak yazilabilecegini anlamis
			                        // ve equalsignoringCase'i gelistirmis. (Buyuk harf kucuk harfi dikkate almadan (ignore) calistir
			System.out.println("Muslumanlar icin kutsaldir");
		}
		if(day.equalsIgnoreCase("cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		if(day.equalsIgnoreCase("pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
		}
		if(!(day.equalsIgnoreCase("Cuma") && !day.equalsIgnoreCase("cumartesi") && !day.equalsIgnoreCase("pazar") )) {
			System.out.println("oyle bir kutsal gun yok");
		}
		scan.close();
	}

}
