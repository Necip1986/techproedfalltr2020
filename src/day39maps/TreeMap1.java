package day39maps;

import java.util.TreeMap;

public class TreeMap1 {
	
	/*
	  1-Tree kelimesini duyunca aklimiza siralama gelmeli (natural order'a gore)
	  2-Tree Map map'lerin en yavasidir.
	  3-Tree Map'lerde key'ler icin "null" kullanilamaz. Tree Map Siralama yapacagi icin null'i 
	    nereye koyacagini bilemez.
	  4-Tree Map'lerde value'ler icin "null" kullanilabilir. null istenildigi kadar kullanilabilir.
	  5-Tree Map'ler syncronized ve thread-safe degildirler.  
	 */

	public static void main(String[] args) {
		
		TreeMap<Integer,String>tm1=new TreeMap<>();
		tm1.put(101, "Ali");//map'lerde put ile eleman eklenir
		tm1.put(105, "Bahadir");
		tm1.put(104, "Ceylan");
		tm1.put(102, "Ayhan");
		tm1.put(103, "Seyhan");
		System.out.println(tm1);//key'lere gore siralama yapar {101=Ali, 102=Ayhan, 103=Seyhan, 104=Ceylan, 105=Bahadir}
		
		tm1.put(100, null);
		tm1.put(106, null);
		tm1.put(107, null);
		System.out.println(tm1);
		
		//tm1.put(null, "Ceylan");//ONEMLI: CTE vermedi ama RTE verir nullPointerException verir
		
		//ceilingKey(95) methodu key'ler arasinda 95'e esit olan varsa 95'i return eder. Esit
		//olan yoksa 95'ten buyuk en kucuk key'e return eder. 95 veya 95'ten buyuk bir key yoksa null return eder
		//ceilind tavan demek
		System.out.println(tm1.ceilingKey(95)); //argument yok ise en yakindaki key'i return eder
		System.out.println(tm1.ceilingKey(108));//null verir cunku yoksa buyuk olani verirdi 

		//descending buyukten kucuge azalan siralama, ascending kucukten buyuge artan siralama demektir.
		System.out.println(tm1.descendingKeySet());
		
		tm1.keySet();//kucukten buyuge yazdririr.
		System.out.println(tm1.keySet());
		
		tm1.firstKey();//sirali oldugu icin first key ve last key metodlari var treeMap'te
	
		
	
	}

}
