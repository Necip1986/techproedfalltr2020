package day06ifstatement;

import java.util.Scanner;

public class Ifstatement02 {

	public static void main(String[] args) {
		/*
		 *Kullanicidan bir sayi alin bu sayi cift  ise console cift, tek ise console tek yazdirtin
		 *
		 */

		Scanner scan=new Scanner(System.in);
		/*System.out.println("Luften bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi%2==1) {   //sayi!=0 olarak ta girilebilir. esit degildir daha uygundur
			System.out.println("sayi tek sayidir");
		}
		 
		if(sayi%2==0) {
			System.out.println("sayi cift sayidir");
		}
		*/
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		if(sayi%2==0) {
			System.out.println("cift sayi");
		}
		if(sayi%2!=0) {
			System.out.println("tek sayi");
		}
		scan.close();
		
	}

}
