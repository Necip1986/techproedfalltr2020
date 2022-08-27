package day10Stringmethods;

import java.util.Scanner;

public class SlaytSoru2 {

	public static void main(String[] args) {
		// Ask user to enter a String and output will be the number of the characters in the String

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String s=scan.nextLine();
		System.out.println("Girdiginiz String'in karakter sayisi: "+s.length());
		
		scan.close();
	}
	
	

}
