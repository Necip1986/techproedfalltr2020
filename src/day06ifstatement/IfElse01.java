package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// if it rains I will go to Mall else I will go to picnic


		Scanner scan=new Scanner(System.in);
		System.out.println("bir integer giriniz");
		int a=scan.nextInt();
		
		// if else sadece bir tane condition icerir. ikili if ise iki tane condition icerir. 
		//Java her conditionu kontrol etmek zorundadir. iki conditionu kontrol etmek daha uzun zaman gerektirir buda java'yi yavaslatir
		
		if(a>=0) {
		System.out.println("Negatif degil");	//ikisi birlikte calismaz. ya biri olur ya digeri
		}else {
			System.out.println("Negatif");
		}
System.out.println("=========");
		if(a>=0) {
			System.out.println("Negatif degil");	//ikisi birlikte calismaz. ya biri olur ya digeri
			}		
	     if(a<0) {
	    	 System.out.println("Negatif");
	     }
	    	
	     
	     System.out.println('a'+"");
	     //if else if if den daha iyidir.
	     
	     //curly brace kullanmamak risklidir. ama kullanmamakta olur o zaman bir satir girilebilir.
	     //if else curly brace kullanmadan kullanmayin
	     scan.close();
}


}