package day37collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList01 {

	public static void main(String[] args) {
		
		/*
		   Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olustrun
		   Kullanicidan bir isim alin bu isim LinkedList'e varsa silin ve kullanicya
		   "Bu isim LinkedList'te vardi ve silindi" diye mesaj verin
		   Bu isim LinkedList'te yoksa "Bu isim LinkedList'te yok bu yuzden silinmedi"
		   yazdirin
		 */
		LinkedList<String>ll1 = new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Can");
		ll1.add("Ayse");
		System.out.println(ll1);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = scan.nextLine();
		
//		if(ll1.contains(isim)) {
//			ll1.remove(isim);
//			System.out.println("Bu isim LinkedList'te vardi ve silindi");
//			System.out.println(ll1);
//		}else {
//			System.out.println("Bu isim LinkedList'te yok bu yuzden silinmedi");
//		}
		
		if(ll1.remove(isim)) {
			System.out.println("Bu isim LinkedList'te vardi ve silindi");
		    System.out.println(ll1);
		}else {
			System.out.println("Bu isim LinkedList'te yok bu yuzden silinmedi");
			System.out.println(ll1);
		}
		//LinkedList<String>ll1 = {"Ali", "Veli", "Can", "Ayse"};
		
		scan.close();

	}

}
