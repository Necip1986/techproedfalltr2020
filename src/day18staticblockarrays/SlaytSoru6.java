package day18staticblockarrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class SlaytSoru6 {

	public static void main(String[] args) {
		
		/*
		  Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol
          eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa
          “Aynı eleman yok” yazdırınız.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir array giriniz");
		int array=scan.nextInt();
		 */
		
		int a[]= {2,8,7,9,1,5};
		System.out.println(Arrays.toString(a));
	    System.out.println(a[0]);
		Arrays.sort(a);
		System.out.println(a.length);
		
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = a.length-1; j >=0; j--) {
				if(a[i]==a[j]&&i!=j) {
					count++;
				}
			}
			
			
		}
		
		
		if (count!=0) {
			System.out.println("Ayni eleman var");
		}else {
			System.out.println("Ayni eleman yok");
		}
		
	}

}
