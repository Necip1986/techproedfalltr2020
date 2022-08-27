package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorularDiger011 {

	public static void main(String[] args) {


		Toplam(1);

	}
	/*SORU 3;
	 * Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
       yazdıran bir program yazın.
	 */
	public static void Toplam(int a) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int top=0;
		for (int i = sayi; i > 0; i/=10) {
			top=top+i%10;
		}
		System.out.println(top);
		
		scan.close();
	}

}
