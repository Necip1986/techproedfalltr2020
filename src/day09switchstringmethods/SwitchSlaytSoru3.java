package day09switchstringmethods;

import java.util.Scanner;

public class SwitchSlaytSoru3 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın.
           99 ise ekrana “İki basamaklı en büyük sayı” yazdırın.
           999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
           Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi) {
		    case 9:
			     System.out.println("Bir basamakli en buyuk sayi");
			     break;
		    case 99:
			     System.out.println("Iki basamakli en buyuk sayi");
			     break;
		    case 999:
			     System.out.println("Uc basamakli en buyuk sayi");
			     break;
		    default:
			     System.out.println("Yorum yok");
			     
		scan.close();
		
		
		}
		
		
	}

}
