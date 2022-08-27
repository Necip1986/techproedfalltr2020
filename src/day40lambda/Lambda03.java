package day40lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(-13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(-12);
		list.add(15);
		
		ciftKareMax(list);
		toplamElemanlar(list);
		toplamElemanlar2(list);
		
		ciftCarpimElemanlar(list);
		ciftCarpimElemanlar2(list);
		
		min1(list);
		min2(list);
		min3(list);
		min4(list);
		
		ondanKucukMax(list);
		
		tekKupSirala(list);
		System.out.println();
		
		ciftKareSirala(list);
		
		//reduce metodu bir sayi dondurur onu uygun bir variable'a atamaliyim.

	}
	
	//List'teki cift sayi olan elemanlarin karelerini aliniz en buyuk olanini consola yazdiriniz
	
	public static void ciftKareMax(List<Integer> list) {
		Optional<Integer> max=list.stream().filter(Lambda01::isCift).map(t->t*t).reduce(Integer::max);
		System.out.println(max); //reduce metodu bir elemana yogunlasip onu verir bize. yani bir suru eleman var birini verir bize
	}
	
	//List'teki tum elemanlarin toplamini consola yazdiriniz
	//Lambda expression ile
	
	public static void toplamElemanlar(List<Integer>list) {
		int toplam=list.stream().reduce(0,(x,y)->x+y);
		System.out.println(toplam);
		
		//x'in ilk degeri 0 olur daha sonra degeri hep reduce'un sonucu olur
		//y ise ilk degeri stream'dan alir ve ard arda devam eder almaya
	}
	
	//list'teki cift sayi olan elemanlarin carpimini consola yazdiriniz
	
	public static void ciftCarpimElemanlar(List<Integer>list) {
		int ciftcarpim=list.stream().filter(Lambda01::isCift).reduce(1,(x,y)->x*y);
		System.out.println(ciftcarpim);
	}
	
	//Method reference ile
	//List'teki tum elemanlarin toplamini consola yazdiriniz
	public static void toplamElemanlar2(List<Integer>list) {
		Optional<Integer> toplam=list.stream().reduce(Integer::sum);
		System.out.println(toplam);
	}
	
	////list'teki cift sayi olan elemanlarin carpimini consola yazdiriniz
	public static void ciftCarpimElemanlar2(List<Integer>list) {
		Optional<Integer> ciftcarpim=list.stream().filter(Lambda01::isCift).reduce(Math::multiplyExact);
		System.out.println(ciftcarpim);
	}
	
	//List'teki elemanlardan en kucugunu 4 farkli yol kullanarak bulalim
	//1. yol:Method reference ==>methodlari java'dan al
	
	public static void min1(List<Integer>list) {
		Optional<Integer> min=list.stream().reduce(Integer::min);
		System.out.println(min);
	}
	
	//2. yol:Method reference ==>methodlari java'dan al
	
		public static void min2(List<Integer>list) {
			Optional<Integer> min=list.stream().reduce(Math::min);
			System.out.println(min);
		}
	//3.Yontem:Method reference===>method'lar kendimiz olusturuyoruz
		
		public static int minBul(int x,int y) {
			return x<y?x:y;	
		}
		public static void min3(List<Integer>list) {
			Optional<Integer> min=list.stream().reduce(Lambda03::minBul);
			System.out.println(min);
		}
	  
		  
	//4.yontem:Lambda expression
		
		public static void min4(List<Integer>list) {
			int min=list.stream().reduce(Integer.MAX_VALUE, (x,y)->x<y?x:y);
			System.out.println(min);
		}
		
		//ODEV:en buyugunu 4 farkli yol ile bulunuz
		
		//List'teki elemanlardan 10'dan kucuk en buyuk sayiyi bulunuz
		
		public static void ondanKucukMax(List<Integer>list) {
			Optional<Integer> max=list.stream().filter(t->t<10).reduce(Integer::max);
		System.out.println(max);
		}
		
		//List'teki elemanlardan tek sayi olanlarin kuplerini kucukten buyuge siralayiniz
		
		public static void tekKupSirala(List<Integer>list) { //method ismi fonksiyonunu ozetlemeli
			
			list.stream().filter(t->t%2!=0).map(t->t*t*t).sorted().forEach(Lambda01::printEl);
		}
		
		//List'teki elemanlardan cift sayi olanlarin karelerini buyukten kucuge consola yazdiriniz
		
		public static void ciftKareSirala(List<Integer>list) {
			list.stream().filter(Lambda01::isCift).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(Lambda01::printEl);
		}
	
}
