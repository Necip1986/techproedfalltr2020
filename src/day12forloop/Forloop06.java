package day12forloop;

import java.util.Scanner;

public class Forloop06 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degerinden bitis degerine
		 * kadar tum tamsayilarin toplamini ekrana yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic degerini giriniz");
		int bas=scan.nextInt();
		System.out.println("Lutfen bitis degerini giriniz");
		int bit=scan.nextInt();
		
		int toplam=0;
		if(bas>bit) {
			System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
		}
		
		for(int i=bas; i<=bit; i++) {
			 toplam=toplam+i;
			
		}
		System.out.println("Toplam: "+toplam);
		
		scan.close();
	}

}
