package day07ifelseifternary;

import java.util.Scanner;

public class NestedIfSoru2 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir harf girmesini isteyin
		 * Girdigi kucuk harf ise harfin "a" olup olmadigini kontrol edin. harf a ise ekrana "ilk kucuk harf"
		 * a degil ise ekrana "ilk kucuk harf degil" yazdirin.\
		 * Girdigi buyuk harf ise harfin "Z" olup olmadigini kontrol edin. harf Z ise ekrana "Son buyuk harf"
		 * Z degil ise ekrana "Son buyuk harf degil" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char harf=scan.next().charAt(0);
		
		if(!(harf>='A' && harf<='z')) {
			System.out.println("Lutfen harf giriniz");
		}else if(harf>='a' && harf<='z') {   //harf>'Z'de yazabiliriz
			if(harf=='a') {
				System.out.println("ilk kucuk harf");
			}else {
				System.out.println("ilk kucuk harf degil");
			}
		}else {
			if(harf=='Z') {
				System.out.println("Son buyuk harf");
			}else {
				System.out.println("Son buyuk harf degil");
			}
		}
        
		scan.close();
	}

}
