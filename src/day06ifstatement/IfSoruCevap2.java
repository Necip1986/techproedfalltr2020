package day06ifstatement;

import java.util.Scanner;

public class IfSoruCevap2 {

	public static void main(String[] args) {
	     /*
		 2.SORU
		 Kullanicidan bir harf alin harf"a,e,i,o,u" dan biri ise ekrana "sesli harf"
		 "b,c,d,f" ise ekrana "sessiz harf yazdirin
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir harf girin");
		char ch=scan.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
			System.out.println("sesli harf");
		}
 
		if(ch=='b' || ch=='c' || ch=='d' || ch=='f') {
			System.out.println("sessiz harf");
		}
		scan.close();
	}

}
