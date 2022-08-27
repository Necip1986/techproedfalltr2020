package day22listforeachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlaytOdev01 {

	public static void main(String[] args) {
		/*
		   1) Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız. 
		 */
		List<String>ls1=new ArrayList<>();
		ls1.add("A");
		ls1.add("C");
		ls1.add("E");
		ls1.add("F");
		System.out.println(ls1);
		
		/*
		 * 2) İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
              İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
              ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
		 */
		ls1.add("B");
		ls1.add(1, "L");
		System.out.println(ls1);
		
		/*
		 * 3) set() methodu kullanarak, E’yi D yapınız.
              ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.
		 */
		ls1.set(3, "D");
		System.out.println(ls1);
		
		/*
		 * 4) remove() methodu kullanarak, F’yi siliniz.
              ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
		 */
		ls1.remove("F");
		System.out.println(ls1);
		
		/*
	      5) sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
             ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
		 */
		Collections.sort(ls1);
		System.out.println(ls1);
		
		/*
		 * 6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de
              var olmadığını doğrulayınız.
		 */
		System.out.println(ls1.contains("L"));
		System.out.println(ls1.contains("M"));
	}

}
