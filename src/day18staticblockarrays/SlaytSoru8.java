package day18staticblockarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SlaytSoru8 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya kaç elemanlı bir array gireceğini sorun.
         Kullanıcıdan array’in elemanlarını girmesini isteyin.
         a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
         b) Bu arayın tum elemanlarını tersten yazdırın.
         Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac elemanli bir array olusturacagini yaziniz");
		int sayi=scan.nextInt();
		int sayi1[]=new int[sayi];
		int i=0;
		do {
			System.out.println("Lutfen indeksi "+i+" olan elemani giriniz");
			int arr=scan.nextInt();
			sayi1[i]=arr;
			i++;
		} while (i<sayi);
			
		System.out.println(Arrays.toString(sayi1));
		
		System.out.println("Lutfen arrayin icinde oldugunu dusundugunuz sayisi giriniz");
		int tahmin=scan.nextInt();
		
		int counter=0;
		for (int k = 0; k < sayi1.length; k++) {
			if(tahmin==sayi1[k]) {
				counter++;
			}
			
		}
		if (counter!=0) {
			System.out.println("Olusturulan array icinde "+tahmin+" sayisi vardir");
		}else {
			System.out.println("Olusturulan array icinde "+tahmin+" sayisi yoktur.");
		}
		
		int sayi2[]=new int[sayi];
		int j=0;
		do {
			sayi2[j]=sayi1[sayi1.length-1-j];
			j++;
		} while (j<=sayi1.length-1);
		
		
		System.out.println(Arrays.toString(sayi2));
		
		scan.close();
	}

}
