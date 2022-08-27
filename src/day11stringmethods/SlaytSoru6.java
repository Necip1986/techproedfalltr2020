package day11stringmethods;

import java.util.Scanner;

public class SlaytSoru6 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
           büyük harf olarak ekrana yazdırın. 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasadiginiz ulkeyi giriniz");
		String ulke=scan.nextLine();
		
		ulke=ulke.toUpperCase();
		ulke=ulke.substring(1,2)+ulke.substring(ulke.length()-2,ulke.length()-1);
		System.out.println(ulke);
	

		scan.close();
	}

}
