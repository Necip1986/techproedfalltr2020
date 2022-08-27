package day13whileloop;

import java.util.Scanner;

public class SlaytSorular5 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir String alın ve bu String’in ilk harfi ile son harfinin yerlerini değiştirerek
           ekrana yazdırın.
           Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str=scan.nextLine();
	
	    String input=str.charAt(str.length()-1)+str.substring(1, str.length()-1)+str.charAt(0);
	   
		System.out.println(input);
		
		scan.close();
	}
	

}
