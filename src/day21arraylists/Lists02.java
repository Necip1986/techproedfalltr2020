package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		
		//iki tane Integer List olusturunuz. WELL ORGANIZE ETMEK ONEMLI kompozisyon yazar gibi
		//1. list= [1,3,1,2] 
		//2. list= [3,2,4,4,5]
		
		List<Integer>list1 = new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(1);
		list1.add(2);
		System.out.println(list1);
		
		List<Integer>list2 = new ArrayList<>();
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);
		
		//Bir List'i baska bir List'e ekleme
		list1.addAll(list2); //list2'nin tamamini ekler sondan baslayarak //[1,3,1,2,3,2,4,4,5] olur ekranda ama listte koyup ekleme yapabiliriz
		System.out.println(list1);
		
		//Bu bir suru eleman istenen indexe eklensin istiyoruz (araya girsin istiyorum)
		list1.addAll(1, list2);
		System.out.println(list1); //araya eklemis olduk
		
		//Bir List'ten toplu eleman silmek
		list1.removeAll(list2); //bu yontem de list2 nin elemanlari teker teker elemanlari siler *****hocanin ekrani izle
		System.out.println(list1);
		System.out.println(list2); //list2 silinmez ayni kalir
		
		//Bir List'in baska bir List'e esit olup olmadigini kontrol etmek
		list1.equals(list2); //false alinir
		System.out.println(	list1.equals(list2)); //false yazar  list'lerde == kullanilmaz equals kullanilir.
		
		//list'in icinde list var mi
		list1.containsAll(list2); //false verir
		System.out.println(list1.containsAll(list2));
		
		List<Integer>list3 = new ArrayList<>();
		list3.add(3);
		list3.add(2);
		
		list2.containsAll(list3); //true verir
		System.out.println(list2.containsAll(list3));
		
		//get metodu //buy one get one. Get metodu index'i verilen elemani return eder
		list2.get(1); //index 1 deki elemani al demek
		System.out.println(list2.get(1)); //2 verir
		System.out.println(list2);
		
		//indexOf metodu verilen elemanin ilk gorunusunun index'ini return eder
		list2.indexOf(4); //4'un index'ini . Java soldan baslar 4'u bulunca onun index'ini alir diger 4'u almaz
		System.out.println(list2.indexOf(4)); //2 verir
		
		//lastIndexOf metodu verilen elemanin son gorunumunun index'ini return eder
		list2.lastIndexOf(4); //son 4'un index'ini verir
		System.out.println(list2.lastIndexOf(4)); //3 verir
		
		//subList(index1, index2) metodu List'in index 1'den index 2'ye kadar olan bolumunu return eder
		//index 1 dahil, index 2 harictir.
		list2.subList(1, 3); //ilk index dahil son index haric
		System.out.println(list2.subList(1, 3)); //[2,4] verir
		
	}

}
