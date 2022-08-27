package day11stringmethods;

import java.util.Scanner;

public class String022 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan passwordunu aliniz. passwordun ilk karakteri buyuk harf olacak
		 * son karakteri sayi olacak.
		 * en az 6 karakter uzunlugunda olacak. 
		 * bu sartlari sagliyorsa ekrana "Password basariyla olusturuldu" yazdirsin
		 * bu sartlardan herhangi birini saglamiyorsa "Tekrar deneyiniz" yazsin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen password giriniz\n6 karakter uzunlugunda, ilk karakteri buyuk harf ve son karakteri sayi olmali");
		String pwd=scan.nextLine();
		int uzun=pwd.length();
		char ilk=pwd.charAt(0);
		char son=pwd.charAt(pwd.length()-1);
		if(uzun>5 && (ilk>='A'&&ilk<='Z') && (son>='0'&&son<='9')) {
			System.out.println("Password basariyla olusturuldu");
		}else {
			System.out.println("Tekrar deneyiniz");
		}
		scan.close();
	}

}
