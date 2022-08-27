package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorular02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu
           tüm sayıların toplamını yazdırınız.
           Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
		 */
		
		Scanner scan=new Scanner(System.in);
		
		
		int sayi=0;//1 de verilebilir zaten atama yapilacagi icin onemi yok
		int sum=0;
		do {
			System.out.println("Lutfen bir sayi giriniz");	
			sayi=scan.nextInt();
			sum+=sayi;
		}while(sayi!=0);
		System.out.println("Girilen sayilarin toplami:"+sum);

		scan.close();
	}

}
