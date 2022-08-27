package day08ternary;

import java.util.Scanner;

public class TernarySlaytSorular {

	public static void main(String[] args) {
		/*Soru 1: 
		 *Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
		Diğer durumlarda ekrana “Negatif degil” yazdırın.
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		String input=sayi<0 ? "Negatif" : "Negatif Degil";
		System.out.println(input);

		/*Soru 2
		 * Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer iki kenar uzunluğu birbirine eşit ise ekrana
           “Ikizkenar Ucgen” yazdırın. Diğer durumlarda ekrana “Ikizkenar değil” yazdırın.
		 */
		System.out.println("Ucgenin kenar uzunluklarini giriniz");
		double k1=scan.nextDouble();
		double k2=scan.nextDouble();
		double k3=scan.nextDouble();
		
		String sonuc=k1==k2||k1==k3||k2==k3?"Ikizkenar ucgen":"Ikizkenar degil";
		System.out.println(sonuc);
		
		/*Soru 3
		 * Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
           Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
           ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */
		System.out.println("urun miktarini giriniz");
		int m=scan.nextInt();
		System.out.println("Urun fiyatini girin");
		double f=scan.nextDouble();
		
		double total=m>100?(f-f/10)*m:f*m;
		System.out.println(total);
		
		/*
		 * Kullanıcıdan bir harf alın eğer harf büyük harf ise ekrana “Büyük harf” yazdırın.
           Diğer durumlarda ekrana “Büyük harf degil” yazdırın.
		 */
		System.out.println("Lutfen bir harf giriniz");
		char ch=scan.next().charAt(0);
		
		String veri=ch>='A'&&ch<='Z'?"Buyuk harf":"Buyuk harf degil";
		System.out.println(veri);
		
		scan.close();
		
		
		
		
	}

}
