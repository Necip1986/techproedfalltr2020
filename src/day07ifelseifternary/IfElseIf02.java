package day07ifelseifternary;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
           “Eşkenar üçgen” yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen”
            yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın”
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenarlarini giriniz");
		double k1=scan.nextDouble();
		double k2=scan.nextDouble();
		double k3=scan.nextDouble();
		
		/* benim yaptigim 
		 if(k1==k2 && k2==k3) {
		 
			System.out.println("eskenar ucgen");
			
		}else if(k1!=k2 && k2!=k3 && k1!=k3) {
			System.out.println("cesitkenar ucgen");
		}else {
			System.out.println("ikizkenar ucgen");
		}
		*/
		 
		if(k1==k2 && k2==k3) {
			System.out.println("eskenar ucgen");
		}else if(k1==k2 || k2==k3 || k1==k3) {
			System.out.println("ikizkenar ucgen");
		}else {
			System.out.println("cesitkenar ucgen");
		}
		scan.close();
		
	}

}
