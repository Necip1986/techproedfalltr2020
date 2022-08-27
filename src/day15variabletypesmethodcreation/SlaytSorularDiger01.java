package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorularDiger01 {

	public static void main(String[] args) {
		
		adsoyad("a", "b");
		buyukkucuk(1, 1);
		Toplam(1);
	}
	/*main method disinda olusturun 
	1-
	Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük
	diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
   */
	
	public static void adsoyad(String a, String b) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Soyadinizi giriniz");
		String soyad=scan.nextLine();
		System.out.print(ad.substring(0, 1).toUpperCase()+ad.substring(1, ad.length()).toLowerCase()+" ");
		System.out.println(soyad.substring(0, 1).toUpperCase()+soyad.substring(1, soyad.length()).toLowerCase());
		
		scan.close();
	}

	/*2.soru
	 * Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit" birinci sayı büyük ise ekrana
       “Birinci sayı büyük�?, ikinci sayı büyük ise ekrana “Ikinci sayı büyük�? yazdırınız
	 */
	public static void buyukkucuk(int a, int b) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 1. sayiyi giriniz");
		int bir=scan.nextInt();
		System.out.println("Lutfen ikinci sayiyi giriniz");
		int iki=scan.nextInt();
		
		if (bir>iki) {
			System.out.println("birinci sayi buyuk");
		}else if(iki>bir) {
			System.out.println("Ikinci sayi buyuk");
		}else {
			System.out.println("iki sayi esit");
		}
		scan.close();
		
	}
	/*SORU 3;
	 * Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
       yazdıran bir program yazın.
	 */
	public static void Toplam(int a) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int top=0;
		for (int i = sayi; i > 0; i/=10) {
			top=top+i%10;
		}
		System.out.println(top);
		
		scan.close();
	}

}
