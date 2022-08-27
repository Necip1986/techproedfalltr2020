package day12forloop;

import java.util.Scanner;

public class Forloop03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sayi alin o sayidan kucuk ve esit olan tum pozitif tek sayilari buyukten kucuge dogru ayni satrda aralarina bosluk
		 * birakarak yazdirin
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi<1) {
			System.out.println("Pozitif tamsayi giriniz");
		}else {
			
		for(int i=sayi; i>=1; i--) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		scan.close();
		}
		
	}

}
