package day12forloop;

import java.util.Scanner;

public class SlaytSorular {

	public static void main(String[] args) {
		/*1.Soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten tüm tamsayıları ekrana aralarinda bosluk birakarak yanyana yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic degerini giriniz");
		int bas=scan.nextInt();
		System.out.println("Lutfen bitis degerini giriniz");
		int bit=scan.nextInt();
		
		if(bas>bit) {
			System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
		}else {
			for(int i=bas; i<=bit; i++) {
				System.out.print(i+" ");
			}
		}
		System.out.println("====");
		/*2.Soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
           başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları ekrana yazdırın.
		 */
		for(int i=bas; i<=bit; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		/*3.Soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
           başlayıp bitiş değerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.
		 */
		System.out.println("===========");
		
		
		for(int i=bas;i<=bit;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		scan.close();
		
	}

}
