package day06ifstatement;

import java.util.Scanner;

public class IfSoruCevap {

	public static void main(String[] args) {
		/*
		 * 1.SORU
		 * Kullanicidan bir tamsayi alin eger bu tamsayi 3 ile bolunebiliyorsa ekrana "3'un kati",
		 * 3 ile bolunemiyorsa ekrana "3'un kati degil" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi%3==0) {
			System.out.println("3'un kati");
		}
		if(sayi%3!=0) {
			System.out.println("3'un kati degil");
		}
			/*
			 * 3.SORU
			 * Kullanicidan bir gun alin eger gun"Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin
			 * "Cumartesi ise ekrana "Yahudiler icin kutsal gun". "Pazar" ise ekrana "Hiristiyanlar icin kutsal gun"
			 */
	
		System.out.println("Lutfen bir gun giriniz");
		String gun=scan.nextLine();
		;
		if(gun.equals("Cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		}
		if(gun.equals("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		if(gun.equals("Pazar")) {
			System.out.println("Hiristiyanlar icin kutsal gun");
		}
		scan.close();
	}
	
}
