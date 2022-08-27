package day07ifelseifternary;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A,B,C veya D yazdirin
		 * 50 den az ise D 
		 * 50(dahil) ile 60 arasi ise C
		 * 60 (dahil) ile 80 arasi ise B
		 * 80(dahil) ile 100 arasi ise A
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz");
		int not=scan.nextInt();
		
		if(not<0) {
			System.out.println("Sana not gir dedik");
		}else if(not<50) {
			System.out.println("D");
		}else if(not<60) {
			System.out.println("C");
		}else if(not<80) {
			System.out.println("B");
		}else if(not<=100) {
			System.out.println("A");
		}else {
			System.out.println("Sana not gir dedik");
		}
		scan.close();
	}

}
