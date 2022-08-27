package day11stringmethods;

import java.util.Scanner;

public class String044 {

	public static void main(String[] args) {
		/*
        1)Kullanicidan bir String alin
        2)Tum rakamlari * a cevirin
        3)Bas ve sondaki tum space'leri silin
        4)Aralardaki tum space'leri ! isaretine cevirin
        5)a ve z harflerini buyuk harf, diger tum harfleri kucuk harf yapin
        6)En bas'a "(" ve en sona ")" ekleyin 
      */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String cumlesi giriniz");
		String s1=scan.nextLine();
		s1=s1.trim();
		s1=s1.replaceAll("\\d","*");
		s1=s1.replaceAll("\\s", "!");
		s1=s1.toLowerCase();
		s1=s1.replace('a', 'A');
		s1=s1.replace('z', 'Z');
		s1="("+s1+")";

		System.out.println(s1);
		scan.close();
	}

}
