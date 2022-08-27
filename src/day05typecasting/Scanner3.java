package day05typecasting;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran bir program yaziniz
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int s=scan.nextInt();
		int ilkRakam=s/1000;
		int sonRakam=s%10;
		
		System.out.println("toplam:"+(ilkRakam+sonRakam));
		
		scan.close();
	
		//dort basamakli bir sayinin ilk rakamini almakicin mod kullanin

	}

}
