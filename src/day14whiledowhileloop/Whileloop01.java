package day14whiledowhileloop;

import java.util.Scanner;

public class Whileloop01 {

	public static void main(String[] args) {
		/*
		 * kullanicidan isim ve soy ismini alin ve kullanicinin ilk isminin ilk harfinden 
		 * soy isminin son harfine kadar olan butun harfleri buyuk harf olarak ekrana ayni satirda aralarina bosluk birakarak yaziniz
		 * ALI KEMAL==>A B C D E F G H I J K L 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		char ilkHarf=scan.nextLine().toUpperCase().charAt(0);
		
		System.out.println("Lutfen soyadinizi giriniz");
		String soyad=scan.nextLine().toUpperCase();
		char sonHarf=soyad.charAt(soyad.length()-1);
	
		if(ilkHarf<=sonHarf) {
		   while(ilkHarf<=sonHarf) {
			System.out.print(ilkHarf+" ");
			ilkHarf++;
		    }
		}else {
			while(sonHarf<=ilkHarf) {
				System.out.print(sonHarf+" ");
				sonHarf++;
			}
		}
		scan.close();
	}

}
