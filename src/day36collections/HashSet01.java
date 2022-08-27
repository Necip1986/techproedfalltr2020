package day36collections;

import java.util.HashSet;

public class HashSet01 {
    
	//Set'lerin icinde tekrarli eleman olmaz tum setler icin gecerli bir kural
	//Hash tekrarsiz kod uretme teknigi'dir. HashSet java her eleman icin unique bir kod uretir. 
	
	/*
	   1-Tekrarli elemana musaade edilmez. Buraya konulan her eleman unique olmali tc no gibi...
	     Set'lerin icinde bir eleman sadece 1 kere kullanilabilir. 
	   2-Hashset'ler set'ler arasinda en hizli olanidir. Hizli olmak biraz sade olmaya baglidir. Java hizli olani basit yapar yani basit olan hizlidir.
	   3-Hashset elemanlari siralamak ile ugrasmaz. Elemanlari rastgele dizer. ve daha hizli hareket eder.
	   4-HashSet "null" object'ini eleman olarak kullanabilir.
	     note:4 tane null koyabilir miyim hayir cunku tekrar olmamali
	     note:tekrarli eleman istenmiyorsa sira onemli degil ve hiz onemli ise HashSet kullanilabilir.
	 */
	public static void main(String[] args) {
		
		HashSet<String>hs1 = new HashSet<>();
		hs1.add("ali"); //add metodu demekki collection'da cunku hem list hem set kullaniyor.
		hs1.add("veli");
		hs1.add("veli"); //CTE ve RTE vermedi ama tekrarli elaman olmadi ustune yazdi ONEMLI
		hs1.add("null");
		System.out.println(hs1); //siralama yapmadan ekliyor siralama onemli degildir. bu yuzden hizidir.
		
		//java her data icin hashing teknigini kullanarak bir kode uretir. Bu kodu almak icin hashCode methodu kullanilir.
		System.out.println(hs1.hashCode());//hashcode uretti
		

	}

}
