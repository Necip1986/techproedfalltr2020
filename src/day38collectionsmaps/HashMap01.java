package day38collectionsmaps;

import java.util.HashMap;

public class HashMap01 {

	/*
	   1-map'ler key-value yapisini kullanirlar.
	   2-Key'ler tekrarli deger kabul etmezler. Unique olmalidirlar.(tc no'lar gibi)
	   3-Value'ler tekrarli olabilirler(isimler gibi)
	   4-3 farkli map vardir. 
	     a-HashMap: En cok kullanilani ve en hizli olanidir. Hizli olabilmek icin siralamayi rastgele yapar.
	                Hizli olabilmek icin ayrica synchronize olmazlar ve thread-safe degildirlar
	                Sadece bir tane key null olabilir. Birden fazla value null olabilir.
	     b-HashTable
	     c-TreeMap
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>(); //integer key icin string value icin 2 deger var
		
		hm1.put(101, "Ali Han"); //add metodu yok o collection'daydi burda put metodu ayni isi yapar
		hm1.put(102, "Veli Can");
		hm1.put(103, "Ayse Tan");
		System.out.println(hm1);
		//ayni key kullanildiginda ustune yazar
		hm1.put(101, "Kemal Yildiz"); //key tekrar kullaninca ustune yazar ali han silindi
		System.out.println(hm1); //yazdirma ayni list;lerde oldugu gibi ama curly brace vardir {101=Ali Han, 102=Veli Can, 103=Ayse Tan}
		
		//ayni value'yu farkli key ile yolladiginizda map'e ekler
		hm1.put(104, "Veli Can");
		System.out.println(hm1); //veli can ekledi tekrarli value'de sorun olmaz
		
		hm1.put(null, "Ayse Ay");
		System.out.println(hm1);//{null=Ayse Ay, 101=Kemal Yildiz, 102=Veli Can, 103=Ayse Tan, 104=Veli Can}//siralama farkli olabilir dikkat
		
		hm1.put(105, null);
		hm1.put(106, null);
		hm1.put(107, null);
		System.out.println(hm1); //birden fazla null value eklenebildi
		
		hm1.get(102);
		System.out.println(hm1.get(102));//key'nin degerini yazdirir veli can
		                                 //key olmadan value'ye ulasamayiz\
		hm1.values();
		System.out.println(hm1.values());//tum value'leri verir [Ayse Ay, Kemal Yildiz, Veli Can, Ayse Tan, Veli Can, null, null, null]
		                                 //bunlari collection olarak verir
		//butun key'leri alma
		hm1.keySet();
		System.out.println(hm1.keySet());//[null, 101, 102, 103, 104, 105, 106, 107] key'ler set formatinda veriliyor.
		
		hm1.getOrDefault(101, "Uzgunum bu key icin bir deger yok");
		System.out.println(hm1.getOrDefault(101, "Uzgunum bu key icin bir deger yok"));//kemal yildiz i verdi cunku var
		System.out.println(hm1.getOrDefault(111, "Uzgunum bu key icin bir deger yok"));//Uzgunum bu key icin bir deger yok yazar yani ya degeri yaz yada defaultu bas der bu method
		
		hm1.putIfAbsent(108, "Merve Tahsin");//108 olmadigi icin ekleme yapar
		System.out.println(hm1);//merve tahsin eklendi.
		
		//burada yildiz yil'i 103 key'sine eklemez cunku 103'te value vardir. putIfAbsent metodu yoksa ekler.
		hm1.putIfAbsent(103, "Yildiz yil");
		System.out.println(hm1); //yildiz yil eklenmedi cunku 103'un degeri vardir.
		
		hm1.put(105, "Yildiz Yil");
		System.out.println(hm1); //ekledi
		//value null ise java deger yokmus gibi davranir ve Yildiz Yil ekler
		hm1.putIfAbsent(106, "Yildiz Yil");
		System.out.println(hm1);
		
		//key kullanarak eleman silmek
		hm1.remove(106);
		System.out.println(hm1);
		
		 
		hm1.remove(102, "Veli Can");//burda 103 veli can yaparsam hic biri silinmez key ve value ortusurse siler java
		System.out.println(hm1); //java hem 102 yi hem veli can'i kontrol eder ve varsa siler
		
		//Value update etmek icin kullanilir.
		hm1.replace(104, "Asiye Can");
		System.out.println(hm1);
		
		//olmayan bir key ile replace metodunu kullanirsaniz map degismez
		hm1.replace(112,"AAAA");
		System.out.println(hm1);
		System.out.println("===================");
		hm1.replace(104, "Asiye Can", "Ramazan Meydan");
		System.out.println(hm1);
		
		//eleman sayini verir
		System.out.println(hm1.size());
		
		HashMap<Integer, String>hm2 = new HashMap<>();
		hm2.put(201, "Cat");
		hm2.put(202, "Dog");
		
		//bir map'e baska bir map eklemek icin kullanilir
		//putAll metodu kullandiginizda 2 map'teki key ve value'larin data tipleri ortusmelidir.
		hm1.putAll(hm2);
		System.out.println(hm1); //siralama yapmadan ekledi.
		

	}

}
