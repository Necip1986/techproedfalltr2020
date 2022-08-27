package day18staticblockarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SlaytSoru88 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya kaç elemanlı bir array gireceğini sorun.
           Kullanıcıdan array’in elemanlarını girmesini isteyin.
           a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin.
           b) Bu arayın tum elemanlarını tersten yazdırın.
           Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kac elemanlari array olusturacaginizi giriniz");
		int sayi=scan.nextInt();
		
		int arr[]=new int[sayi];
		int i=0;
		do {
			System.out.println("Lutfen indexi "+i+" olan sayiyi giriniz");
			int arrEleman=scan.nextInt();
			arr[i]=arrEleman;
			i++;
		} while (i<arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Lutfen bir sayi giriniz");
		int tahmin=scan.nextInt();
		int k=0;
		do {
			
			if (tahmin==arr[k]) {
				System.out.println("Girdiginiz sayi olusturulan array icinde vardir");
			}				
			k++;
		} while (k<arr.length);
		System.out.println("girdiginiz sayi array de yoktur");
		
		scan.close();
	}

}
