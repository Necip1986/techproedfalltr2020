package day09switchstringmethods;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		/*
		 * Kullanici ay ismini girdiginde o ayin kac cektigini ekrana yazan bir program yaziniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir ay ismi giriniz");
		String ay=scan.next().toLowerCase();
		
		switch(ay) {
		case "aralik":
		case "ekim":
		case "agustos":
		case "temmuz":
		case "mayis":
		case "mart":
		case "ocak":
	         System.out.println(31);
	         break;
	    case "subat":
	         System.out.println("28 veya 29");
	         break;
	    case "kasim":
	    case "eylul": 
	    case "haziran":    
	    case "nisan":
	         System.out.println(30);
	         break;
	    default:
	         System.out.println("Gecerli bir ay ismi giriniz");
			
			
		scan.close();	
			
		}

	}

}
