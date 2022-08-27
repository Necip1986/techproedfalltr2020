package day09switchstringmethods;

import java.util.Scanner;

public class SwitchSlaytSoru5 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın.
           A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
           Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen A, B, C, D harflerinden birini giriniz");
	    char harf=scan.next().toLowerCase().charAt(0);
	    
	    switch(harf) {
	        case 'c':
	    	         System.out.println("Dogru cevap");
	    	         break;
	        case 'd':
	        case 'a':
	        case 'b':
   	                 System.out.println("Yanlis cevap");
   	                 break;  
   	        default:
   	        	     System.out.println("Gecersiz cevap sikki");
   	        	     
   	        	     scan.close();
	    	         
	    	         
	    	
	    }
		
		
		
	}

}
