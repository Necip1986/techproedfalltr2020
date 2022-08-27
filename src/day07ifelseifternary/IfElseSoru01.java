package day07ifelseifternary;

import java.util.Scanner;

public class IfElseSoru01 {

	public static void main(String[] args) {
		/* IfElse 3. Soru
		 * Kullanicidan alacagi urun miktarini ve urunun birim fiyatini alin. Eger urun miktari 1000'den fazla ise
		 * kullaniciya %10 indirim yapin ve odemesi gereken toplam parayi ekrana yazdirin. Diger durumlarda odemesi gereken toplam 
		 * parayi herhangi bir indirim yapmadan ekrana yazdirin
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("urun miktarini giriniz");
		int qty = scan.nextInt();
		System.out.println("urun birim fiyatini giriniz");
		double price=scan.nextDouble();
		
		if(qty>1000) {
			System.out.println("%10 indirimli fiyat:" + price*0.9*qty);
		}else {
			System.out.println("Indirimsiz fiyat:"+price*qty);
		}
		scan.close();
				

	}

}
