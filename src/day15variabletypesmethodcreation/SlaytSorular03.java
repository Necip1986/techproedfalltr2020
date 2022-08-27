package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorular03 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana “Kare oluşturdunuz�? yazdırın.
           Eşit değilse tekrar iki sayı girmesini söyleyin.
		 */
		Scanner scan=new Scanner(System.in);
		int s1=0;
		int s2=0;
		
		do {
			System.out.println("Lutfen iki tamsayi giriniz");
			s1=scan.nextInt();
			s2=scan.nextInt();
			
		}while(s1!=s2);
		System.out.println("Kare olusturdunuz");

		scan.close();
		
	}

}
