package day13whileloop;

import java.util.Scanner;

public class Forloop044 {

	public static void main(String[] args) {
		/*
		 * Satir sayisini kullanicidan alarak asagidaki sekli olusturunuz
		 
		 * * * * *   ilk once kare icine aliyoruz. bosluklari goruyoruz. 3 loop kurulacak 1 satirlari 2 bosluklari 3 yildizlari
		  * * * * 
		   * * *
		    * *
		     * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen satir sayisini giriniz");
		int s=scan.nextInt();
		
		for(int i=0; i<s; i++) { //satir sayisi
			
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int m=1; m<=s-i; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}

}
