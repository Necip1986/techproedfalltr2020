package day06ifstatement;

import java.util.Scanner;

public class IfSoruCevap3 {

	public static void main(String[] args) {
		
		/*
		 * 3.SORU
		 * Kullanicidan bir gun alin eger gun"Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin
		 * "Cumartesi ise ekrana "Yahudiler icin kutsal gun". "Pazar" ise ekrana "Hiristiyanlar icin kutsal gun"
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir gun giriniz");
		 String gun=scan.nextLine();
		
		if(gun=="Cuma") {
			System.out.println("Muslumanlar icin kutsal gun");
		}
		if(gun=="Cumartesi") {
			System.out.println("Yahudiler icin kutsal gun");
		}
		if(gun=="Pazar") {
			System.out.println("Hiristiyanlar icin kutsal gun");
	}

		/*
		 * 4.Soru
		 * Kullanicidan 2 sayi alin eger sayilarin isaretleri ayni ise ekrana "Ayni isaretli", isaretleri farli ise
		 * ekrana "Farkli isaretli" yazdirin 
		 */
		System.out.println("Lutfen iki sayi giriniz");
		double s1=scan.nextDouble();
		double s2=scan.nextDouble();
		if((s1>0 && s2>0) || (s1<0 && s2<0)) {
			System.out.println("Ayni isaretli");
		}else {
		//if(!(s1>0 && s2>0) && !(s1<0 && s2<0)) {
			System.out.println("Farkli isaretli");
		}
		
		/*
		 5. Soru
		 Kullanicidan bir tamsayi alin eger tamsayi 10'dan kucuk ve sifirdan buyuk esit ise ekrana "Rakam"
		 diger durumlarda ekrana "Sayi yazdirin.
		 */
		System.out.println("Lutfen bir tamsayi girin");
		int sayi=scan.nextInt();
		if(sayi<10 && sayi>=0) {
			System.out.println("Rakam");
		}else {
			System.out.println("Sayi");
		}
	 scan.close();
	}
	
}
