package day11stringmethods;

import java.util.Scanner;

public class SlaytSorular {

	public static void main(String[] args) {
		//1.soru
		//Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu
		//rakamlarını ekrana yazdırın.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kredi karti numaranizi giriniz");
		String kart=scan.nextLine();
		
		char uc=kart.charAt(2); 
		String ucu=kart.substring(2,3);
		char dort=kart.charAt(3);
		String dortu=kart.substring(3, 4);
		char son=kart.charAt(kart.length()-1);
		String sonu=kart.substring(kart.length()-1);
		
		System.out.println("Kartin ucuncu rakami: "+uc);
		System.out.println("Kartin dondurcu rakami: "+dort);
		System.out.println("Kartin son rakami: "+son);
		
		System.out.println(ucu+" "+dortu+" "+sonu);
		
		/*2. Soru
		 * Kullanıcıdan adini ve soy ismini alın ad ve soy isminin kaç harften oluştuğunu ekrana yazdırın.
		 */
		
		System.out.println("Lutfen adinizi giriniz");
		String ad=scan.nextLine();
		System.out.println("Lutfen soyadinizi giriniz");
		String soy=scan.nextLine();
		int ads=ad.length();
		int soys=soy.length();
		System.out.println("Adiniz "+ads+" harften olusmaktadir");
		System.out.println("Soyadiniz "+soys+" harften olusmaktadir");
		
		
		/*3. Soru
		 * Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın.
		 */
		
		ad=ad.substring(0,1).toUpperCase()+ad.substring(1);
		soy=soy.substring(0, 1).toUpperCase()+soy.substring(1);
		System.out.println(ad);
		System.out.println(soy);
		
		
		scan.close();
		
		
		
	}

}
