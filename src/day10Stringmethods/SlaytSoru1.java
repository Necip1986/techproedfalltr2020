package day10Stringmethods;

import java.util.Scanner;

public class SlaytSoru1 {
	public static void main(String[] args) {
		/*
		 * Ask user to enter a word which has 4 letters and output will be inverse of the word.
           For example; if user enters “MARK” output will be “KRAM”
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime giriniz");
		String k=scan.next();
		String s1=k.replace(k.charAt(0), k.charAt(3));
		String s2=k.replace(k.charAt(1), k.charAt(2));
		String s3=k.replace(k.charAt(2), k.charAt(1));
		String s4=k.replace(k.charAt(3), k.charAt(0));
		//System.out.println(s1.charAt(0)+s2.charAt(1)+s3.charAt(2)+s4.charAt(3));
	    System.out.print(s1.charAt(0));
	    System.out.print(s2.charAt(1));
	    System.out.print(s3.charAt(2));
	    System.out.println(s4.charAt(3));
		
		scan.close();
		
	}

}
