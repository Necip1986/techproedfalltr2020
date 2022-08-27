package day15variabletypesmethodcreation;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir string alin bu stringin icinde kac tane harf, kac tane rakam ve kac tane 
		 * harf ve rakam disi karakter oldugunu gosteren programi yaziniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String s=scan.nextLine().toLowerCase(); //hepsini kucuk harf yazinca buyuk harf kontrol etmeye gerek kalmadi
		
		int harfCounter=0; //string de kac tane harf var onu sayacam onun icin basta bir counter olusturuyorum
		int rakamCounter=0; //kac rakam var onu sayacak
		int digerCounter=0; //rakam ve harf disi karakterleri sayacak
		int k=0; //String in karakterlerinin indexini kullanicam
		
		do {
			
			if (s.charAt(k)>='a'&&s.charAt(k)<='z') { //ustte tolowercase yapinca buyuk harf kontrole gerek kalmadi
				harfCounter++;
			}else if (s.charAt(k)>='0'&&s.charAt(k)<='9') { //tek karakterli hersey charlar ile kontrol edilebilir
				rakamCounter++;
			}else {
				digerCounter++;
			}
			k++; 
		} while (k<s.length());

		System.out.println("Harf sayisi: "+harfCounter);
		System.out.println("Rakam sayisi: "+rakamCounter);
		System.out.println("Diger karakter sayisi: "+digerCounter);
		
	    scan.close();
	}

}
