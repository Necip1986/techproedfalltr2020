package day39maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable01 {

	/*
	   1-HashMap ve TreeMap syncronized ve thread-safe degildir. 
	     Map'ler arasindan syncronized ve thread-safe olan bir map'e ihtiyac vardir. 
	     Bu yuzden HashTable olusturulmustur.
	   2-HashTable ne key icin ne de value icin "null" kullanmaz.
	   3-HashTable elemanlari rastgele siralar.
	 */
	public static void main(String[] args) {
		
		Hashtable <Integer,String>ht=new Hashtable<>();
		ht.put(101, "Ali");
		ht.put(105, "Veli");
		ht.put(104, "Ayhan");
		ht.put(103, "Alaaddin");
		ht.put(102, "Ramazan");
		System.out.println(ht); //elemanlari rastgele siralar. 
		
		//null kullanimina izin vermiyor exception atar
//		ht.put(null, "Beyhan");
//		System.out.println(ht); //NullPointerException atar
		
		//value icinde null kullanilmaz NullPointerException atar
//		ht.put(106, null);
//		System.out.println(ht);//NullPointerException atar 
		
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(106, "Ramazan");
		hm.put(107, "Remziye");
		
		//hashtable icine hashmap'i ekledik
		ht.putAll(hm);
		System.out.println(ht);//iki ramazan var value'ler ayni olabilir.
		
		System.out.println("================");
		System.out.println(ht.get(106));
		//map'i set'e cevirme
		Set<Map.Entry<Integer, String>>hts=ht.entrySet();
		for(Map.Entry<Integer, String>w:hts){
			System.out.println(w);
			System.out.print(w.getKey()+" ");
			System.out.println(w.getValue()+" ");
		}
		
		System.out.println(hm.get(106));
		
	}

}
