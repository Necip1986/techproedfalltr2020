package day06ifstatement;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		/*
		 Kullainicidan bir tam sayi alin ve o tam sayinin mutlak degerini ekrana yazdiriniz
		 a>=0 ==> Mutlak deger=a     a<0 ==>Mutlak deger= -a
		 */

		Scanner scan = new Scanner(System.in);
		/*System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi>=0) {
			System.out.println("mutlak deger:"+sayi);
		}else {
			System.out.println("Mutlak deger:"+-sayi);
		}
		*/
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
		if(sayi>0) {
			System.out.println("mutlak deger:"+sayi);
		}else {
			System.out.println("mutlak deger:"+-sayi);
		}
		

		
		scan.close();
		
	}

}
