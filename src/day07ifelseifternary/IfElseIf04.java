package day07ifelseifternary;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir yıl alın eğer yıl 1000’e tam bulunuyorsa ekrana “Milenyum” yazdırın.
           Eğer yıl 100’e tam bulunuyorsa ekrana “Yüzyıl” yazdırın.
           Eğer yıl 10’a tam bulunuyorsa ekrana “Onyıl” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int yil=scan.nextInt();
		
		
		//if else lerde sorunun mantigina gore baslamak lazim. Sorunun metnine gore degil mantigina gore yazmak lazim. bu soruda 
		//basta onyil ile baslasaydik 2000'e onyil derdi. Birde kullanicinin yapabilecegi gicikliklari cozmek gerekli
		
		if(yil<=0) {
			System.out.println("Negatif veya sifir yil olarak kabul edilmez");
		}else if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("Yuzyil");
		}else if(yil%10==0) {
			System.out.println("onyil");
		}else {
			System.out.println("Hicbiri degil");
		}
		scan.close();
		
		
	}

}
