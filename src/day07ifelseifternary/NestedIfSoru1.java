package day07ifelseifternary;

import java.util.Scanner;

public class NestedIfSoru1 {

	public static void main(String[] args) {
		/*Soru 1
		 * Kullanicidan cinsiyetini girmesini isteyin
		 * Erkek ise yasini kontrol edin. Yasi 18 den kucuk ise ekrana "erkek cocuk"
		 * yasi 18'den buyuk esit ise ekrana "Adam" yazdirin
		 * kiz ise yasini kontrol edin. Yasi 18 den kucuk ise ekrana "kiz cocuk"
		 * yasi 18'den buyuk esit ise ekrana "Kadin" yazdirin
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz"); //erkek/kadin diye ozel girilebilir kullanici hatali girmasin diye
		String gender=scan.next();
		System.out.println("Lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("erkek") ) {
			if(yas<18) {
				System.out.println("erkek cocuk");
			}else {
				System.out.println("Adam");
			}
		}else if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("kadin")){
			if(yas<18) {
				System.out.println("Kiz cocuk");
			}else {
				System.out.println("Kadin");
			}
		}else {
			System.out.println("bu cinsiyet tanimli degil");
		} System.out.println("============");
		
	scan.close();
	} 

}
