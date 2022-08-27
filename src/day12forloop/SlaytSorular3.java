package day12forloop;

import java.util.Scanner;

public class SlaytSorular3 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan başlangıç ve bitiş harflerini alın ve başlangıç harfinden başlayıp bitiş harfinde
           biten tüm harfleri büyük harf olarak ekrana yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen baslangic harfini giriniz");
		String bas=scan.next().toUpperCase();
		char ilk=bas.charAt(0);
		
		System.out.println("Lutfen bitis harfini giriniz");
		String bit=scan.next().toUpperCase();
		char son=bit.charAt(0);
		
		if(!(ilk>='A' && ilk<='z') || !(son>='A' && son<='z')) {
			System.out.println("Lutfen harf giriniz");
		}else if(ilk>son) {
			System.out.println("Baslangic harfi bitis harfinden buyuk olamaz");
		}else {
			for(char i=ilk; i<=son; i++) {
				System.out.print(i+"-");
				
			}
			scan.close();
		}
		
	}

}
