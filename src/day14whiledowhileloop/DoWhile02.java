package day14whiledowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sayi aliniz
		 * sayi 10'dan kucuk ise ekrana "Kazandiniz!" yazdirin
		 * sayi 10 veya 10'dan buyuk ise ekrana "Sayi giriniz!" yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int s=0;
		
		do {
			System.out.println("Lutfen bir sayi giriniz");
			s=scan.nextInt();
			
		}while(s>=10);                         //conditionu kayba gore yazmaliyiz. 5 yazarsak 5>=10 false olur do while loop kirilir ve 
		                                       //loop disindakini yazar
		System.out.println("Kazandiniz!");
		
		scan.close();
	}

	
}
