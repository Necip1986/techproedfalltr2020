package day09switchstringmethods;

import java.util.Scanner;

public class SwitchSlaytSoru1 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
           “Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın. “Pazar” ise ekrana
           “Hıristiyanlar için kutsal gün” yazdırın. Diler günler icin “Kutsal gün değil” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz");
		String gun=scan.nextLine().toLowerCase(); //toLowerCase yapinca case'lerde buyuk harf kullanilinca dogru calismiyor
		                                          //kucuk harflerle yazilinca dogru calisiyor
		
		switch(gun) {
		    case "cuma":
			      System.out.println("Muslumanlar icin kutsal gun");
			      break;
		    case "cumartesi":
			      System.out.println("Yahudiler icin kutsal gun");
			      break;    
		    case "pazar":
			      System.out.println("Hristiyanlar icin kutsal gun");
			      break;  
			default:
				  System.out.println("Kutsal gun degil");
				  
				  scan.close();
			      
		}
	}

}
