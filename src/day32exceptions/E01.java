package day32exceptions;

public class E01 {
	//java'nin memory'deki bir seyi silmeden once posetlemesi finalize'dir.
	
	/*
	    Garbage Collector
	    1-Garbage Collector surekli memory'i kontrol eder silinmesi gereken herhangi bir data varsa memory'i temiz
	      tutmak icin o data'yi siler. Ama data'yi silmeden once "finalize" eder.
	      finalize etmek icin finalize() metodunu kullanir. Bu methodun ne zaman calisacagina java karar verir.
	      Siz kod yazarken isterseniz, finalize methodunu cagirabilirsiniz, ama siz cagirsanizda ne zaman calisacagina
	      java karar verir. Java aktive eder.
	      
	    2-final, finally ve finalize aciklar misiniz?
	      final(keyword) ==> final method everride edilemez. Final variable degeri degistirilemez. final class child class sahibi olamaz.
	      finally(code block)==> try-catch block'tan sonra kullanilir ve Exception atilsa da atilmasa da calisir.
	      finalize(method)==> Garbage Collector bir data'yi imha etmeden once calistirir
	 */

	public static void main(String[] args) {
		

		
	}

}
