package day22listforeachloop;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSoru02 {

	public static void main(String[] args) {

		/*
		   Kullanicidan tam ismini alin.
		   Ismin harflerini bir list'e ekleyin 
		   Harfleri alfabetik sirada buyuk harfler olarak yazin
		   Harfleri alfabetik siranin tersinde buyuk harfler olarak yazin
		 
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		String str=scan.nextLine().toUpperCase().replaceAll(" ", "");
		/*
		String arr[]=str.split("");
		System.out.println(Arrays.toString(arr));
		List<String>list=Arrays.asList(arr);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		*/
		
		//ismin harflerini var olan sirada yazdirma
		List<Character>harfler=new ArrayList<>();
		
		for (int i = 0; i < str.length(); i++) {
			harfler.add(str.charAt(i));
		}
		System.out.println(harfler);
		//alfabetik siralama
		Collections.sort(harfler);
		System.out.println(harfler);
		
		//alfabetik siralamanin tersi
		//1.yol
		List<Character>harflerTers = new ArrayList<>(); //temp bir list olusturuyorum
		for (int i = harfler.size()-1; i >= 0; i--) {
			harflerTers.add(harfler.get(i));
		}
		System.out.println(harflerTers);

		//2. yol Collection da reverse metodu
		Collections.reverse(harfler);
		System.out.println(harfler);
		
		scan.close();
	}

}
