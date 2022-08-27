package day40lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

	/*
	   1-Lambda "Functional Programming" (metod kullanma programlama dili demektir-surekli metod kullanilacak)
	     Lambda metod bulup kullanmaktir. Boylece hizli kod yazilir. Hiz kodun kisaligi ve guvenilirlik acidan lambda iyidir.
	     "Functional Programming" de "Nasil yaparim" degil "Ne yaparim" dusunulur.
	     
	   2-Structured Programming" de "Ne yaparim" dan cok "Nasil yaparim" dusunulur. (Bizim su ana kadar yaptigimiz)
	   3-"Functional Programming" hiz, kod kisaligi, kod okunabilirligi ve hatasiz 
	      kod yazma olarak cok faydalidir.
	      
	   4-Lambda sadece collection'larda(list, queue ve set) ve Array'lerde kullanilabilir.
	 */
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
		
		 printElStructured(list);
		 
		 printElFunctional1(list);
		 
		 printElFunctional2(list);
		 
		 printElFunctional3(list);
		 System.out.println();
		 
		 ciftYazdir(list);
		 System.out.println();
		 
		 printCiftElFunctional1(list);
		 System.out.println();
		 
		 printCiftElFunctional2(list);
		 System.out.println();
		 
		 ondanKucukTek(list);
		 
		 System.out.println();
		 ondanKucukCift(list);
		 

	}
	//Structured Programming ile List elemanlarinin tamamini ayni satirda aralarina bosluk birakarak consola yazdiriniz

	public static void printElStructured(List<Integer> list) {//list'i parametre olarak aldi
		
		for(Integer w:list) {
			System.out.print(w+" ");
		}
		System.out.println();
	}
	//Functional Programming ile List elemanlarinin tamamini ayni satirda aralarina bosluk birakarak consola yazdiriniz
	//1. yol: Lambda Expression
	public static void printElFunctional1(List<Integer> list) {
		list.stream().forEach(t->System.out.print(t+" "));//herbiri icin okun sag tarafindaki isi yap demek for each
		                                                  //parantezin icine lambda expression denir (lambda kodu)
		//stream(); onemli  
		System.out.println();//lambda expression cok tavsiye edilmez

	}
	
	//2. yontem: Method reference: bu cok kullanilir. (method cagirma)
	//kendi olusturdugum method ile ==>"Class ismi::Metod ismi" method reference kalibi
	public static void printEl(int t) {
		
		System.out.print(t+" ");	
	}
	public static void printElFunctional2(List<Integer> list) {
		list.stream().forEach(Lambda01::printEl); //parantez ici method reference kalibi
	
	System.out.println();
	}
	
	//Method reference Java'nin olusturdugu method'lar ile
	public static void printElFunctional3(List<Integer> list) {
		list.stream().forEach(System.out::print); //bunu kullanarak aralarina bosluk birakamiyoruz
	}
	
	//Structured Programming ile cift sayi olan List elemanlarinin tamamini ayni satirda aralarina bosluk 
	//birakarak consola yazdiriniz
	
	public static void ciftYazdir(List<Integer> list) {
		for(Integer w: list) {
			if(w%2==0) {
				System.out.print(w+" ");
			}
		}
	}
	
	//Functional Programming ile cift sayi olan List elemanlarinin tamamini ayni satirda aralarina bosluk 
   //birakarak consola yazdiriniz
  //Lambda expresion ile
	public static void printCiftElFunctional1(List<Integer> list) {
		list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
	}
	
	//method reference: kendi methodum ile
	public static boolean isCift(int t) {
		return t%2==0;
	}
	public static void printCiftElFunctional2(List<Integer> list) {
		list.stream().filter(Lambda01::isCift).forEach(Lambda01::printEl);
	}
	
	//Functional Programming ile ondan kucuk ve tek sayi olan List elemanlarinin tamamini ayni satirda aralarina bosluk 
	   //birakarak consola yazdiriniz
	
	//lambda expression ile
	public static void ondanKucukTek(List<Integer> list) {
		list.stream().filter(t->t<10 && t%2==1).forEach(t->System.out.print(t+" "));
	}
	
	//Functional Programming ile ondan kucuk veya cift sayi olan List elemanlarinin tamamini ayni satirda aralarina bosluk 
	   //birakarak consola yazdiriniz
	
	public static void ondanKucukCift(List<Integer>list) {
		list.stream().filter(t->t<10 || t%2==0).forEach(Lambda01::printEl);
	}
	

}
