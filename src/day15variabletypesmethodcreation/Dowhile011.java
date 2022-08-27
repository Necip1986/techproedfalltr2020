package day15variabletypesmethodcreation;

import java.util.Scanner;

public class Dowhile011 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir string alin bu stringin icinde kac tane harf, kac tane rakam ve kac tane 
		 * harf ve rakam disi karakter oldugunu gosteren programi yaziniz
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string girniz");
		String s=scan.nextLine().toLowerCase();
		int harfCounter=0;
		int rakamCounter=0;
		int digerCounter=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				harfCounter++;
			}else if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				rakamCounter++;
			}else {
				digerCounter++;
			}
		}

		System.out.println("Harf sayisi: "+harfCounter);
		System.out.println("Rakam sayisi: "+rakamCounter);
		System.out.println("Diger karakter sayisi: "+digerCounter);
		
		scan.close();
	}

}
