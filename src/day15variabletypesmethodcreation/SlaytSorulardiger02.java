package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorulardiger02 {

	public static void main(String[] args) {
		kelime("str");

	}
	/*
	 * Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran
       Program yazınız. Ornegin; CAN ==> C
                                         A
                                         N 
	 */
	public static void kelime(String a) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str=scan.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		scan.close();
	}

}
