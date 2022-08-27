package day12forloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan baslangic ve bitis degerini alin ve baslangic degeri ile baslayan ve bitis ile biten bir seri yazin
		 * 10 ve 15 verirse 10 11 12 13 14 15 yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic degerini girniz");
		int s1=scan.nextInt();
		System.out.println("Lutfen bitis degerini giriniz");
		int s2=scan.nextInt();
		
		if(s1>s2) {
			System.out.println("baslangic degeri bitis degerinden kucuk olmali");
		}
		for(int i=s1; i<=s2; i++) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
