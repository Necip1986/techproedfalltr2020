package day31exceptions;

import java.util.Scanner;

public class E07 {

	/*
	   illegalArgumentException //kurallara uymayan deger exception'i. 
	 */
	
	public static void main(String[] args) {
		
		//gercek hayatta yanlis ama java da yanlis olmayan durumlar
	//	int age = -23; //java yasi eksi yapinca kizmiyor.

		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi giriniz");
		int age = scan.nextInt();
		
		if(age<0) {
			
			throw new IllegalArgumentException(); //throw kullanilinca new kullanilmali ve parantez olmali
		
		}else {
			
			System.out.println(age);
			//throw new IllegalArgumentException();
			//throw new IllegalArgumentException(); //bu manasizdir
			//throw new ArithmeticException(); //bunu da kabul etmez usteki isi bozar manasiz olur yazmak
		
		//throw sartlara bagli atilirsa her sartta throw yazabiliriz. 
		}
		
		
		
	}

}
