package day13whileloop;

import java.util.Scanner;

public class SlaytSorular3 {
	
	public static void main(String[] args) {
		
		/*soru 2:for loop ve while loop kullanarak cozunuz
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic ve bitis degerlerini giriniz");
		int bas=scan.nextInt();
		int bit=scan.nextInt();
		
		for(int i=bas; i<=bit; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println("==");
		int k=bas;
		while(k<=bit) {
			if(k%3==0 && k%5==0) {
				System.out.print(k+" ");
			}
			k++;
		}
		
		System.out.println();
		/*
		 * Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
           Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir
		 */
		System.out.println("Lutfen bir sayi giriniz");
		int h=scan.nextInt();
		
		for(int j=h; j>=1; j--) {
			if(h%j==0)
				System.out.print(j+" ");
		}
		System.out.println();
		
		int g=h;
		while(g>=1) {
			if(h%g==0) {
				System.out.print(g+" ");
			}
			g--;
		}
		scan.close();
		
	}

} 
