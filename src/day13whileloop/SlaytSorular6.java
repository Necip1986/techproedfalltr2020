package day13whileloop;

import java.util.Scanner;

public class SlaytSorular6 {

	public static void main(String[] args) {
		/* 3.soru
		 * Kullanıcıdan bir String alın ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
           indexini ekrana yazdırın. “a” harfi yoksa ekrana “a harfi yok” yazdırın.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz");
		String str=scan.nextLine();
		int index=str.indexOf('a');
		
		if(index==-1) {
			System.out.println("a harfi yok");
		}else {
			System.out.println(index);
		}
		
		scan.close();

	}

}
