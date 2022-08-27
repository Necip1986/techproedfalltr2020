package day08ternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer iki kenar uzunluğu birbirine eşit ise ekrana
           “Ikizkenar Ucgen” yazdırın. Diğer durumlarda ekrana “Ikizkenar değil” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		double k1=scan.nextDouble();
		double k2=scan.nextDouble();
		double k3=scan.nextDouble();
		
		String result= k1==k2 || k2==k3 || k1==k3 ? "ikizkenar" : "ikizkenar degil"; //parantez kullanmadan da olur
		System.out.println(result);
		
		scan.close();
	}

}
