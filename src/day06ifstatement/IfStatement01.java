package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
		/*
		 If it rains I will cancel picnic
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("iki sayi giriniz");
		double a=scan.nextDouble(); 
		double b=scan.nextDouble(); 
		
		//java da if cumlesi
		if(a>b) {  //eger bu true olursa asagidakini ekranda gosterir. false olursa gostermez. parantezin icine condition denir.
			       //if condition denirse parantezin ici curly brace icine if body denir.
			System.out.println("ilk sayi buyuk");
		}
		if(a<b) {
			System.out.println("ikinci sayi buyuk");
		}
		
		if(a==b) {
			System.out.println("iki sayi birbirine esit");
		}
		
	scan.close();
	}
	
	

}
