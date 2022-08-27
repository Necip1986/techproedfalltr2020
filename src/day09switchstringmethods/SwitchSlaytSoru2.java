package day09switchstringmethods;

import java.util.Scanner;

public class SwitchSlaytSoru2 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
           “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
           Bu harflerin dışında bir character için “Geçersiz character” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char ch=scan.next().toLowerCase().charAt(0);
		
		
		switch(ch) {
		    case 'a':
		    case 'e':
		    case 'i':
		    case 'o':
		    case 'u':
			    System.out.println("Sesli harf");
			    break;
		    case 'b':
		    case 'c':
		    case 'd':
		    case 'f':
			    System.out.println("Sessiz harf");
			    break;
		    default:
			    System.out.println("Gecersiz karakter");
		
			    


			    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			    	System.out.println("sesli harf");
			    }else if(ch=='b'||ch=='c'||ch=='d'||ch=='f') {
			    	System.out.println("sessiz harf");
			    }else {
			    	System.out.println("gecersiz karakter");
			    }
			    
		scan.close();
		
		
		}
		
		
	}

}
