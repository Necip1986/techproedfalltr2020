package day37collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	/*
	   Elemanlar en sona eklenir ve en bastan silinir. Bu sisteme FIFO denir (first in first out)
	   Eczaneler, yemekhaneler
	 */
	public static void main(String[] args) {
		
		/*
		 priorityQueue kullanarak Queue uretirseniz, Java kendisi bir priority kurali uretir
		 
		 ve urettigi bu kurala gore elemanlari dizer. Istersek biz kendi priority kuralimizi uretip elemanlari
		 bu kurala gore dizebiliriz.
		
		 */
		
		Queue<String>q1 = new PriorityQueue<>();//obje uretilmez queue'den
		q1.add("Milk"); //add metodu collection'dan override edilmis parent ta var
		q1.add("Cheese");
		q1.add("Water");
		q1.add("Oil");
		q1.add("Meat");
		System.out.println(q1); //[Cheese, Meat, Water, Oil, Milk]
		System.out.println(q1.element());
		//peek() metodu ilk elemani silmeden bize return eder. copy paste gibi
		
		System.out.println(q1.peek()); //ilk elemani verdi
		System.out.println(q1); //Cheese yerinde duruyor silmedi
		
		//poll() metodu ilk elemani queue'den siler ve bize return eder. cut paste gibi
		System.out.println(q1.poll()); //cheese'verir ama siler 
		System.out.println(q1);
		
		//offer() metodu: teklif etmek demektir.  Eleman eklemek icin kullanilir. add metodu gibi. Eleman siniri
		//konulmus queue'larda eleman ekleme istenirse offer() kullanilabilir.
		q1.offer("Coke"); //add gibi ekleme yapiyor. kola eklemeyi teklif ediyor
		System.out.println(q1);
		
		
		Queue<String>q2=new LinkedList<>(); //linkedlist elemanlari sona ekler ve queue,nin ozelliklerini kullanabilir
		q2.add("Bread");
		q2.add("Sugar");
		q2.add("Rice");
		q2.add("Bean");
		q2.add("Salt");
		System.out.println(q2);//linkedList ilk eklenen ilk sirada son eklenen son sirada
		
		//q2.remove();
		System.out.println(q2);//ilk eleman silindi bread silindi ilk giren ilk silindi
		q2.poll();//buda ilk elemani siler aynidir remove gibi
		System.out.println(q2); //
		System.out.println("=============");
		q2.clear();
		System.out.println(q2.element());
		q2.poll();//bu rte vermez null verir
		//q2.remove(); //NoSuchElementException throw eder
		System.out.println(q2);//[] verir null verir
		//bunlar poll ve remove farkidir.
		
		/*NOTE: 
		  remove metodu ve poll metodu ilk elemani siler ve return eder.
		  ama collection'da eleman yoksa remove metodu exception atar. poll metodu
		  exception atmaz null return eder.
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
