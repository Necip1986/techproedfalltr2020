package day08ternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 1000 den fazla ise
           Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda
           ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */


		Scanner scan=new Scanner(System.in);
		System.out.println("urun miktarini sayi olarak giriniz");
		double m=scan.nextDouble();
		System.out.println("urun fiyatini giriniz");
		double f=scan.nextDouble();
		
		double total= m>1000 ? m*0.9f : m*f;
		System.out.println(total);
		
		scan.close();
	}

}
