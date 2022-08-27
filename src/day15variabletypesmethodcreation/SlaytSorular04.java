package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorular04 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya bir String girmesini söyleyin ve bu String’in ilk harfi ile son harfi aynı ise
           ekrana “Simetrik�? yazdırın. Aynı değilse tekrar bir String girmesini isteyin
		 */
		Scanner scan=new Scanner(System.in);
		
		
		String ilk="";
		String son="";
		
		do {
			System.out.println("Lutfen bir string giriniz");
			String kelime=scan.nextLine().toLowerCase();
			ilk=kelime.substring(0, 1);
			son=kelime.substring(kelime.length()-1);
		} while (!(ilk.equals(son)));
		System.out.println("Simetrik");
		
		scan.close();
		
		
	}

}
