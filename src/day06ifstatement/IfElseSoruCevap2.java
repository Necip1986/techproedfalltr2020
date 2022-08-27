package day06ifstatement;

import java.util.Scanner;

public class IfElseSoruCevap2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir karakter alin eger karakter bir harf ise ekrana "Harf" yazdirin. Diger durumlarda 
		 * ekrana "Harf degil "yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Luftfen bir karakter girin");
		char ch=scan.next().charAt(0);
		
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("Harf");
		}else {
			System.out.println("Harf degil");
		}
		scan.close();
	}

}
