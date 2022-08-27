package day13whileloop;

import java.util.Scanner;

public class Forloop05 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir String aliniz ve o Stringin tersini(reverse String) ekrana yazdiriniz	 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		String s=scan.nextLine();
		
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
		scan.close();
		
		
		
		
		
		
	}

}
