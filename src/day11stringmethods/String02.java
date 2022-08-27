package day11stringmethods;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan passwordunu aliniz. passwordun ilk karakteri buyuk harf olacak
		 * son karakteri sayi olacak.
		 * en az 6 karakter uzunlugunda olacak. 
		 * bu sartlari sagliyorsa ekrana "Password basariyla olusturuldu" yazdirsin
		 * bu sartlardan herhangi birini saglamiyorsa "Tekrar deneyiniz" yazsin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen password giriniz (ilk karakter buyuk harf, son karakter sayi ve 6 karakter uzunlugunda olmali)");
		String pwd=scan.nextLine();
		
		
		char ilk=pwd.charAt(0);
		char son=pwd.charAt(pwd.length()-1);
		int sayi=pwd.length();
		
		if((ilk>='A'&& ilk<='Z') && (son>='0' && son<='9') && (sayi>5)) {
			System.out.println("Password basariyla olusturuldu");
		}else {
			System.out.println("Tekrar deneyin");
		}
		
		if((pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') && (pwd.charAt(pwd.length()-1)>='0') && (pwd.charAt(pwd.length()-1)<='9') && pwd.length()>5) {
			System.out.println("Password basariyla olusturuldu");
		}else {
			System.out.println("Tekrar deneyin");
			
			scan.close();
		}
	}

}
