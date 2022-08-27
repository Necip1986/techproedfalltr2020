package day04scanner;

import java.util.Scanner;  //java nin kutuphanesinden alindi

public class Scanner01 {

	public static void main(String[] args) {
		
		//Kullanicidan data almak icin;
		//1.step : Scanner class indan object urettik
		//java da object new keywordu ile uretilir. "new Scanner(System.in)" class constructor denir. "in" sistemin icine data sok demek
		// scanner java nin util kutuphanesinden import edilmeli yoksa error verir.
		Scanner scan = new Scanner(System.in);
		
		//2.step: Kullaniciya mesaj ver
		System.out.println("Yasinizi giriniz");  //kullanici 23 verirse nextInt() 23 u kapar age variable degeri 23 olur
		
		//3. step: Kullanicinin verdigi datayi saklamak icin bir variable olusturun
		
		int age = scan.nextInt();
		
		System.out.println(age);
		
		scan.close();
		
		
		
		
		
		

	}

}
