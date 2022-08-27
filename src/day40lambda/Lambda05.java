package day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lambda05 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        ciftLenghtSqrTekrarsizReverse(list);
        System.out.println();
        harfSayisi7denFazla(list);
        ilkHarfX(list);
        enAz1r(list);
        harfSayisiReverseIlk(list);
        harfSayisiReverseIlk2(list); //stream yazdirmadi reference yazdirir
        sonHarfSortSonEleman(list);
        sonHarfSortIlkHaricEl(list); //amanda haric yazdirdi

	}
	
	//Karakter sayilari cift sayili elemanlarin karakter sayilarinin karelerini hesaplayan, tekrarli olanlari sadece 1 kere buyukten
	//kucuge dogru yazdiran bir program yaziniz
	
	public static void ciftLenghtSqrTekrarsizReverse(List<String>list) {
		list.
		stream().
		filter(t->t.length()%2==0).
		map(t->t.length()*t.length()).
		distinct().
		sorted(Comparator.reverseOrder()).
		forEach(Lambda01::printEl);
	}
	
	//Tum isimlerin 7 veya 7'den az harf icerdigini gosteren programi yaziniz
	//*****allmatch hepsi uyar neye benim yazacagim kurala//test sahasinda bu method cok kullanilir
	public static void harfSayisi7denFazla(List<String>list) {
		boolean result=list.stream().allMatch(t->t.length()<=7);//boolean return eder hepsi iceride yazan sarta uyuyor mu uymuyor mu
	 
		if(result) {
			System.out.println("Tum elemanlar 7 veya 7'den az harf icerir");
		}else {
			System.out.println("En az bir eleman 7 veya 7'den az harf icermiyor");
		}
	}
	
	//Hicbir elemanin "X" ile baslamadigini gosteren programi yaziniz.
	//nonMatch buda boolean return eder
	
	public static void ilkHarfX(List<String>list) {
		boolean result=list.stream().noneMatch(t->t.startsWith("X")); //hic bir eleman icerideki sarta uymasin anlamina gelir
	
		if(result) {
			System.out.println("Hicbir eleman 'X' ile baslamiyor");
		}else {
			System.out.println("En az bir eleman X ile basliyor");
		}
	}
	
	//en az bir elemanin "r" ile bittigini gosteren programi yaziniz
	//anyMatch yine boolean return eder
	
	public static void enAz1r(List<String>list) {
		boolean result=list.stream().anyMatch(t->t.endsWith("r"));
		
		if(result) {
			System.out.println("En az bir eleman r ile bitiyor");
		}else {
			System.out.println("Hicbir eleman r ile bitmiyor");
		}
		
	}
	
	//isimleri karakter sayilarina gore buyukten kucuge dizdikten sonra ilk ismi ekrana yazdiriniz
	//findFirst metodu
	public static void harfSayisiReverseIlk(List<String>list) {
		Optional<String> ilkIsim=list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst();
		System.out.println(ilkIsim);
	}
	
	public static void harfSayisiReverseIlk2(List<String>list) {
		System.out.println("======");
		Stream<String> ilkIsim=list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
		System.out.println(ilkIsim);
		//streamler ekrana direk yazdirilamiyor. streamler list te cevrilmiyor array'e olur
		System.out.println(Arrays.toString(ilkIsim.toArray()));
		//stream'i yazdirmak icin sadece array kullanilir
	}
	
	//Isimleri son harflerine gore siraladiktan sonra son ismi ekrana yazdiriniz
	
	public static void sonHarfSortSonEleman(List<String>list) {
		Optional<String>sonIsim=list.
		                             stream().
		                                      sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).
		                                      reversed()).
		                             findFirst();
		System.out.println(sonIsim);
	}
	
	////Isimleri son harflerine gore siraladiktan sonra ilk isim 
	//haric digerlerini ekrana yazdiriniz
	
	public static void sonHarfSortIlkHaricEl(List<String>list) {
		list.
		stream().
		sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1))).
		skip(list.size()-1). //son elemani verir
		forEach(System.out::println);
	}

}
