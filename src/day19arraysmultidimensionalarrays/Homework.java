package day19arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/*
		 * bir stringde kullanilan tum harflerin sayisini gosteren kodu yaziniz
		   Alaaddin ==> A=1, l=1, a=3, d=2, i=1, n=1
          */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str=scan.nextLine();
		
		String harf[]=str.replaceAll("\\W", "").replaceAll("\\d", "").split(""); //sadece harflerin split edilmesi
		System.out.println(Arrays.toString(harf));
	
		int counter=0;
		for (char i = 'A' ; i <= 'z'; i++) {
			for (int j = 0; j < harf.length; j++) {
				
				if (harf[j].charAt(0)==i) {
					counter++;	
				}
			}
			if (counter!=0) {
				System.out.print(i+"="+counter+" ,");
			}
			counter=0;
		}
		
		scan.close();

	}
		/*
		
		String word4[]=s.split("");
		int counter=0;
		
		for (int i = 0; i < word4.length; i++) {
			if (word4[i].equals("a")) {
				counter++;
			}
		}
			//Arrays.sort(harf);
		System.out.println("Sorulan karakterin sayisi: "+counter);
		String s="34ahgvdgf654?;,./";
		System.out.println(s.replaceAll("\\W", "").replaceAll("\\d", ""));
		*/
}


