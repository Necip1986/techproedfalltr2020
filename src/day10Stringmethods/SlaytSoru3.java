package day10Stringmethods;

import java.util.Scanner;

public class SlaytSoru3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter password, if the password is okay for the following conditions output will be
          “Your password is created successfully.” If the password is not okay for any of the following conditions
          Output will be “Enter a new password according to the give conditions”
          1.First letter must be uppercase
          2.Last letter must be lowercase
          3.Password must contain 6 characters
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 6 karakterli bir Password olusturun");
		String pwd=scan.nextLine();
		
		if((pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') && (pwd.charAt(5)>='a'&&pwd.charAt(5)<='z') && (pwd.length()==6)) {
			System.out.println("Your password is created successfully");
		}else {
			System.out.println("Enter a new password according to the give conditions");
		
		}
		scan.close();
	}	

}
