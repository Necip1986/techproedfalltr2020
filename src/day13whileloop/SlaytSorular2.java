package day13whileloop;

import java.util.Scanner;

public class SlaytSorular2 {

	public static void main(String[] args) {
		/*7.soru
		 * Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu ekrana yazdırın.
           Kullanıcının hata yapmadığını farz edin.
           Ornegin kullanıcı 3 girerse;
           3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int r=scan.nextInt();
		
		int bas=1;
		while(bas<=10) {
			System.out.print(r+"x"+bas+"="+r*bas+"  ");
			bas++;
		}
		scan.close();
		
		System.out.println("==");
		/*Soru 1: for loop ve while loop kullanarak yapiniz
		 * 8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		 */
		for(int i=8; i<=180; i++) {
			if(i%5==0) {
			System.out.print(i+" ");
			}
		}

		System.out.println("===");
		int ba=8;
		while(ba<=180) {
			if(ba%5==0) {
				System.out.print(ba+" ");
			}
			ba++;
		}
			
	}

}
