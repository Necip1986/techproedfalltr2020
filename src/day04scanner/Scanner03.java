package day04scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Alfabe'den bir harf gir");
		//Kullanici dan aldiginiz data type char ise asagidaki kodu yaziniz 0 ilk gordugun harfi yaz al demek
		//o birinci harf ise 1 yazarsak ikinci harfi alir.
		
		char harf = scan.next().charAt(0);
		System.out.println(harf);
		
		scan.close();
		

	}

}
