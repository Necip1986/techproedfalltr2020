package day11stringmethods;

import java.util.Scanner;

public class SlaytSorular2 {

	public static void main(String[] args) {
		/*4.soru
		 * Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise
           ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın. 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasadiginiz ulkeyi giriniz");
		String ulke=scan.nextLine();
		ulke=ulke.toLowerCase();
		
		if(ulke.equalsIgnoreCase("amerika")) {
			System.out.println(ulke.replace("amerika", "USA"));
		}else if(ulke.equalsIgnoreCase("ingiltere")) {
			System.out.println(ulke.replace("ingiltere", "UK"));
		}else if(ulke.equalsIgnoreCase("almanya")) {
			System.out.println(ulke.replace("almanya", "DE"));
		}else {
			System.out.println("NA");
		}
		
		scan.close();
		
		
	}

}
