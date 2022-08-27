package day07ifelseifternary;

import java.util.Scanner;

public class SlaytIfElseIf01 {

	public static void main(String[] args) {
		/*1.Soru
		 * Kullanicidan bir tamsayi alin eger tamsayi 0'dan kucuk ise ekrana "negatif" yazdirin
		 * 0 ise ekrana "notr", o'dan buyuk ise ekrana "pozitif" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi<0) {
			System.out.println("Negatif");
		}else if(sayi==0) {
			System.out.println("notr");
		}else {
			System.out.println("Pozitif");
		}
		/*
		 2.Soru
		 Kullanicidan bir ucgenin 3 kenar uzunlugunu alin. Eger 3 kenar uzunlugu birbirine esit ise ekrana "Eskenar"
		 Eger sadece 2 kenar uzunlugu birbirine esit ise ekrana "ikizkenar", eger tum kenar uzunluklari birbirinden farkli ise 
		 "cesitkenar ucgen" yazdirin.
		 */
		System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
		double k1=scan.nextDouble();
		double k2=scan.nextDouble();
		double k3=scan.nextDouble();
		
		if(k1==k2 && k2==k3) {
			System.out.println("eskenar ucgen");
		}else if(k1==k2 || k1==k3 || k2==k3 ) {
			System.out.println("ikizkenar ucgen");
		}else {
			System.out.println("cesitkenar ucgen");
		}
		
		/*
		 * 3.Soru
		 * Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A,B,C,D yazdirin
		 * 50'den az ise D, 50(dahil) ile 60 arasi ise C, 60(dahil) ile 80 arasi ise B, 80(dahil) ustu ise A  
		 */
		System.out.println("Lutfen notunuzu giriniz");
		byte not=scan.nextByte();
		
		if(not<0 || not>100) {
			System.out.println("Notunuz 0 ile 100 arasinda olmalidir");
		}else if(not<50) {
			System.out.println("D");
		}else if(not<60) {
			System.out.println("C");
		}else if(not<80) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		/*
		 * 4.Soru
		 * Kullanicidan bir yil alin eger yil 1000'e bolunuyorsa ekrana"milenyum", eger 100'e bolunuyorsa "yuzyil"
		 * eger 10'a bolunuyorsa "onyil" yazdirin
		 */
		System.out.println("Lutfen bir yil giriniz");
		int yil=scan.nextInt();
		
		if(yil<=0) {
			System.out.println("sifir ve negatif sayilar yil olarak yazilamaz");
		}else if(yil%1000==0) {
			System.out.println("Milenyum");
		}else if(yil%100==0) {
			System.out.println("yuzyil");
		}else if(yil%10==0) {
			System.out.println("onyil");
		}else {
			System.out.println("hicbiri");
		}
		scan.close();
		
	}

}
