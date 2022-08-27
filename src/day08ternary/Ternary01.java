package day08ternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int s=scan.nextInt();
		
		if(s>9) {System.out.println("Rakam degil");}else {System.out.println("Rakam");}
		
		String result = s>9 ? "Rakam degil" : "Rakam"; //ternary gosterimi condition true ise "Rakam degil", false ise "Rakam" ciktisini verir
		System.out.println(result);
		
		//ternary kullanmak daha rahat ama kullanilmasi sart degil. Sadece string olmaz diger data tipleri de olabilir
		
		//s>99 && s<1000 ? "3 basamakli" : s; //string ve int return eder o yuzden syso nun icine alarak cozebiliriz
		//farkli data tipi oldugunda ekrana yazdirarak sorunu cozeriz
		System.out.println(s>99 && s<1000 ? "3 basamakli" : s);
		
		scan.close();
		}
	
       
}
