package day13whileloop;

import java.util.Scanner;

public class Loop {

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
		System.out.println("satir sayisini giriniz");
		int satir=scan.nextInt();
		
		for(int i=1; i<=satir; i++) {
			for(int k=satir; k>=i; k--) {
				System.out.print("* ");
				}
			System.out.println();
			for(int j=0; j<i; j++) {
				System.out.print(" ");				
			}
			
			
			
		}
	}
}
