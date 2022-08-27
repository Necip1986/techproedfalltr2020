package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorular01 {

	public static void main(String[] args) {
		/*Do While ile cozunuz
		 * 1. Soru
		 * 9 den 190 e kadar 7 nin kati olan tüm tamsayıları ekrana yazdırınız.
		 */

		int i=9;
		do {
		if (i%7==0) {
			System.out.print(i+" ");
		}
			i++;
		} while (i<=190);
		
		/*
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		 */
		System.out.println("======");
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic ve bitis degerlerini giriniz");
		int bas=scan.nextInt();
		int bit=scan.nextInt();
		
		do {
			if(bas%4==0&&bas%6==0) {
				System.out.print(bas+" ");
			}
			bas++;
		}while(bas<=bit);
		
		scan.close();
   }

}
