package day37collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class LinkedHashSet01 {

	/*
	   LinkedHashSet'ler 
	   1-Tekrarli eleman kabul etmezler. (Set'ten dolayi)
	   2-Elemanlari ekleme sirasina(insertion order) gore dizerler.
	   3-LinkedHashSet HashSet'ten yavastir.
	 */
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("Ali");
		lhs1.add("Canan");
		lhs1.add("Veli");
		lhs1.add("Remziye");
		lhs1.add(null); //null'da kullaniliyor
		System.out.println(lhs1);//elemanlari ekleme sirasina gore diziyor. ONEMLI insertion order
		
		//daha once ogrendigimiz methodlar var yazmaya gerek yok
		
		Collection<Integer> obje=new HashSet<>();
		List<String> obje1=new ArrayList<>();
		Map<String,Integer>map=new HashMap<>();
		//Collection<String> obje3=new List<>();

	}

}
