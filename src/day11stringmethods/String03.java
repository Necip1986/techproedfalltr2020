package day11stringmethods;

import java.util.Scanner;

public class String03 {

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
		System.out.println("Lutfen soyadinzi giriniz");
		String soyad=scan.nextLine();
		System.out.println("Lutfen 11 haneli kimlik numaranizi giriniz");
		String kn=scan.nextLine(); //string kullanmaliyiz cunku method kullanacagimiz icin string yazmaliyiz
		
		ad=ad.trim(); //yapinca atama islemi yapmis oluyorum yeni ALI eski aliyi olduruyor. boyle yapinca artik isim atama ile kalici olarak degisir
		soyad=soyad.trim();
		
		//ilk harfleri buyuk yapma ve sonraki harfleri kucuk yapma
		
		ad=ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();    //char dan sonra . koyarsam to upperCase cikmaz cunku string degil
		System.out.println(ad);                                                 //atama yapma onemli
		
		soyad=soyad.substring(0, 1).toUpperCase()+soyad.substring(1).toLowerCase();
		System.out.println(soyad);
		
		//kimlik son 4 rakami haric hepsi yildiz olacak. sondan 4. uncusu lenght-4 olur
		
		kn= "*******"+kn.substring(kn.length()-4);
		
		System.out.println(kn);
		
		scan.close();
		
	}

}
