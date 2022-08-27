package day10Stringmethods;

import java.util.Scanner;

public class SlaytSoru4 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
           If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same
           and print it on the console.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi<10) {
			System.out.println("sayinin karesi: "+sayi*sayi);
		}else if(sayi>10) {
			System.out.println("Sayinin 2 kati: "+sayi*2);
		}else {
			System.out.println("Sayi: "+sayi);
		}
		scan.close();
	}

}
