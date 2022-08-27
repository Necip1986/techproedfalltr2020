package day36collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

	/*
	   1-LinkedList'te elemanlar 2 kisimdan olusur; data ve adres kisimlari
	   2-LinkedList'te elemanlarin yapisi farkli oldugundan "node" olarak adlandirilirlar.
	   3-LinkedList'lerde herzaman en basta "Head" vardir. Head sadece adres bolumunden olusur.
	     Head icin data bolumu yoktur.
	   4-LinkedList'lerde en son node "tail" olarak adlandirilir.
	   5-LinkedList'ler eleman ekleme ve silmede cok basarilidirlar. Fakat eleman bulmada basarisizdirlar.
	     Cunku index kullanmazlar
	 */
	public static void main(String[] args) {

		LinkedList<String>ll1=new LinkedList<>(); //data tip LinkedList'te olabilir. //data tipi linked list olunca addfirst ve addlast metodlari da cikar
		ll1.add("Ali"); //add metodu collection interface'sinden geliyor. List'teki add metodu abstract metoddur. Linkedlist ve arraylist kullaniyor.
                        //add metodunun child'larda body'leri farklidir.
		ll1.add("Veli");
		ll1.add("Emine");
		ll1.add("Beyhan");
		ll1.add("Ridvan");
		System.out.println(ll1); //ayni list'lerde oldugu gibi ekledi ve yazdirdi
		
		//silme ve eklemede basarili demistik o halde silme ve ekleme ile ilgili cok metod olmali
		//4 tane ekleme secenegi 4 tane de remove var
		ll1.add(1, "Kemal");
		System.out.println(ll1);
		
		List<String>ll2 = new ArrayList<>(); //constructor ArrayList olunca da ekledi
		ll2.add("XXX");
		ll2.add("YYY");
		
		ll1.addAll(ll2); //addAll metodunu tum collection'lar icin kullanabilirim
		System.out.println(ll1);//[Ali, Kemal, Veli, Emine, Beyhan, Ridvan, XXX, YYY] en sona ekledi
		
		//NOTE: addAll() linked list'e arraylist'ten gelen linkedlist'en gelen kisacasi tum collection'lardan
		//gelen elemanlari ekleyebilir.
		
		ll1.addAll(2, ll2);
		System.out.println(ll1);//[Ali, Kemal, XXX, YYY, Veli, Emine, Beyhan, Ridvan, XXX, YYY] araya ekledi

		ll1.addFirst("AAA");
		System.out.println(ll1); //basa ekledi
		
		ll1.addLast("BBB");
		System.out.println(ll1);//sona ekledi
		
		System.out.println("========");
		//remove metodlari
		ll1.remove(); //remove ilk elemani sildi yani herhangi bir parametre konmazsa ilk olan AAA sildi
		System.out.println(ll1);
		ll1.remove(); //bu sefer ali gitti ilk eleman
		System.out.println(ll1);
		
		ll1.removeFirst();// buda ilk elemani siler ama daha hizli siler. onemli hizli olmasi
		System.out.println(ll1);//kemal silindi
		
		System.out.println("====");
		System.out.println(ll1.remove(4)); //indexi 4 olan elemani bulur siler ve return eder
		                 //yani ll1.remove(4); syso icine koyarsak beyhani verir yani beyhani sildim diye rapor veriyor. emir tekrari buna return etmesi denir.
		System.out.println(ll1);//beyhan silindi
		
		//remove("YYY") methodu ilk YYY'yi siler ve rapor verir yani remove("YYY")'i syso nun icine koyarsam true return eder
		//olmayan bir eleman yazip onu syso nun icine koyarsam false return eder yani java baktim yoktu silemedim der
		//sislinmesi istenen eleman list'te yoksa false return eder varsa siler ve true return eder.
		ll1.remove("YYY"); //Bundan iki tane var o zaman ilkini siler
		System.out.println(ll1);//ilk YYY silindi arkada break; var ilkini silince durur devamina bakmaz
		
		ll1.removeFirstOccurrence("XXX"); //ilk gorunusu sil demek yani ilk XXX'i sil demek
		System.out.println(ll1);//ilk XXX gitti java soldan okur
		
		ll1.add(5,"Ridvan");
		System.out.println(ll1);
		ll1.removeLastOccurrence("Ridvan");//Ridvan in son gorunusu silinir
		System.out.println(ll1); //son Ridvan silindi
		
		ll1.removeLast();//en sondaki elemani siler
		System.out.println(ll1);//BBB imha edildi son eleman silindi
		
		ll1.add(2, "Veli");
		ll1.add(4, "Veli");
		System.out.println(ll1);
		//ll1.replaceAll("Veli");//removeAll metodu sizden collection ister eleman degil yani Veli yazinca CTE verir . addAll metodu gibi calisir
	
		LinkedList<String>ll3 = new LinkedList<>();
		ll3.add("Veli");
		
		//****removeAll cok kullanilir bilmek lazim
		ll1.removeAll(ll3);//bu method ll3 icindeki elemanlari ll1 icinden siler yani tum veliler silinir
		System.out.println(ll1);//tum Veliler silindi.
		
		
		//containAll() metodu
		LinkedList<String>ll4 = new LinkedList<>();
		ll4.add("Emine");
		ll4.add("XXX");
		
		System.out.println(ll1.containsAll(ll4)); //true verir cunku emine ve xxx ll1 de var
		ll4.add("MMM");
		System.out.println(ll1.containsAll(ll4));//false verir cunku mmm ll1'de yok
		
		ll1.get(1);//index'i 1 olan elemani getirir
		System.out.println(ll1.get(1));//Ridvani dondurur
		//normalde linked list'ler index kullanmaz ama burda linked list list'e cevirilip oyle calisiyor.
		
		ll1.iterator(); //bu iterator butun collection'larda kullanilir
		

		
	}

}
