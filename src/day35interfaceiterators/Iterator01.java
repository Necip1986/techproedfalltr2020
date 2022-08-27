package day35interfaceiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {


		List<String>list = new ArrayList<>();

		list.add("B");
		list.add("C");
		list.add("A");
		list.add("D");
		System.out.println(list);
		
		//List elemanlarini for loop ve for-each loop kullanarak yazdiriniz
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		for(String w:list) {
			System.out.print(w+" ");
		}
		System.out.println();
		//list'i elemanlarin sonuna for-loop kullanarak "!" ekleyiniz sonra list1'i yazdiriniz
		
		for(int i=0; i<list.size(); i++) {
			list.set(i, list.get(i)+"!");
		}
		System.out.println(list);
		
//		for(String w:list) {//index kullanmam gerekli for loop aciz kaliyor
//			list.set(index, element)
//		}
		//gordugunuz gibi set() methodunu kullanmak icin index lazim. ama for-each loop index kullanilmaz
		//Bu yuzden for-each loop kullanarak list'ler update edilmez.
		
		//iste for-each'in yapamadiginda devreye iterator giriyor
		
		/*
		   for-loop kullanarak list'leri update etmek istemiyorum. for-each loop'da list'leri update edemiyor. 
		   Bu durumda for-loop kullanmadan list'leri update edebilmek icin iterator'lari kullaniriz.
		 */
		
		List<String>list2 = new ArrayList<>();
		list2.add("U");
		list2.add("V");
		list2.add("Y");
		list2.add("Z");
		System.out.println(list2);
		
		Iterator<String>it2 = list2.iterator(); //bir tane iterator olusturdum
//		
//		while(it2.hasNext()) { //[->U,V,Y,Z]
//			
//			String el = it2.next();
//			
//			System.out.print(el+" ");
//		}
		/*
		has next methodu pointer'a gider ve senden sonra eleman var mi diye sorar varsa true olur ve while calisir. 
		ve next methodu pointer'i bir sonraki elemanin onune atar ve ustunden atladgini yazdirir.
		en son z'nin onunde pointer z ninonunde yani eleman var ve true olur z.nin ustunden atlar z'yi yazdirir. 
		Son hamle hasnext pointer'a bakar ama pointer'dan sonra eleman yok ve loop kirilir.
		iterator index kullanmadan elemanlari birer birer yazdirir.
		 */
		 
System.out.println();

		
while(it2.hasNext()) { //[->U,V,Y,Z]
			
			it2.next();
			
			it2.remove();//atanan elemani siler
		}
		System.out.println(list2);
		
		List<String>list3 = new ArrayList<>();
		list3.add("K");
		list3.add("L");
		list3.add("M");
		System.out.println(list3);
		
		ListIterator<String> it3 = list3.listIterator();
		
		while(it3.hasNext()) {
			String el = it3.next();
			it3.set(el+"!");//list elemanlarini update eder
			it3.add(el); //list'e eleman ekler
		}
		System.out.println(list3);
		
		
		List<String>list4 = new ArrayList<>();
		list4.add("e");
		list4.add("f");
		list4.add("g");
		System.out.println(list4);
		
		ListIterator<String> it4 = list4.listIterator();
		
		//NOTE:hasPrevious ve previous() methodlarini kullanmadan once hasNext() ve next() methodlari ile pointer'i en saga yollamaliyiz.
		/*
		    Sadece son elemanin basina "+" koyunuz ve list elemanlarini sondan basa dogru yazdiriniz
		 */
		int counter=0;
		
		while(it4.hasNext()) {
			String el = it4.next();//pointer'i itecek sona dogru ve pointer loop sonunda en sagda olacak
			
			if(counter==2) {
		    	it4.set("*"+el);
		    }
			counter++;  
		}
		
		while(it4.hasPrevious()) { //burdan cikti alinmaz cunku loop calismadi. pointer previous'i olmadigindan pointer son elemana gitmeli loop calismasi icin
			
			String el = it4.previous();
			
			System.out.print(el+" "); //ustteki while loop pointer'i en saga goturunce bu loop calisti
		}
		
		//previous kullanmadan once hasnext ve next kullanilmali yoksa has previous calismaz
		
		
		/*
		   "iterator ile listIterator" in Farklari Nelerdir
		  
		   1-"iterator" sadece hasNext(), next() ve "remove() method'larini icerir
		     listIterator ise usttekilere ek olarak hasPrevious, pevious add set gibi bircok method'lari icerir.
		     listIterator daha fonksiyonel
		   
		   2-listiterator adindan da anlasilacagi gibi sadece list'ler icin kullanilir.
		     iterator ise list, map, set gibi diger collection'lar icin kullanilir.
		   
		   3-iterator kullanarak sadece bastan sona dogru seyahat edebilirsiniz (tek yonlu)
		     ama listiterator kullanirsaniz cift yonlu seyahat edebilirsiniz.
		     
		     
		 */
		
	
		
		
		
	}

}
