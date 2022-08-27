package day01variables;

import java.util.Scanner;

public class Variables01 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Necip Uysal");
		
		//Ekrana alt alta Ali01, Ali02, Ali03 yazdirin
		System.out.println("Ali01");
		System.out.println("Ali02");
		System.out.println("Ali03");
		
		//Ekrana aynı satıra Veli01, Veli02, Veli03 yazdırın
		System.out.print("Veli01 ");
		System.out.print("Veli02 ");
		System.out.println("Veli03 ");
		
		System.out.println("Antalya");
		
		System.out.println("==============");
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz\n1-Seni seviyorum\n2:Seni sevmiyorum");
		int i=scan.nextInt();
		
		if(i==1) {
			System.out.println("Ayse seni seviyor");
		}else {
			System.out.println("Ayse seni sevmiyor");
		}
//		/*
//		 Ekrana A
//		       A A
//		      A A A  yazdırın
//		 */
//		
//		System.out.println("  A  ");
//		System.out.println(" A A ");  
//		System.out.println("A A A");
//		
//		System.out.println("==============================");
//		System.out.println("ASKIM BITANEM SENI COK SEVIYORUM");
//		 
		
	}
	
}
