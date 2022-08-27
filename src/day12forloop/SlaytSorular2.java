package day12forloop;

import java.util.Scanner;

public class SlaytSorular2 {

	public static void main(String[] args) {
		/*4.Soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten tüm tamsayıların toplamını ekrana yazdırın.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen baslangic degerini giriniz");
		int bas=scan.nextInt();
		System.out.println("Lutfen bitis degerini giriniz");
		int bit=scan.nextInt();
		
		int toplam=0;
		
		for(int i=bas; i<=bit; i++) {
			toplam=toplam+i;
		}
		System.out.println("Toplam: "+toplam);
		
		/*5.Soru
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
           biten tüm tamsayıların çarpımını ekrana yazdırın.
		 */
		
		int carpim=1;
		
		for(int i=bas; i<=bit; i++) {
			carpim=carpim*i;
		}
		System.out.println("Carpim: "+carpim);
		scan.close();

		
	}

}
