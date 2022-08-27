package day37collections;

import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {
		
		/*
		   LinkedList olusturalim
		 */

		LinkedList<Integer>ll1 = new LinkedList<>();
		ll1.add(3);
		ll1.add(2);
		ll1.add(0);
		ll1.add(1);
		ll1.add(33);
		System.out.println(ll1);//[3, 2, 0, 1]
		
		ll1.remove(2); //remove() metodunun icine integer koyarsaniz java her zaman onu index
		               //olarak kabul eder yani index'i 2 olan 0'i siler
		System.out.println(ll1);//[3, 2, 1]
		
		//ONEMLI: remove metodunun icinde olmayan bir index kullanirsaniz java indexOutOfBoundException throw eder
//		ll1.remove(33);// 
//		System.out.println(ll1);
		
		
		
		
	}

}
