package day03ifstatement;

public class Comparators {

	public static void main(String[] args) {
		//comparator: karsilastirma islemleri
		//javada 2 variable in degeri karsilastirildiginda java sonuc olarak boolean return eder.
		//yani; karsilastirma yaptiginizda java size ya true ya da false der.
		
		System.out.println(5 > 3); //true
		System.out.println(5 < 3); // variable olusturmadan da sonuc verir
		
		//matematikte esittir demek icin 1 tane esittir sembolu yeter ama java da esittir demek icin "==" yazmak gerekir.
		System.out.println(5 == 3); //== arasina bosluk konmaz == olmali
		
		System.out.println(5 <= 5); //iki sembol kullanildiginda sembollerden birisi true oluyursa java true verir. < false ama 5=5 true
		
		System.out.println(5 >= 3); // 5>3 true ama 5=3 false sonuc true olur
		
		System.out.println(5 !=3 ); // != esit degil isareti
		
	

	}

}
