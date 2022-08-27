package day06ifstatement;

import java.util.Scanner;

public class IfSoru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Bir gun giriniz");
		 
		String day = scan.nextLine();
		
		if(day.equals("Cuma")) {
			System.out.println("Muslumanlar icin kutsal gun");
		}
		
		if(day.equals("Cumartesi")) {
			System.out.println("Yahudiler icin kutsal gun");
		}
		
		if(day.equals("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");

	}
		scan.close();
	}
}
