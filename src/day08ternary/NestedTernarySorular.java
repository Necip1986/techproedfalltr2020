package day08ternary;

import java.util.Scanner;

public class NestedTernarySorular {

	public static void main(String[] args) {
		/* 1.Soru
		 *  Kullanıcıdan bir tamsayı girmesini isteyin, tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek”
            yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		String sonuc=sayi%2==0 ? "Cift":"Tek";
		System.out.println(sonuc);
		
		/*
		 * 2.Soru
		 * Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		 */
		System.out.println("Lutfen 2 tamsayi giriniz");
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		
		int input=s1>=s2?s1:s1>=s1?s2:s2;
		System.out.println(input);
		
		/*3.soru
		 * Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın.
		 */
		System.out.println("Bir tamsayi giriniz");
		int s=scan.nextInt();
		
		int mutlakdeger=s>0?s:-s;
		System.out.println(mutlakdeger);
		
		/*4.soru
		 * Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin. En ve boy eşit ise ekrana “Kare”
           farklı ise ekrana “Dikdörtgen” yazdırın.
		 */
		
		System.out.println("Dikdortgenin en ve boyunu giriniz");
		double en=scan.nextDouble();
		double boy=scan.nextDouble();
		
		String veri=en==boy?"kare":"dikdortgen";
		System.out.println(veri);
		
		/*5.soru
		 * Kullanıcıdan bir tamsayı girmesini isteyin, o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
           3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
           Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
		 */
		System.out.println("bir tamsayi giriniz");
		int b=scan.nextInt();
		String b1=b>99&&b<1000?"3 basamakli":b%2==0?"3 basamakli olmayan cift sayi":"3 basamakli olmayan tek sayi";
		System.out.println(b1);
		
		/*
		 * Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil”
           yazdırın. 100 e bolunenlerden 400 e bolunenler ve 100 e bolunmeyenlerden 4 e bolunenler
		 */
		System.out.println("bir yil giriniz");
		int yil=scan.nextInt();
		
		String artik=yil%100==0?yil%400==0?"artik yil":"artik yil degil":yil%4==0?"artik yil":"artik yil degil";
		System.out.println(artik);
		
		scan.close();
	}

}
