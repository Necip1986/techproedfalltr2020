package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		/*
		   Bir array'de belli bir elemanin var olup olmadigini kontrol etmek
		 */

		int a[]= {2, 5, 2, 8, 6};
		
		//binarySearch() metodu bir array'de belli bir elemanin var olup olmadigini kontrol
		//etmek icin kullanilir
		//binarySearch() methodunu kullanmadan once MUTLAKA sort() metodunu kullanmalisiniz
		//sort() kullanmadan binarySearch() kullanirsaniz buldugunuz sonuc manali olmaz.
		//binarySearch() metodu var olan elemanlar icin o elemanin sort edilmis array'deki index ini verir
		//binarySearch metodu tekrarli elemanlar icin kullanilmaz.
		//binarySearch methodu negatif sayi return ederse bu kontrol ettiginiz sayinin array'de bulunmadigi anlamina gelir.
		
		Arrays.sort(a); //[2,2,5,6,8] oldu array'im
		
		Arrays.binarySearch(a, 8);    //a array'in ismi, 8 de kontrol etmek istedigimiz elemandir .iki parametreli calisir.
		System.out.println(Arrays.binarySearch(a, 8)); // 4 verir
		System.out.println(Arrays.binarySearch(a, 5)); //
		
		System.out.println(Arrays.binarySearch(a, 2)); // tekrarlanan elemanlar icin farkli sonuclar verebilir o yuzden kullanmiyoruz
		System.out.println(Arrays.binarySearch(a, 4)); // -3 cikar. Yani 4 yok ama olsaydi 3. eleman olurdu anlamindadir. 
		System.out.println(Arrays.binarySearch(a, 7)); //-5 verir. olmadigi icin negatif olsaydi indexi 5. olan eleman olacakti
		
		
		//iki array'in esit olup olmadigini kontrol etmek.
		//iki array'in esit olabilmesi icin ayni index'lerde ayni elemanlara sahip olmasi gerekir
		String[] s1 = {"A","D","C"};
		String[] s2 = {"A","C","D"};
		String[] s3 = {"A","C","D"};
		
		Arrays.equals(s1, s2); //bunlar ayni ise true farkli ise false return eder
		System.out.println(Arrays.equals(s1, s2)); //false verir
		Arrays.equals(s2, s3);
		System.out.println(Arrays.equals(s2, s3));//true verir.
		
		System.out.println(s3==s2); //false verir cunku adresleri farkli
		//System.out.println(s2==s2);//true verir cunku isimleri de aynidir. java bos is gorur sari cizgi verir
		
	}

}
