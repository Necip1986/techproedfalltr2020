package day07ifelseifternary;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir tamsayi alin
		 * eger tam sayi 0'dan kucuk ise ekrana"negatif"
		 * 0 ise ekrana "notr"
		 * 0'dan buyuk ise "pozitif" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		double d=scan.nextDouble();
		
		if(d<0) {
			System.out.println("negatif");
		}else if(d==0) {
			System.out.println("notr");
		}else {
			System.out.println("pozitif");
		}
		scan.close();
	}

}
