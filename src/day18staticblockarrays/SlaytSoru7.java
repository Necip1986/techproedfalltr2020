package day18staticblockarrays;

import java.util.Arrays;
import java.util.Scanner;

public class SlaytSoru7 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya kaç elemanlı bir array gireceğini sorun.
           Kullanıcıdan array’in elemanlarını girmesini isteyin.
           a) Bu array’in tum elemanlarını ekrana yazdırın.
           b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.
           Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen array'in length'ini giriniz");
		int length=scan.nextInt();
		
		int arr[]=new int[length];
		
		int i=0;
				
		do {
			System.out.println("Lutfen array'in index'i "+i+" olan elemanini giriniz");
			arr[i]=scan.nextInt();
			i++;
					
		} while (i<length);
		
		System.out.println(Arrays.toString(arr));
		
		//array icinde yerler degismez yeni bir array olusturmaliyiz
		
		int newArr[]=new int[length];
		newArr[0]=arr[length-1];
		 for (int j =1 ; j < arr.length; j++) {
			newArr[j]=arr[j-1];
		}

		 System.out.println(Arrays.toString(newArr));
		 //12 13 11 olarak yazidir odev
		 scan.close();
	}

}
