package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("B");
		ls.add("M");
		ls.add("A");
		ls.add("M");
		ls.add("M");
		
		System.out.println(ls); //insertion order ilk atanan basa konur
		
		//Araya eleman koyma'nin 2 yolu
		//ayni simli metodlara metod overloading denir
		ls.add(1, "K");
		System.out.println(ls);
		ls.add(0, "S");
		System.out.println(ls);
		ls.add("T"); // ls.add(5, "T") BUDA OLUR. AMA en sona koymak icin direk add'e koyariz
		System.out.println(ls);
		
		//List'in icindeki eleman sayisini bulmak. Stringlerde length(), array'lerde length, list'lerde size metodu kullanilir
		//Array'lerin eleman sayisindan bahsederken array'in length'i deyiniz
		//List'lerin eleman sayisindan bahsederken "List'in size'i deyiniz
		ls.size();
		System.out.println(ls.size());
		
		//Bir List'in bos olup olmadigini kontrol etmek
		ls.isEmpty();
		System.out.println(ls.isEmpty());
		
		//Bir List'ten index kullanarak eleman silmek. Remove metodu list'in icini degistirir kalici olarak. List'lerdeki
		//metodlar kalici degisiklik yapar
		//index ile remove metodunu kullanirsaniz ve ekrana yazdirirsaniz. Java sildigi elemani ekrana yazar.
		System.out.println(ls.remove(2)); //java K'yi silcem dogrumu diye soruyor
		//ls.remove(2); //K silindi
		System.out.println(ls); 
		
		//Bir List'ten eleman ismi ile eleman silmek
		System.out.println(ls.remove("T")); //bana T'yi sil dedin gorev basariyla sonuclanmistir. True verir
		//ls.remove("T");
		System.out.println(ls); //T'yi sildi
		
		//olmayan bir elemani silmek
		ls.remove("x");
		System.out.println(ls.remove("x")); //java olmayan elemani silemedigi icin false verir
		
		ls.remove("M"); //java ya M yi sil dedim o sildi ilk M'yi sildikten sonra java durur diger M yi silmez
		System.out.println(ls);
		
		//Bir List'te istenen elemanin var olup olmadigini kontrol etmek
		ls.contains("A"); //list icinde A var mi. boolean return eder.
		System.out.println(ls.contains("A"));
		System.out.println(ls.contains("x")); //false verir
		
		//Bir List'in belli index'indeki elemani degistirmek. String de replace list'e ise set metodu kullanilir.
		System.out.println(ls.set(1, "Bursa"));
		ls.set(1, "Bursa"); //1. index'e git onu Bursa ile degistir dedik. eger bunu syso nun icine koyarsak java B verir yani B'yi degistirelim mi der
		
		System.out.println(ls); //[S, Bursa, A, M] B gitti bursa yazildi
		
		//Bir List'teki elemanlari siralamak
		Collections.sort(ls);  //=====>COK KULLANILIR UNUTMA
		System.out.println(ls); //alfabetik siralama yapar
		
		//Bir List'teki tum elemanlari silmek
		ls.clear();
		System.out.println(ls); //tum elemanlar silinir ve [] gorulur consol'da
		
	}

}
