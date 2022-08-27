package day11stringmethods;

import java.util.Scanner;

public class String033 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
		 * Kullanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz
		 * Ad ve soyadin ilk harfleri buyuk ve diger harfleri kucuk olmali
		 * kimlik numarasinin son 4 rakami haric hepsi yildiz yapilmali
		 * Ornek:
		   Ali Can *******1234
          */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Lutfen soyadinizi giriniz");
		String soyad=scan.nextLine();
		System.out.println("Lutfen 11 haneli kimlik numaranizi giriniz");
		String tcno=scan.nextLine();
		
		ad=ad.trim();
		
		soyad=soyad.trim();
		
		ad=ad.substring(0, 1).toUpperCase()+ad.substring(1).toLowerCase();
	    System.out.println(ad);
		soyad=soyad.substring(0, 1).toUpperCase()+soyad.substring(1).toLowerCase();
		System.out.println(soyad);
		
		tcno=tcno.substring(0, 7).replaceAll("\\d", "*")+tcno.substring(7, 11);
		
		
		System.out.println(tcno);
		
	scan.close();

	}

}
