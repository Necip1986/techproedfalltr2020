package day09switchstringmethods;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 switch() statement if-else-if ile ayni isi yapar
		 switch() statement daha kolay yazilir ve daha kolay okunur
		 2'den fazla durum varsa genellikle if-else-if yerine switch() kullanilir.
		 */

		/*
		 Kullanici hafta gununun sayisini girsin, program haftanin gununu yazsin.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Ismini gormek istediginiz gunun sayisini giriniz");
		int gun=scan.nextInt();
		
		//if-else-if
		if(gun==1) {
			System.out.println("Pazartesi");
		}else if(gun==2) {
			System.out.println("Sali");
		}else if(gun==3) {
			System.out.println("Carsamba");
		}else if(gun==4) {
			System.out.println("Persembe");
		}else if(gun==5) {
			System.out.println("Cuma");
		}else if(gun==6) {
			System.out.println("Cumartesi");
		}else if(gun==7) {
			System.out.println("Pazar");
		}else {
			System.out.println("Gecerli gun sayisi giriniz");
		}
		
		//switch() kullanimi
		switch(gun) {
		    case 1: //gun=1 olma durumunda
		    	System.out.println("Pazartesi");
		    	break;     //break kodu durdur demek. break yazmazsam bir sonraki satira bakar ornegin salidan sonra break koymazsam
		    case 2:        //ekrana sali ve alt satira da carsamba yazdirir. Java bir kere calisinca break gorene kadar calisir.
		    	System.out.println("Sali");
		    	break;	
		    case 3:
		    	System.out.println("Carsamba");
		    	break;
		    case 4:
		    	System.out.println("Persembe");
		    	break;
		    case 5:
		    	System.out.println("Cuma");
		    	break;
		    case 6:
		    	System.out.println("Cumartesi");
		    	break;	
		    case 7:
		    	System.out.println("Pazar");
		    	break;	
		    default: //default ve else ayni isi yapar. default'tan sonra break demeye gerek yok. Ama girilse de olur
		    	System.out.println("Gecerli gun sayisi giriniz");
		    	
		    	scan.close();
		}
		
	}

}
