package day13whileloop;

import java.util.Scanner;

public class SlaytSorular {

	public static void main(String[] args) {
		/*1.soru
		 * While loop kullanarak 3 den 13 e kadar tum tek tamsayıları ekrana yazdırınız.
		 */

		int s=3;
		while(s<=13) {
			System.out.print(s+" ");
			s++;
		}
		System.out.println("====");
		
		/*2.soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic ve bitis degerlerini giriniz");
		int bas=scan.nextInt();
		int bit=scan.nextInt();
		
		int k=bas;
		while(k<=bit) {
			System.out.print(k+" ");
			k++;
		}
		
		/*3. soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
           başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.
		 */
		System.out.println("====");
		int i=bas;
		while(i<=bit) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		/*4.soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten tüm tamsayıların toplamını ekrana yazdırın.
		 */
		System.out.println("====");
		
		int toplam=0;
		int t=bas;
		while(t<=bit) {
			toplam=toplam+t;
			t++;
		}
		System.out.println("Toplam: "+toplam);
		
		/*5.soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten tüm tamsayıların çarpımını ekrana yazdırın.
		 */
		int carpim=1;
		int c=bas;
		while(c<=bit) {
			carpim=carpim*c;
			c++;
		}
		System.out.println("Carpim: "+carpim);
		
		/*6.soru
		 * Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
           biten tüm harfleri büyük harf olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin       
		 */
		System.out.println("Baslangic ve bitis harfini giriniz");
		char ba=scan.next().toUpperCase().charAt(0);
		char bi=scan.next().toUpperCase().charAt(0);
		
		char g=ba;
		while(g<=bi) {
			System.out.print(g+"-");
			g++;
		}
		scan.close();
	}

}
