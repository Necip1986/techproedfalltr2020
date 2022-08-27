package day07ifelseifternary;

import java.util.Scanner;

public class NestedIfSoru3 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan password girmesini isteyin.
		 * Girdigi password 5'e tam bolunuyorsa son rakamini kontrol edin. Son rakami 0 ise ekrana "5'e bolunebilen cift sayi"
		 * son rakami 5 ise ekrana "5'e bolunebilen tek sayi"
		 * Girdigi password 5'e bolunmuyorsa ekrana "tekrar deneyin" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen password giriniz");
		int p=scan.nextInt(); //password genelde pwd alinir
		
		if(p%5==0) {
			if(p%10==0) {
				System.out.println("5'e bolunebilen cift sayi");
			}else {
				System.out.println("5'e bolunebilen tek sayi");
			}
		}else {
			System.out.println("tekrar deneyin");
		}
		scan.close();
    }

}
