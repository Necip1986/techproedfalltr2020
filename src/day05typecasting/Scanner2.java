package day05typecasting;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		

		System.out.println("Lutfen bir karakter giriniz");
		char s=scan.next().charAt(0);
		System.out.println("  "+s+"  ");
		System.out.println(" "+s+" "+s+" ");
		System.out.println(s+" "+s+" "+s);
		
		scan.close();

	}

}
