package day08ternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
            Diğer durumlarda ekrana “Negatif degil” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int s=scan.nextInt();
		
		System.out.println(s<0 ? "Negatif" : "Negatif degil");
		//veya String a = s<0 ? "Negatif" : "Negatif Degil"  yazabiliriz
		scan.close();
	}

}
