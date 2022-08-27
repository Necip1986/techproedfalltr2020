package day06ifstatement;

import java.util.Scanner;

public class IfElseSoruCevap {

	public static void main(String[] args) {
		/*
		 * If Else Soru 1
		 * Kullanicidan bir tamsayi alin eger tamsayi 10'dan kucuk ve sifirdan buyuk esit ise ekrana "Rakam"
		   diger durumlarda ekrana "Sayi yazdirin.
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi girin");
		int sayi=scan.nextInt();
		if(sayi<10 && sayi>=0) {
			System.out.println("Rakam");
		}else {
			System.out.println("Sayi");
		}
	 
		/*
		 * IfElse 2. Soru
		 * Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger 3 kenar uzunlugu birbirine esit ise ekrana "Eskenar ucgen
		 * diger durumlarda ekrana " Eskenar degil" yazdirin
		 */
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		double k1=scan.nextDouble();
		double k2=scan.nextDouble();
		double k3=scan.nextDouble();
		
		if(k1==k2 && k2==k3) {
			System.out.println("Eskenar ucgen");
		}else {
			System.out.println("Eskenar degil");
		}
			
		/* IfElse 3. Soru
		 * Kullanicidan alacagi urun miktarini ve urunun birim fiyatini alin. Eger urun miktari 1000'den fazla ise
		 * kullaniciya %10 indirim yapin ve odemesi gereken toplam parayi ekrana yazdirin. Diger durumlarda odemesi gereken toplam 
		 * parayi herhangi bir indirim yapmadan ekrana yazdirin
		 */
		System.out.println("Lutfen urun miktarini giriniz");
		double u=scan.nextDouble();
		System.out.println("Lutfen urunun birim fiyatini giriniz");
		double f=scan.nextDouble();
		if(u>1000) {
			System.out.println("Odenmesi gereken tutar:"+(f-f/10)*u);
		}else {
			System.out.println("Odenmesi gereken tutar:"+f*u);
		}
		scan.close();
		}

}
