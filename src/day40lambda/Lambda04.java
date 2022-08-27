package day40lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
	    list.add("Ali");
	    list.add("Mark");
	    list.add("Jackson");
	    list.add("Amanda");
	    list.add("Jackson");
	    list.add("Jackson");
	    list.add("Tucker");
	    list.add("Christ");
	    
	    buyukHarfSiraliTekrarsiz1(list);
	    System.out.println("==============");
	    buyukHarfSiraliTekrarsiz2(list);
	    System.out.println("=============");
	    karakterSayisiTekrarsiz(list);
	    System.out.println("\n===========");
	    charSayisinaGoreSirala(list);
	    System.out.println("======");
	    sonHarfReverseOrder(list);

	}
	
	//List elemanlarinin tamamini buyuk harfli olarak alfabetik sirada ve tekrarli elemanlari 
	//sadece bir kere consola yazdiriniz
	
	//Lambda expression
	public static void buyukHarfSiraliTekrarsiz1(List<String>list) {
		list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(System.out::println);
		
		//distinct metodu ayni elemanlari bir kere yazar
	}
	
	//Method reference
	public static void buyukHarfSiraliTekrarsiz2(List<String>list) {
		list.stream().map(String::toUpperCase).sorted().distinct().forEach(System.out::println);
	}

	//List elemanlarinin tamaminin karakter sayisini tekrarli elemanlari 
   //sadece bir kere olacak sekilde ters sirali olarak consola yazdiriniz
	public static void karakterSayisiTekrarsiz(List<String>list) {
		list.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::printEl);
	}
	
	//List elemanlarinin tamamini character sayisina gore kucukten buyuge consola yazdiriniz
	public static void charSayisinaGoreSirala(List<String>list) {
		list.stream().sorted(Comparator.comparing(t->t.toString().length())).forEach(System.out::println);
		
		//java'ya sirala uzunluga gore diyoruz
	}
	
	//List elemanlarinin tamamini son harflerine gore reverse Order olarak consola yazdiriniz
	public static void sonHarfReverseOrder(List<String>list) {
		list.stream().
		sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
		forEach(System.out::println);
	}

}
