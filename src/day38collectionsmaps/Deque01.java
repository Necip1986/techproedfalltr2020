package day38collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 { 

	/*
	   1-Double Ended Queue (Deque); iki uclu Queue'ler icin kullanilir. 
	     Normal Queue'lerde FIFO gecerli, Deque'lerde hem FIFO hem de LIFO 
	     (Last in First out) gecerlidir.
	 */
	
	public static void main(String[] args) {
		
		Deque<String>dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Veli");
		dq1.add("Aydin");
		dq1.add("Merve");
		dq1.add("Kadriye");
		System.out.println(dq1); //linked list oldugundan insertion order ile ekleme yapar
		
		dq1.getFirst();
		System.out.println(dq1.getFirst());//Ali verir ekrana ilk eleman copy paste gibi calisir.
		
		dq1.getLast();
		System.out.println(dq1.getLast());//son eleman kadriye'yi verir
		
		dq1.peekFirst();//peekfirst metodu ilk elemani veriyordu getfirst gibi calisir.
		System.out.println(dq1.peekFirst());//ali yi verir
		
		System.out.println(dq1.peekLast());//son eleman kadriye'yi verir
		
		/*
		   Note: getFirst() ve peekFirst() metodlarinin ikisi de ilk elemani silmeden
		   return eder. Fakat getFirst() bos deque'lerde kullanildiginda NoSuchElementException atar
		   peekFirst ise exception atmaz "null" return eder.
		   
		   Yukaridaki kural getLast ve peekLast metodlari icinde gecerlidir.
		 */
		
		//dq1.clear();
		//System.out.println(dq1.peekFirst()); //null verir
		//System.out.println(dq1.getFirst());//NoSuchElementException atar
		
		System.out.println(dq1.pollFirst());//consola ali verdi ve sildi
		System.out.println(dq1);//ali silindi
		
		System.out.println(dq1.pollLast());//son elemani verir kadriye ve siler
		System.out.println(dq1);//kadriye silindi
		
		

	}

}
