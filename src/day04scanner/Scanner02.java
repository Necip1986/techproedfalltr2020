package day04scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");  //ismi Ali Can olsun nextLine bu ismi alip name in icine atiyor
		
		//Data type String oldugu zaman nextLine metodunu kullanin
		//Data type String oldugu zaman next() methodu da kullanilabilir
		//ama next() metodu sadece ilk kelimeyi alir devamini almaz. nextLine() ise kullanicinin girdigi Stringin tamamini alir
		String name = scan.nextLine();
		
		System.out.println(name);
		
		scan.close();
		

	}

}
