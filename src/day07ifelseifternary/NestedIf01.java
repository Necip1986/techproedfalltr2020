package day07ifelseifternary;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 * Nested If: Ic ice girmis "If Statement" lar
		 * 
		 * Kullanicidan bir sayi alin. Eger sayi pozitif ise 10'dan buyuk olup olmadigini kontrol edin eger 10'dan buyuk ise "Buyuksun!"
		 * yazdirin eger 10'dan kucuk ise "Normalsin!" yazdirin
		 * 
		 *  Eger sayi pozitif degil ise -10'dan buyuk olup olmadigini kontrol edin
		 *  eger -10 dan buyuk ise "Negatifsin!"
		 *  eger -10 dan kucuk ise "Cok Negatifsin" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi girin");
		int s=scan.nextInt();
		 
		//icerdeki if e inner if disardakine outer denir
		
		if(s>0) {
			if(s>10) {
				System.out.println("Buyuksun!");
			}else {
				System.out.println("Normalsin!");
			}
		}else {
			if(s>-10) {
				System.out.println("Negatifsin!");
			}else {
				System.out.println("Cok negatifsin!");
			}
		}
		scan.close();
	}

}
