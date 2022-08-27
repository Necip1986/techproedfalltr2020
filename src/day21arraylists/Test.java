package day21arraylists;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 Bir ATM projesi yazalim Hesabimizda bir miktar para olsun
		 Yapilacak islemler:
		 1)Hesabi goruntuleme
		 2)Para Cekme
		 3)Para Yatirma
		 4)Cikis
		 */
			double toplamTutar = 5000;
			
			while(true){
			//for(;;) {
			Scanner input = new Scanner(System.in);
			System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1- Hesabi Goruntuleme "
					+ "\n2- Para Cekme \n3- Para Yatirma \n4- Cikis");
			int secim = input.nextInt();
			
			if(secim==1) {
				System.out.println("Hesabinizda " + toplamTutar + "$ vardir");
			}else if (secim==2) {
				System.out.println("Cekmek istedginiz tutari giriniz");
				double paracekeme = input.nextDouble();
				if(toplamTutar>=paracekeme) {
					System.out.println("Bu miktari cekebilirsiniz");
					toplamTutar -= paracekeme;//toplamTutar = toplamTutar- paracekme
					System.out.println("Hesabinizda kalan miktar: " +toplamTutar + "$");
				}else {
					System.out.println("Cekmek istediginiz bakiye yetersizdir.");
				}
			}else if (secim ==3) {
				System.out.println("Hesabiniza ne kadar yatirmak istiyorsunuz?");
				
				double parayatirma = input.nextDouble();
				toplamTutar += parayatirma;
				System.out.println("Hesabinizdaki yeni tutar: " +toplamTutar + "$");
				break;
			}else if (secim==4) {
				System.out.println("isleminiz sonlandirilmistir");
				break;
			}
			input.close();
	}
			
  }
}
