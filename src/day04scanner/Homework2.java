package day04scanner;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		/*
		 9.odev:kullanicidan "*" gibi bir sembol alin ekrana
		    *
		   * *
		  * * *  yazdirin
		 */
		System.out.println("bir sembol girin");
		char sembol = scan.nextLine().charAt(0);
		System.out.println(" "+" "+sembol+ " "+" ");
		System.out.println(" "+sembol+" "+sembol+" ");
		System.out.println(sembol+" "+sembol+" "+sembol);
		
		//10. Odev: kullanicidan ad ve soyadini alip ekrana yazdiran bir program giriniz
		System.out.println("adinizi ve soyadinizi giriniz");
		String name=scan.nextLine();
		System.out.println(name);
		
	scan.close();

	}

}
