package day13whileloop;

import java.util.Scanner;

public class SlaytSorular4 {

	public static void main(String[] args) {
		/*Soru 4
		 * Kullanıcıdan uzunluğu çift sayı olan bir String alın ve bu String’in ilk yarısını ekrana yazdırın.
           Ornegin; Kullanıcı “Hollanda” girerse ekrana “Holl” yazdıracaksınız.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Uzunlugu cift sayi olan bir string giriniz");
		String str=scan.nextLine();
		int s=str.length();
		str=str.substring(0, s/2);
		if(s%2==0) {
		System.out.println(str);
		}else {
			System.out.println("string uzunlugu cift sayi olmali");
		}
		scan.close();
	}

}
