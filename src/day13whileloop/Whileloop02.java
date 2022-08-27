package day13whileloop;

import java.util.Scanner;

public class Whileloop02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir sayi aliniz bu sayi icin carpim tablosunu olusturunuz
		 * ornek kullanici 13 versin
		 * 13x1=13      1 2 3 ....10 bunlar i gibi gorcem loop icin
		 *              13x1 13x2  i=10 icin 13x10 a kadar
		 * 13x2=26
		 * ...
		 * 13x10=130
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Carpim tablosu olusturmak icin bir sayi giriniz");
		int s=scan.nextInt();  //carpim tablosunda sabit olan kisimlar belirlenir
		
		int i=1;
		while(i<=10) {
			System.out.println(s+ " x "+ i+"="+s*i);
			i++;
		}
		scan.close();
	}

}
