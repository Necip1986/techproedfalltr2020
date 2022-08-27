package day06ifstatement;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir karakter aliniz.
		 Bu karakter harf ise consola "harf" yazdirin
		 Bu karakter harf degil ise "Harf degil yazdirin"
		 */

		Scanner scan=new Scanner(System.in);
		/*System.out.println("Lutfen bir karakter giriniz");
		char ch=scan.next().charAt(0);
		
		if(ch>='A' && ch<='z') {
			System.out.println("harf");
		}else {
			System.out.println("harf degil");
		}
		
		scan.close();
		*/
		System.out.println("lutfen bir karakter giriniz");
		char ch=scan.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("harf");
		} else {
			System.out.println("harf degil");
		}
		scan.close();
		
		
		
		
		
		
		
	}

}
