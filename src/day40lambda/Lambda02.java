package day40lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		kareCiftFunctional(list);
		System.out.println();
		
		kupTekFunctional(list);
		System.out.println();
		
		karekokCiftFunctional(list);
		
		enBuyukEleman(list);
		

	}
	
	//Cift sayi olan elemanlarin karesini ayni satirda aralarina bosluk birakarak
	//consola yazdiriniz
	
	public static void kareCiftFunctional(List<Integer>list) {
		
		list.stream().filter(Lambda01::isCift).map(t->t*t).forEach(Lambda01::printEl);
	}
	
	//Tek sayi olan elemanlarin kupunun 1 fazlasini ayni satirda aralarina bosluk birakarak
		//consola yazdiriniz
	
	public static void kupTekFunctional(List<Integer>list) {
		list.stream().filter(t->t%2!=0).map(t->t*t*t+1).forEach(Lambda01::printEl);
	}
	
	//Cift sayi olan elemanlarinin kare kokunu consola yazdiriniz
	
	public static void karekokCiftFunctional(List<Integer>list) {
		list.stream().filter(Lambda01::isCift).map(Math::sqrt).forEach(System.out::println);
	}
	
	//En buyuk elemani consola yazdirin
	
	public static void enBuyukEleman(List<Integer>list) {
		Optional<Integer> max=list.stream().reduce(Math::max); //java optional diyorsa tereddutsuz kabul edin problem yapmaz
		System.out.println(max);
	}

}
