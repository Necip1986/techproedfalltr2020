package day13whileloop;

import java.util.Scanner;

public class Forloop03 {

	public static void main(String[] args) {
		/* for loop kullanarak asagida verilen sekli olusturunuz. Satir sayisni kullanicidan aliniz
		   *
		  * *
		 * * *
	   * * * * *
	 * * * * * * *
		 
	   */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Olusturulacak ucgenin satir sayisini giriniz");
		int s=scan.nextInt();
		
		//yildizlari kare icine alalim
		
		//once satirlar icin loop ayarliyoruz
		
		for(int i=1; i<=s; i++) {
			//space ler icin loop ayarlanir
			for(int k=s-1; k>=i; k--) {
				System.out.print(" "); //space ler yan yana ln yi kaldiriyoruz
			}
			//* lar icin loop olusturuyoruz
			for(int m=1; m<=i; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	scan.close();
		
		
		
		
		
		
		

	}

}
