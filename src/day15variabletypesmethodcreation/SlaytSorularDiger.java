package day15variabletypesmethodcreation;

import java.util.Scanner;

public class SlaytSorularDiger {

	public static void main(String[] args) {
		
		
		toplam(1);
		
	//	sekil("a", 1,1);
		
		
		
	}
	
	/*SORU 3;
	 * Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
       yazdıran bir program yazın.
	 */
	public static void toplam(int a) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int top=0;
		for (int i = sayi; i > 0; i/=10) {
			top=top+i%10;
		}
		System.out.println(top);
		scan.close();
	}
	/*
	 * Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
       Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	
	public static void sekil(String a, double b, double c) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen paralelkenar, dikdortgen ve ucgen sekillerinden birini yaziniz");
		String sekil=scan.nextLine();
		System.out.println("Lutfen iki sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		if (sekil.equalsIgnoreCase("ucgen")) {
			System.out.println("Ucgenin alani: "+sayi1*sayi1*sayi1);
			System.out.println("Ucgenin cevresi: "+3*sayi1);
			
		}else if(sekil.equalsIgnoreCase("dikdortgen")) {
			System.out.println("Dikdortgenin alani: "+sayi1*sayi1); 
		}else {
			System.out.println("Paralelkenarin cevresi: "+2*(sayi2+sayi1));
		}
		scan.close();
		
	}
 */
}
