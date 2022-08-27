package day08ternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 *Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
          3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
           Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tamsayi giriniz");
		int s=scan.nextInt();
		
	   String result = s>99 && s<1000 ? "3 basamakli" : (s%2==0 ? "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek");
	   System.out.println(result);
	   
	   scan.close();
	}

}
