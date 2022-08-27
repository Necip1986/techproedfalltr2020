package day13whileloop;

import java.util.Scanner;

public class Forloop04odev {

	public static void main(String[] args) {
		/*
		 * Satir sayisini kullanicidan alarak asagidaki sekli olusturunuz
		 
		 * * * * *
		  * * * * 
		   * * *
		    * *
		     * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen satir sayisini giriniz");
		int s=scan.nextInt();
		
		/*
		for(int i=1; i<=s; i++) {
			for(int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for(int m=i; m<=s; m++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		*/scan.close();
		
		for (int i = 1; i <= s; i++) {
			for (int b = 0; b <= i; b++) {
				System.out.print(" ");
			}
			for (int a = s; a >= i; a--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
