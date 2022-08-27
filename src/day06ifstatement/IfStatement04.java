package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan pozitif bir tamsayi alin. Sayi 3 basamakli ise konsola "3 basamakli yazdirin"
		 Sayi 2 basamkli ise consola "2 basamakli yazdirin
		 Sayi 3 basamakli veya 2 basamakli degilse "ikisi de degil yazdirin"
		 */

		Scanner scan=new Scanner(System.in);
		/*System.out.println("Lutfen pozitif bir tamsayi girin");
		int sayi=scan.nextInt();
		
		if(sayi>=100 && sayi<=999) {
			System.out.println("3 basamakli sayi");
		}
		if(sayi>=10 && sayi<=99) {
			System.out.println("2 basamakli sayi");
		}
		if(!(sayi>=100 && sayi<=999) && !(sayi>=10 && sayi<=99)) {
			System.out.println("ikisi de degil");
		}
		scan.close();
		
		*/
		System.out.println("Lutfen pozitif bir tamsayi giriniz");
		int sayi=scan.nextInt();
		if(sayi>=100 && sayi<=999) {
			System.out.println("3 basamakli sayi");
		}
		if(sayi>=10 && sayi<=99) {
			System.out.println("2 basamakli sayi");
		}			
		if(!(sayi>=10 && sayi<=99) && !(sayi>=100 && sayi<=999)) {
			System.out.println("ikiside degil");
		}
		
		scan.close();
	}
 
	
}
