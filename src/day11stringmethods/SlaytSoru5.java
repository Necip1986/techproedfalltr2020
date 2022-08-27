package day11stringmethods;

import java.util.Scanner;

public class SlaytSoru5 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın. 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasadiginiz ulkeyi giriniz");
		String ulke=scan.nextLine();
		ulke=ulke.substring(0, 2).toUpperCase();
		System.out.println(ulke);
		
		scan.close();
	}

}
